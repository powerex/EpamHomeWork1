package com.epam.homework1.task02;

public class SignChanger {

    public static int changeSign(int n) throws OutOfBoundException {
        if (n == Integer.MIN_VALUE)
            throw new OutOfBoundException();
//        return ~n + 1;
        return sum(~n,1);
    }

    private static int sum(int x, int y)
    {
        if (y == 0)
            return x;
        else
            return sum( x ^ y, (x & y) << 1);
    }

    public static class OutOfBoundException extends Exception {}

}
