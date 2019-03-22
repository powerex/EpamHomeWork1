package com.epam.homework1.task05;

import com.epam.homework1.task02.SignChanger;
import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class GCDTest {

    private Random rnd = new Random();

    @Test
    public void greater() {

        Assert.assertEquals(GCD.greater(-3, 2), false);

        for (int i=0; i<2000; i++) {
            int x = rnd.nextInt();
            int y = rnd.nextInt();
            System.out.println(x+" "+y);
            Assert.assertEquals(GCD.greater(x, y), x>y);
        }

    }

    @Test
    public void gcd() {
        for (int i=0; i<1000; i++) {
            int x = rnd.nextInt(10000);
            int y = rnd.nextInt(10000);
            try {
                Assert.assertEquals(GCD.gcd(x, y), GCD.gcd0(Math.abs(x), Math.abs(y)));
            } catch (SignChanger.OutOfBoundException e) {
                e.printStackTrace();
            }
        }
    }
}