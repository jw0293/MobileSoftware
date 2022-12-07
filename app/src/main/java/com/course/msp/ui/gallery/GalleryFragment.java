package com.course.msp.ui.gallery;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;

import com.course.msp.controller.DBActivity;
import com.course.msp.controller.MyAdapter;
import com.course.msp.databinding.FragmentGalleryBinding;

public class GalleryFragment extends Fragment {

    private FragmentGalleryBinding binding;
    private RecyclerView recyclerView;
    private MyAdapter myAdapter;
    private RecyclerView.LayoutManager layoutManager;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        GalleryViewModel galleryViewModel =
                new ViewModelProvider(this).get(GalleryViewModel.class);

        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        Intent intent = new Intent(root.getContext(), DBActivity.class);
        startActivity(intent);

//        recyclerView = root.findViewById(R.id.recyclerView);
//        recyclerView.setHasFixedSize(true);
//
//        Log.d("GalleryFragment ", getActivity().toString());
//        layoutManager = new LinearLayoutManager(root.getContext());
//        recyclerView.setLayoutManager(layoutManager);
//
//        ArrayList<Foods> foods = galleryViewModel.getFoods();
//
//        myAdapter = new MyAdapter(foods);
//        recyclerView.setAdapter(myAdapter);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}