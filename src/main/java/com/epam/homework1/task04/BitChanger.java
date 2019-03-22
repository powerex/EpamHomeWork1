package com.epam.homework1.task04;

public class BitChanger {

    public static int changeBitAtPosition(int n, byte pos) {
        pos %= 32;
        return n ^ (1 << pos);
    }

    public static int setOneBitAtPosition(int n, byte pos) {
        pos %= 32;
        return n | (1 << pos);
    }

    public static int setZeroBitAtPosition(int n, byte pos) {
        pos %= 32;
        return n & ~(1 << pos);
    }

    public static void main(String[] args) {
        System.out.println(BitChanger.changeBitAtPosition(100, (byte) 1));
        System.out.println(BitChanger.setOneBitAtPosition(100, (byte) 1));
        System.out.println(BitChanger.setZeroBitAtPosition(100, (byte) 1));
    }

}
