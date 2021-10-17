package com.company;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
      patient patient = new patient("Biresh",16,
              new Eye("Left eye", "Short sighted", "Brown", true),
              new Eye("Right eye", "Normal", "Brown", true),
              new Heart("Heart", "Normal", 75),
              new Kidney("Kidney", "Normal", "working","No"),
              new stomach("Stomach", "Normal", false),
              new skin("Skin", "Rashes", "Rough","White"));

        System.out.println("Name: " + patient.getName());
        System.out.println("Age: " + patient.getAge());

        Scanner scanner = new Scanner(System.in);

        boolean shouldfinish = false;
        while (!shouldfinish){
            System.out.println("Choose an organ:" +
                    "\n\t1. Left eye"+
                    "\n\t2. Right eye"+
                    "\n\t3. Heart"+
                    "\n\t4. Kidney"+
                    "\n\t5. Stomach"+
                    "\n\t6. Skin"+
                    "\n\t7. Recent surgery"+
                    "\n\t8. Quit");

            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    patient.getLefteye().getdetails();
                    if (patient.getLefteye().isIsopened()){
                        System.out.println("\t\t1. Close the eye");
                        if (scanner.nextInt() == 1){
                            patient.getLefteye().close();
                        }else {
                            continue;
                        }
                    }else {
                        System.out.println("\t\t1. Open the eye");
                        if (scanner.nextInt() == 1){
                            patient.getLefteye().open();
                        }else {
                            continue;
                        }
                    }
                    break;

                case 2:
                    patient.getRighteye().getdetails();
                    if (patient.getRighteye().isIsopened()){
                        System.out.println("\t\t1. Close the eye");
                        if (scanner.nextInt() == 1){
                            patient.getRighteye().close();
                        }else {
                            continue;
                        }
                    }else {
                        System.out.println("\t\t1. Open the eye");
                        if (scanner.nextInt() == 1){
                            patient.getRighteye().open();
                        }else {
                            continue;
                        }
                    }
                    break;

                case 3:
                    patient.getHeart().getdetails();
                    System.out.println("\t\t1. What should be the heart rate?");
                    if (scanner.nextInt() == 1){
                        System.out.println("Enter a new heart rate: ");
                        int newheartrate = scanner.nextInt();
                        patient.getHeart().setHeartrate(newheartrate);
                        System.out.println("Heart rate changed to: " + patient.getHeart().getHeartrate());
                    }else {
                        continue;
                    }
                    break;

                case 4:
                    patient.getKidney().getdetails();
                    break;

                case 5:
                    patient.getStomach().getdetails();
                    System.out.println("\t\t1. Digest");
                    if (scanner.nextInt() == 1){
                        patient.getStomach().digest();
                    }else {
                        continue;
                    }
                    break;

                case 6:
                    patient.getSkin().getdetails();
                    break;

                case 7:
                    System.out.println("Yes");
                    break;

                default:
                    System.out.println("Do I need to come and meet in person for a checkup??");
                    String DOC = scanner.next();
                    shouldfinish = true;
                    break;
            }
        }
    }
}
