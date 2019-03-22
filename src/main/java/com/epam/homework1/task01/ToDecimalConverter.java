package com.epam.homework1.task01;

public class ToDecimalConverter {

    public static int convert(String number) throws ConvertingException {

        if (number.length() > 32)
            throw new ConvertingException("Input string too long");

        number = new StringBuilder(number).reverse().toString();
        int result = 0;
        for (int i=0; i<number.length(); i++) {
            if (number.charAt(i)=='1')
                result |= (1<<i);
            else if (number.charAt(i) == '0');
            else
                throw new ConvertingException("Unexpected symbol in input string");
        }
        return result;
    }

    public static class ConvertingException extends Exception {
        ConvertingException(String message) {
            super(message);
        }
    }

}
