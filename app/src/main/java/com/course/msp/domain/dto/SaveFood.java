package com.course.msp.domain.dto;

public class SaveFood {

    private String totalCal;
    private String carbo;
    private String protein;
    private String fat;


    public String getTotalCal() {
        return totalCal;
    }

    public String getCarbo() {
        return carbo;
    }

    public String getProtein() {
        return protein;
    }

    public String getFat() {
        return fat;
    }

    public SaveFood(String totalCal, String carbo, String protein, String fat) {
        this.totalCal = totalCal;
        this.carbo = carbo;
        this.protein = protein;
        this.fat = fat;
    }
}
