package com.example.hsn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    String userInput;
    String newUserInput = "";
    String alphabet = "abcdefghijklmnopqrstuvwxyz";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        class Cat {
            String name;
            int age;

            Cat(String name, int age){
                this.name = name;
                this.age = age;
            }

            void meow(){
                System.out.println(this.name + ": Meow");
            }
        }

        class Dog{
            String name;
            int age;

            Dog(String name, int age){
                this.name = name;
                this.age = age;
            }

            void bark(){
                System.out.println(this.name + ": Woof");
            }
        }


        Cat cat1 = new Cat("Snowball", 5);
        Cat cat2 = new Cat("Furball", 6);
        Cat cat3 = new Cat("Patchy", 1);
        Cat cat4 = new Cat("Meep", 2);
        Cat cat5 = new Cat("Lili", 4);
        List<Cat> cats = new ArrayList<Cat>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        cats.add(cat5);

        Dog dog1 = new Dog("Spot", 7);
        Dog dog2 = new Dog("Fred", 9);
        Dog dog3 = new Dog("Rufus", 1);
        Dog dog4 = new Dog("MAX", 3);
        Dog dog5 = new Dog("BO", 5);
        List<Dog> dogs = new ArrayList<Dog>();
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        dogs.add(dog4);
        dogs.add(dog5);

        for (int i=0; i<5; i++){
            cats.get(i).meow();
            for (int j=0; j<5; j++){
               if (dogs.get(j).age > cats.get(i).age)
                   dogs.get(j).bark();

            }
        }
    }
}