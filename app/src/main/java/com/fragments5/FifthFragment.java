package com.fragments5;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lesson5by34.R;
import com.example.lesson5by34.databinding.FragmentFifthBinding;
import com.example.lesson5by34.databinding.FragmentFourthBinding;

import org.jetbrains.annotations.NotNull;


public class FifthFragment extends Fragment {

    private FragmentFifthBinding binding;
    private String string;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        string=getArguments().getString("key4");
        binding=FragmentFifthBinding.inflate(inflater,container,false);
        return  binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        binding.btn5.setOnClickListener(view1 -> {

          binding.tv1.setText(string);

        });
    }
}