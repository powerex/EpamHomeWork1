package com.epam.homework1.task01;

import java.util.Random;

import static org.junit.Assert.*;

public class ToDecimalConverterTest {

    Random rnd = new Random();

    @org.junit.Test
    public void convert() {
        try {
            assertEquals(ToDecimalConverter.convert("10"), 2);
            assertEquals(ToDecimalConverter.convert("101"), 5);
            assertEquals(ToDecimalConverter.convert("11"), 3);
            assertEquals(ToDecimalConverter.convert("0"), 0);
        } catch (ToDecimalConverter.ConvertingException e) {
            e.printStackTrace();
        }

        for (int i=0; i<1000; i++) {
            int x = rnd.nextInt();
            try {
                assertEquals(x, ToDecimalConverter.convert(Integer.toBinaryString(x)));
            } catch (ToDecimalConverter.ConvertingException e) {
                e.printStackTrace();
            }
        }

    }
}