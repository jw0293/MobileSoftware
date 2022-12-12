package com.course.msp.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.course.msp.repository.FoodInformationRepository;

public class HomeViewModel extends ViewModel {
    private MutableLiveData<String> mImg;

    public HomeViewModel(){
        mImg = new MutableLiveData<>();
        mImg.setValue(String.valueOf(FoodInformationRepository.getLastImage()));
    }

    public LiveData<String> getLiveData() {
        return mImg;
    }
}