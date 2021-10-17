package com.company;

public class organs {
     private String name;
     private String medicalCondition;

    public organs(String name, String medicalCondition) {
        this.name = name;
        this.medicalCondition = medicalCondition;
    }

    public void getdetails(){
        System.out.println("Name: " + this.name);
        System.out.println("Medical condition: "+ this.medicalCondition);
    }

    public String getName() {
        return name;
    }

}
