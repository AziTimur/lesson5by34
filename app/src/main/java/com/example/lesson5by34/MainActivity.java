package com.example.lesson5by34;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.fragments5.FirstFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().add(R.id.main_for_fragments,new FirstFragment()).commit();
    }
}