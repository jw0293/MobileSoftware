package com.course.msp.repository;

import android.net.Uri;

import com.course.msp.domain.dto.FoodInfor;

import java.util.ArrayList;

public class FoodInformationRepository {

    public static final ArrayList<FoodInfor> foodInfors = new ArrayList<>();

    public static ArrayList<FoodInfor> getFoodInfor(){
        return foodInfors;
    }

    public static void addFoodInfor(FoodInfor foodInfor){
        foodInfors.add(foodInfor);
    }

    public static int getSize(){
        return foodInfors.size();
    }

    public static Uri getLastImage(){
        if(foodInfors.size()==0){return null;}
        return Uri.parse(foodInfors.get(foodInfors.size()-1).getImage());
    }

}
