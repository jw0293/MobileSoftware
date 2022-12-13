package com.course.msp.ui.home;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.course.msp.R;
import com.course.msp.controller.CalenderActivity;
import com.course.msp.databinding.FragmentHomeBinding;
import com.course.msp.repository.FoodInformationRepository;
import com.course.msp.repository.SaveFoodRepository;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    // private TextView totalCal, carbo, protein, fat;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final ImageView imageView  = binding.imageView3;
        final TextView totalCal = binding.totalKaclValue;
        final TextView totalCarbo = binding.totalCarboValue;
        final TextView totalProtein = binding.totalProteinValue;
        final TextView totalFat = binding.totalFatValue;

        homeViewModel.getLiveData().observe(getViewLifecycleOwner(), ur -> imageView.setImageURI(Uri.parse(ur)));
        homeViewModel.getLiveTotalCal().observe(getViewLifecycleOwner(), cal -> totalCal.setText(cal));
        homeViewModel.getLiveCarbo().observe(getViewLifecycleOwner(), carbo -> totalCarbo.setText(carbo));
        homeViewModel.getLiveProtein().observe(getViewLifecycleOwner(), pro -> totalProtein.setText(pro));
        homeViewModel.getLiveFat().observe(getViewLifecycleOwner(), fat -> totalFat.setText(fat));

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}