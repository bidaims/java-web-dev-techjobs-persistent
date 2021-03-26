package org.launchcode.javawebdevtechjobspersistent.models;

import javax.validation.constraints.NotBlank;

public class Skill extends AbstractEntity {
    @NotBlank(message="Field cannot be left blank")
    private String description;

    public Skill(){}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}