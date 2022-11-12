package com.example.projetodm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TelaProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_profile);
        getSupportActionBar().hide();

    }
}