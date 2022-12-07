package com.course.msp.domain.dto;

import android.net.Uri;
import android.util.Log;

import java.io.Serializable;

public class FoodInfor implements Serializable {

    private String foodName;
    private String foodCount;
    private String foodFeel;
    private String time;
    private String position;
    private String image;


    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodCount() {
        return foodCount;
    }

    public void setFoodCount(String foodCount) {
        this.foodCount = foodCount;
    }

    public String getFoodFeel() {
        return foodFeel;
    }

    public void setFoodFeel(String foodFeel) {
        this.foodFeel = foodFeel;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
