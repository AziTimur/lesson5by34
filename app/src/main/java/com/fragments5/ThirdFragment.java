package com.fragments5;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lesson5by34.R;
import com.example.lesson5by34.databinding.FragmentSecondBinding;
import com.example.lesson5by34.databinding.FragmentThirdBinding;

import org.jetbrains.annotations.NotNull;


public class ThirdFragment extends Fragment {

   private FragmentThirdBinding thirdBinding;
private  String string ;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        string=getArguments().getString("key2");
        // Inflate the layout for this fragment
        thirdBinding=FragmentThirdBinding.inflate(inflater,container,false);

        return thirdBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        thirdBinding.btn3.setOnClickListener(view1 -> {
            Fragment fragment = new FourthFragment();
            Bundle bundle = new Bundle();
            bundle.putString("key3",string);
            fragment.setArguments(bundle);
            requireActivity().getSupportFragmentManager().beginTransaction().
                    replace(R.id.main_for_fragments,fragment).addToBackStack(null).commit();

        });
    }
}