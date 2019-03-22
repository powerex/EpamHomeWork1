package com.epam.homework1.task02;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        try {
            System.out.println(SignChanger.changeSign(n));
        } catch (SignChanger.OutOfBoundException e) {
            e.printStackTrace();
        }
    }
}
