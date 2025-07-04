package com.bryan.apidemo;

import java.util.List;
import java.util.Objects;

public class SoftwareEngineer {
    private Integer Id;
    private String name;
    private String techStack;

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SoftwareEngineer that = (SoftwareEngineer) o;
        return Objects.equals(Id, that.Id) && Objects.equals(name, that.name) && Objects.equals(techStack, that.techStack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, name, techStack);
    }
}
