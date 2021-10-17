package com.company;

public class stomach extends organs{

    private boolean isfull;

    public stomach(String name, String medicalCondition, boolean isfull) {
        super(name, medicalCondition);
        this.isfull = isfull;
    }

    public boolean isIsfull() {
        return isfull;
    }

    public void setIsfull(boolean isfull) {
        this.isfull = isfull;
    }

    public void digest(){
        System.out.println("Trying to Digest");
    }

    @Override
    public void getdetails() {
        super.getdetails();
        if (this.isIsfull()) {
            System.out.println("Need to be feed");
        }else {
            System.out.println("Stomach is full");
        }
    }
}
