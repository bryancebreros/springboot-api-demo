package com.bryan.apidemo;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class SoftwareEngineerService {
    private final SoftwareEngineerRepository softwareEngineerRepository;
    private final AiService aiService;

    public SoftwareEngineerService(SoftwareEngineerRepository softwareEngineerRepository, AiService aiService) {
        this.softwareEngineerRepository = softwareEngineerRepository;
        this.aiService = aiService;
    }

    public Optional<SoftwareEngineer> getSoftwareEngineerById(Integer id) {
        return softwareEngineerRepository.findById(id);
    }

    public List<SoftwareEngineer> getAllSoftwareEngineers() {
        return softwareEngineerRepository.findAll();
    }

    @PostMapping
    public void insertSoftwareEngineer(@RequestBody SoftwareEngineer softwareEngineer){
        String prompt = """
                Based on the programming tech stack %s that %s has given.
                Provide a full learning path and recommendations for this person
                """.formatted(softwareEngineer.getTechStack(), softwareEngineer.getName());
        String chatRes = aiService.chat(prompt);
        softwareEngineer.setLearningPathRecommendation(chatRes);
        softwareEngineerRepository.save(softwareEngineer);
    }
}
