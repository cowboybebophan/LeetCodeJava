package com.ascending.problems;

public class Factorial {
    public static void main(String[] args){
        int a = 8;
        System.out.println(fac(a));
    }

    public static int fac(int n){
        if (n == 0) return 1;
        return n * fac(n-1);
    }
}
