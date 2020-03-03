package com.ascending.problems;

public class IntegerToBinary {
    public static void main(String[] args) {
        System.out.println(intToBinary(2345));
    }

    public static String intToBinary(int n)
    {
        String s = "";
        while (n > 0)
        {
            s =  ( (n % 2 ) == 0 ? "0" : "1") + s;
            n = n / 2;
        }
        return s;
    }
}
