package com.booleanuk.core;

import com.booleanuk.helpers.ExerciseBase;

public class Exercise extends ExerciseBase {
    public String name;

    public Exercise(String name) {
        this.name = name;
    }

    public int age;

    public Exercise(int age) {
        this.age = age;
    }

    /*  1.
        Create a constructor that accepts both a String and an int as parameters, in that order, and assign the values
        provided to the name and age members
     */

    public Exercise(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*
        2. Create a method named add that accepts two integers. The method should return the numbers added together.
     */

    public int add(int nr1, int nr2) {
        return nr1 + nr2;
    }

    /*
        3. Create another method named add that accepts two Strings. The method should return the strings concatenated
        together with a space in between.
     */

    public String add(String a, String b) {
        return a + " " + b;
    }
}
