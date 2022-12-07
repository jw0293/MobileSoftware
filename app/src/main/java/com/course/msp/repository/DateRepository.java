package com.course.msp.repository;

import com.course.msp.domain.dto.FoodInfor;

import java.util.*;

public class DateRepository {


    public static final HashMap<String, ArrayList<FoodInfor>> dateInformation = new HashMap<>();

    public static void addDate(String date, FoodInfor foodInfor){
        if(dateInformation.get(date) == null){
            ArrayList<FoodInfor> foodInfors = new ArrayList<>();
            foodInfors.add(foodInfor);
            dateInformation.put(date, foodInfors);
        } else{
            ArrayList<FoodInfor> foodInforValue = dateInformation.get(date);
            foodInforValue.add(foodInfor);
            dateInformation.put(date, foodInforValue);
        }
    }

    public static ArrayList<FoodInfor> getFoodInforFromDate(String date){
        return dateInformation.get(date);
    }
}
