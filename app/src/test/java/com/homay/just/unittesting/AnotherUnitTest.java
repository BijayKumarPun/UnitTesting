package com.homay.just.unittesting;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AnotherUnitTest {


    @Test
    public void testAddition() {
        MyClass add = new MyClass();
        int result = add.add(5, 5);
        assertEquals(10, result);

    }

    @Test(expected = ArithmeticException.class)

    public void testDivision() {

        //TODO Replicate divide by zero exception
        MyClass add = new MyClass();
        int divisor = 0;
        int dividend = 5;
        int result = add.divide(divisor, dividend);


        assertEquals(java.lang.ArithmeticException.class,result);
    }

}
