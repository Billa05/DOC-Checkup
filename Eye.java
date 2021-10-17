package com.company;

public class Eye extends organs{

    private String color;
    private boolean isopened;

    public Eye(String name, String medicalCondition, String color, boolean isopened) {
        super(name, medicalCondition);
        this.color = color;
        this.isopened = isopened;
    }

    @Override
    public void getdetails() {
        super.getdetails();
        System.out.println("color:  " + this.getColor());
    }

    public void open(){
        this.setIsopened(true);
        System.out.println(this.getName() + " opened");
    }
    public void close(){
        this.setIsopened(false);
        System.out.println(this.getName() + " closed");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isIsopened() {
        return isopened;
    }

    public void setIsopened(boolean isopened) {
        this.isopened = isopened;
    }
}
