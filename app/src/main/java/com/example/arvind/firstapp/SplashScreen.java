package com.example.arvind.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.splash_screen);


        for (int i=0; i<=15000; i++){}

        startActivity(new Intent(this, Main2Activity.class));
        finish();
    }
}
