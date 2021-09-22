package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun add(num1: Int, num2: Int): Int {
            return num1 + num2
        }

        println("Hello World")

        val number1 = 8
        val number2 = 9
        val result = add(number1,number2)

        if (result > 10){
            println("Big")
        }else{
            println("Not Very Big")
        }
    }
}