package com.homay.just.unittesting;

/**
 * Function's of MyClass are tested.
 */

public class MyClass {


    public int add(int a, int b) {
        return a+b;
    }

    public String displayString(String string) {
        return string;
    }

    public int divide(int divisor, int dividend) throws ArithmeticException{

      return dividend/divisor;


    }
}
