package com.epam.homework1.task02;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class SignChangerTest {
    Random rnd = new Random();

    @Test
    public void changeSign() {

        for (int i=0; i<1000; i++) {
            int x = rnd.nextInt();
            try {
                assertEquals(SignChanger.changeSign(x), -x);
            } catch (SignChanger.OutOfBoundException e) {
                e.printStackTrace();
            }
        }

    }
}