package com.homay.just.unittesting;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 3 + 2);
    }
@Test
 public void subtraction_isCorrect(){
     assertEquals(20, 30 - 10);
 }



 @Test
    public void addition() throws Exception {
     MyClass add = new MyClass();
     int result = add.add(2, 2);
     int expected = 4;
     assertEquals(expected, result);
 }

 @Test
    public void displayText() throws Exception {
        //create class
     //take some method to take
     //get the result of the method
     //get the expected value
     //compare

     MyClass add = new MyClass();
     String myText = "this ijkhkhkjs it";
     String result = add.displayString(myText);
     assertEquals(myText, result);

    }


}

