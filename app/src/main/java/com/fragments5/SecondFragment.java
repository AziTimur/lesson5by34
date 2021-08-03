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

import org.jetbrains.annotations.NotNull;


public class SecondFragment extends Fragment {
   private FragmentSecondBinding secondBinding;
  private  String string;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        string=getArguments().getString("key1");
        secondBinding=FragmentSecondBinding.inflate(inflater,container,false);
        return secondBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        secondBinding.btn2.setOnClickListener(view1 -> {
            ThirdFragment thirdFragment=new ThirdFragment();
            Bundle bundle = new Bundle();
            bundle.putString("key2",string);
            thirdFragment.setArguments(bundle);
            requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.main_for_fragments,thirdFragment).addToBackStack(null).commit();

        });
    }
}