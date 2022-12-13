package com.course.msp.repository;

import com.course.msp.domain.dto.SaveFood;

import java.util.HashMap;

public class SaveFoodRepository {
    private static final HashMap<String, SaveFood> saveFoods = new HashMap<>();

    public static HashMap<String, SaveFood> getSaveFoods(){
        return saveFoods;
    }

    public static void init(){
        saveFoods.put("햄버거", new SaveFood("480", "48", "29", "34"));
        saveFoods.put("피자", new SaveFood("242", "26", "10", "10"));
        saveFoods.put("비빔밥", new SaveFood("531", "72", "27", "13"));
        saveFoods.put("연어덮밥", new SaveFood("574", "75", "38", "13"));
        saveFoods.put("김치찌개", new SaveFood("121", "6", "8", "8"));
        saveFoods.put("짜장면", new SaveFood("785", "126", "29", "20"));
        saveFoods.put("짬뽕", new SaveFood("764", "133", "28", "13"));
        saveFoods.put("삼겹살", new SaveFood("661", "32", "34", "56"));

    }
}
