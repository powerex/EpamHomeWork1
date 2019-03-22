package com.epam.homework1.task01;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String binary = scanner.nextLine();
        try {
            System.out.println(binary + " -> " + ToDecimalConverter.convert(binary));
        } catch (ToDecimalConverter.ConvertingException e) {
            e.printStackTrace();
        }
    }

}
