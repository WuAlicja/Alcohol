package com.company;

public class Alcohol {
    private String alcoholName;
    private double percentage;

    public Alcohol(String alcoholName, double percentage) {
        this.alcoholName = alcoholName;
        this.percentage = percentage;
    }

    public String getAlcoholName() {
        return alcoholName;
    }

    public void setAlcoholName(String alcoholName) {
        this.alcoholName = alcoholName;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}
