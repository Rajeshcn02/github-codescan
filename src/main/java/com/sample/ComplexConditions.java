package com.sample;

public class ComplexConditions {

    int id = 0;
    String name = "dummy";
    String description = "false";
    boolean isValid = false;

    public ComplexConditions() { }

    public ComplexConditions(int id, String name, String description, boolean isValid) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.isValid = isValid;
    }

    public String hello() {
        if(id == 0 && name == "dummy" && Boolean.valueOf(description) == false && isValid) {
            return "it will work all fine";
        }else if(id == 0 && name == "dummy" && Boolean.valueOf(description) == true && isValid) {
            return "how come description is true?";
        }else if(id == 0 && name == "dummy" && Boolean.valueOf(description) == false && !isValid) {
            return "it has to be valid for me to work";
        }

        return null;
    }

}