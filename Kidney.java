package com.company;

public class Kidney extends organs{
    private String bothkidneys;
    private String Transplanted;

    public Kidney(String name, String medicalCondition, String bothkidneys, String transplanted) {
        super(name, medicalCondition);
        this.bothkidneys = bothkidneys;
        Transplanted = transplanted;
    }

    @Override
    public void getdetails() {
        super.getdetails();
        System.out.println("Both kidneys are: " + getBothkidneys());
        System.out.println("Transplanted?: " + getTransplanted());
    }

    public String getBothkidneys() {
        return bothkidneys;
    }

    public String getTransplanted() {
        return Transplanted;
    }

}
