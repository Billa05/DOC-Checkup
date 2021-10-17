package com.company;

import java.util.Scanner;

public class Heart extends organs{
    private int heartrate;

    public Heart(String name, String medicalCondition, int heartrate) {
        super(name, medicalCondition);
        this.heartrate = heartrate;
    }

    @Override
    public void getdetails() {
        super.getdetails();
        System.out.println("Heart rate: " + getHeartrate());
    }

    public int getHeartrate() {
        return heartrate;
    }

    public void setHeartrate(int heartrate) {
        this.heartrate = heartrate;
    }
}
