package com.course.msp.domain.dto;

public class CalInfor {
    private int total;
    private int carbo;
    private int protein;
    private int fat;

    public CalInfor(int total, int carbo, int protein, int fat) {
        this.total = total;
        this.carbo = carbo;
        this.protein = protein;
        this.fat = fat;
    }

    public int getTotal() {
        return total;
    }

    public int getCarbo() {
        return carbo;
    }

    public int getProtein() {
        return protein;
    }

    public int getFat() {
        return fat;
    }
}
