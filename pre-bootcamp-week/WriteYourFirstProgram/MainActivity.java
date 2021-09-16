package com.example.hsn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String message = "Welcome to my first Java program";
        System.out.println(message.substring(0,8) + message.substring(11,14) + message.substring(20,25));
        System.out.println(message.replaceAll("a", "").replaceAll("e", "").replaceAll("i", "").replaceAll("o", "").replaceAll("u",""));
    }
}