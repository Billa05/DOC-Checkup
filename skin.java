package com.company;

public class skin extends organs{
   private String condition;
   private String color;

    public skin(String name, String medicalCondition, String condition, String color) {
        super(name, medicalCondition);
        this.condition = condition;
        this.color = color;
    }

    @Override
    public void getdetails() {
        super.getdetails();
        System.out.println("condition of the skin: " + getCondition());
        System.out.println("Color of skin: " + getColor());
    }

    public String getCondition() {
        return condition;
    }

    public String getColor() {
        return color;
    }

}
