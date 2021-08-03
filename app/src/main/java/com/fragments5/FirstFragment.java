package com.fragments5;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lesson5by34.R;
import com.example.lesson5by34.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;
    private String string;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentFirstBinding.inflate(inflater,container,false);

        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull @org.jetbrains.annotations.NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



        binding.btn1.setOnClickListener(view1 -> {
            SecondFragment secondFragment=new SecondFragment();
            Bundle bundle = new Bundle();
            string = binding.edtTv.getText().toString();
            bundle.putString("key1", string);
            secondFragment.setArguments(bundle);
            requireActivity().getSupportFragmentManager().beginTransaction().
                    replace(R.id.main_for_fragments,secondFragment).addToBackStack(null).commit();



        });
    }
}