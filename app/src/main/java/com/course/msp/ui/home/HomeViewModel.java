package com.course.msp.ui.home;

import android.content.Intent;
import android.widget.TextView;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.course.msp.R;
import com.course.msp.repository.FoodInformationRepository;
import com.course.msp.repository.SaveFoodRepository;

public class HomeViewModel extends ViewModel {
    private MutableLiveData<String> mImg, totalCal, carbo, protein, fat, sumCal, sumCarbo, sumProtein, sumFat;

    public HomeViewModel(){
        mImg = new MutableLiveData<>();
        mImg.setValue(String.valueOf(FoodInformationRepository.getLastImage()));

        totalCal = new MutableLiveData<>();
        carbo = new MutableLiveData<>();
        protein = new MutableLiveData<>();
        fat = new MutableLiveData<>();

        String foodName = FoodInformationRepository.getLastFoodName();
        String count = (FoodInformationRepository.getLastCount());

        if(foodName != null && count != null) {
            int cnt = Integer.parseInt(count);
            totalCal.setValue(Integer.toString(Integer.parseInt(SaveFoodRepository.getSaveFoods().get(foodName).getTotalCal()) * cnt));
            carbo.setValue(Integer.toString(Integer.parseInt(SaveFoodRepository.getSaveFoods().get(foodName).getCarbo()) * cnt));
            protein.setValue(Integer.toString(Integer.parseInt(SaveFoodRepository.getSaveFoods().get(foodName).getProtein())* cnt));;
            fat.setValue(Integer.toString(Integer.parseInt(SaveFoodRepository.getSaveFoods().get(foodName).getFat()) * cnt));
        }
    }

    public LiveData<String> getLiveData() {
        return mImg;
    }
    public LiveData<String> getLiveTotalCal() {
        return totalCal;
    }
    public LiveData<String> getLiveCarbo() {
        return carbo;
    }
    public LiveData<String> getLiveProtein() {
        return protein;
    }
    public LiveData<String> getLiveFat() {
        return fat;
    }
}