package com.ascending.problems;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 8;
        System.out.println(fib(a));
    }

    public static int fib(int n){
        if (n <= 1) return n;
        return fib(n-1) + fib(n-2);
    }

}
