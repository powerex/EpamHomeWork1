package com.epam.homework1.task05;

import com.epam.homework1.task02.SignChanger;

public class GCD {

    public static int gcd0(int n, int m) {
        return (m==0)?n:gcd0(m, n%m);
    }

    public static void main(String[] args) {
        try {
            System.out.println(GCD.gcd(-5, 2));
        } catch (SignChanger.OutOfBoundException e) {
            e.printStackTrace();
        }
    }

    public static int sum(int n, int m)
    {
        int result = n ^ m;
        int carry = (n & m) << 1;
        if (carry != 0) {
            return sum(result, carry);
        }
        return result;
    }

    public static boolean greater(int n, int m) {
        if ((n >> 31) == -1 && (m >> 31) == 0)
            return false;

        if ((n >> 31) == 0 && (m >> 31) == -1)
            return true;

        for (int mask = (1 << 30); mask > 0; mask >>= 1)
            if ((n & mask) != (m & mask))
                if ((n & mask) > 0)
                    return true;
                else
                    return false;
        return false;
    }

    public static int gcd(int n, int m) throws SignChanger.OutOfBoundException {
        if (n == 0)
            return m;
        while (m != 0) {
            if (greater(n,m))
                n = sum(n, SignChanger.changeSign(m));
            else
                m = sum(m, SignChanger.changeSign(n));;
        }
        return n;
    }

}
