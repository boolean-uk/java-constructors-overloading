package com.booleanuk.extension;

import com.booleanuk.core.Exercise;
import com.booleanuk.helpers.ExtensionBase;

public class Extension extends ExtensionBase {
    /*
        Implement the following methods:

        1. add, which accepts two floats and returns a float (both floats added together)

        2. add, which accepts two doubles and returns a double (both doubles added together)

        3. subtract, which accepts two floats and returns a float (first float minus second float)

        4. subtract, which accepts a String and a char and returns a string with all instances of the provided char removed

        5. multiply, which accepts two ints and returns an int (first int multiplied by second int)

        6. multiply, which accepts a string and an int, and returns a string containing the provided string
        as many times as the provided int separated by a comma. E.g.
        multiply("Hello", 3) -> "Hello,Hello,Hello"

        7. multiply, which accepts an array of Strings that each contain a number, and an int
        The method should return an array of ints that contain the value of multiplying each String number by the provided int
        E.g.
        multiply(["2", "7", "3"], 3) -> [6, 21, 9]
     */
    public float add(float floatOne, float floatTwo) {
        return floatOne + floatTwo;
    }

    public double add(double doubleOne, double doubleTwo) {
        return doubleOne + doubleTwo;
    }

    public float subtract(float floatOne, float floatTwo) {
        return floatOne - floatTwo;
    }

    public String subtract(String stringOne, char charOne) {
        return stringOne.replace(String.valueOf(charOne), "");
    }

    public int multiply(int numOne, int numTwo) {
        return numOne * numTwo;
    }

    public String multiply(String stringOne, int times) {
        String out = stringOne;
        for (int i = 0; i < times - 1; i++) {
            out += "," + stringOne;
        }
        return out;
    }

    public int[] multiply(String[] list, int num) {
        int[] numList = new int[list.length];
        int calculatedNum = 0;
        for (int i = 0; i < list.length; i++) {
            calculatedNum = Integer.parseInt(list[i]) * num;
            numList[i] = calculatedNum;
        }
        return numList;
    }

}
