package com.company;

public class Drinker {
    private String gender;
    private double mass;
    private int myQuantity=0;
    private double currentAmountOfAlcohol=0;


    public Drinker(String gender, double mass) {
        if(gender.toLowerCase().equals("man")||gender.toLowerCase().equals("woman")) {
            this.gender = gender.toLowerCase();
        }else{
            System.out.println("Wrong gender");
        }
        this.mass = mass;
    }

    public int getMyQuantity() {
        return myQuantity;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    double drink (int quantity, Alcohol alcohol){

        double density=0.79; //g/ml
        double genderFactor; //0.7 man, 0.6 woman
        if(gender.equals("man")){
            genderFactor=0.7;
        }else{
            genderFactor=0.6;
        }
        return (quantity*alcohol.getPercentage()*density)/(mass*genderFactor);

    }

    double drink2 (int quantity, Alcohol alcohol){

        double density=0.79; //g/ml
        double genderFactor; //0.7 man, 0.6 woman
        veryImportantMethod(quantity);
        if(gender.equals("man")){
            genderFactor=0.7;
        }else{
            genderFactor=0.6;
        }
        currentAmountOfAlcohol=currentAmountOfAlcohol+quantity*alcohol.getPercentage();
        return (currentAmountOfAlcohol*density)/(mass*genderFactor);

    }
    void veryImportantMethod(int quantity){
        //great code goes here
        myQuantity=myQuantity+quantity;

    }

}
