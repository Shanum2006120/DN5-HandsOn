package com.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class CalculatorTest {

    @Test
    public void testAddition() {

        int sum = 10 + 20;
        System.out.println(sum);
        assertEquals(30, sum);

    }
}