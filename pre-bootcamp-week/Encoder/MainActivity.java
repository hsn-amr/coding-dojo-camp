package com.example.hsn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    String userInput;
    String newUserInput = "";
    String alphabet = "abcdefghijklmnopqrstuvwxyz";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = findViewById(R.id.editText);
        TextView textView = findViewById(R.id.textView);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userInput = editText.getText().toString();

                for(int i=0; i<userInput.length(); i++){
                    char l = userInput.toLowerCase().charAt(i);
                    if (l != ' ') {
                        int indexOfChar = alphabet.indexOf(l);
                        int indexOfNewChar = indexOfChar - 13;
                        if(indexOfNewChar < 0){
                            indexOfNewChar = 26 - Math.abs(indexOfNewChar);
                        }
                        newUserInput += String.valueOf(alphabet.charAt(indexOfNewChar));
                    }else
                        newUserInput += String.valueOf(l);
                }
                System.out.println(newUserInput);
                textView.setText(newUserInput);
                newUserInput = " ";

            }
        });
    }
}