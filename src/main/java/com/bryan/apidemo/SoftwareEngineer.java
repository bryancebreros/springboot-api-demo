package com.bryan.apidemo;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
public class SoftwareEngineer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String name;
    private String techStack;
    @Column(columnDefinition = "TEXT")
    private String learningPathRecommendation;

    public SoftwareEngineer(String learningPathRecommendation) {
        this.learningPathRecommendation = learningPathRecommendation;
    }


    public String getLearningPathRecommendation() {
        return learningPathRecommendation;
    }

    public void setLearningPathRecommendation(String learningPathRecommendation) {
        this.learningPathRecommendation = learningPathRecommendation;
    }



    public SoftwareEngineer(){}

    public SoftwareEngineer(Integer Id, String name, String techStack) {
        this.Id = Id;
        this.name = name;
        this.techStack = techStack;


    }

    public String getTechStack() {
        return techStack;
    }

    public void setTechStack(String techStack) {
        this.techStack = techStack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public SoftwareEngineer(Integer id) {
        Id = id;
    }
}
