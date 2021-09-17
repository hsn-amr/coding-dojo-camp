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

                // Include spaces and special characters
                for(int i=0; i<userInput.length(); i++){
                    if(i%2 == 0){
                        newUserInput += String.valueOf(userInput.charAt(i)).toUpperCase();
                    }else {
                        newUserInput += String.valueOf(userInput.charAt(i)).toLowerCase();
                    }
                }
                System.out.println("Include spaces and special characters: "+newUserInput);
                textView.setText("Include spaces and special characters: \n"+newUserInput);
                newUserInput = "";

                // ignore spaces and special characters
                int count = 0;
                for (int i=0; i<userInput.length(); i++){
                    char l = userInput.charAt(i);
                    Pattern special = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~,-]");
                    Matcher hasSpecial = special.matcher(String.valueOf(l));
                    boolean hasSpecialResult = hasSpecial.find();
                    if(hasSpecialResult || l == ' '){
                        newUserInput += String.valueOf(userInput.charAt(i));
                        continue;
                    }else {
                        if(count%2 == 0){
                            newUserInput += String.valueOf(userInput.charAt(i)).toUpperCase();
                            count++;
                        }else {
                            newUserInput += String.valueOf(userInput.charAt(i)).toLowerCase();
                            count++;
                        }
                    }
                }
                System.out.println("ignore spaces and special characters: "+newUserInput);
                textView.setText(textView.getText() + "\nignore spaces and special characters: \n"+newUserInput);
                newUserInput = "";
            }
        });
    }
}