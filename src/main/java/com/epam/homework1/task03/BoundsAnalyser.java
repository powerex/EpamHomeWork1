package com.epam.homework1.task03;

public class BoundsAnalyser {

    public static void main(String[] args) {
        byte b = (byte)1;
        int size = 1;
        while (b == b << size >> size ) size++;
        System.out.println("byte size: " + size);

        short s = (short)1;
        size = 1;
        while (s == s << size >> size ) size++;
        System.out.println("short size: " + size);

        int i = 1;
        size = 1;
        while (i == i << size >> size ) size++;
        System.out.println("int size: " + size);

        long l = 1L;
        size = 1;
        while (l == l << size >> size ) size++;
        System.out.println("long size: " + size);
    }

}
