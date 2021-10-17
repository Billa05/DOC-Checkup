package com.company;

public class patient {
    private String name;
    private int age;
    private Eye lefteye;
    private Eye righteye;
    private Heart heart;
    private Kidney kidney;
    private stomach stomach;
    private skin skin;

    public patient(String name, int age, Eye lefteye, Eye righteye, Heart heart, Kidney kidney, com.company.stomach stomach, com.company.skin skin) {
        this.name = name;
        this.age = age;
        this.lefteye = lefteye;
        this.righteye = righteye;
        this.heart = heart;
        this.kidney = kidney;
        this.stomach = stomach;
        this.skin = skin;
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }


    public Eye getLefteye() {
        return lefteye;
    }


    public Eye getRighteye() {
        return righteye;
    }


    public Heart getHeart() {
        return heart;
    }


    public Kidney getKidney() {
        return kidney;
    }


    public com.company.stomach getStomach() {
        return stomach;
    }


    public com.company.skin getSkin() {
        return skin;
    }

}
