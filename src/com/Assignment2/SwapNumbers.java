package com.Assignment2;

public class SwapNumbers {
    public static void main(String[] args) {

        // Using temp variable

        int num1 = 5;
        int num2 = 10;
        int temp = 0;

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("Number 1: "+ num1);
        System.out.println("Number 2: " + num2);

        // without temp variable

        int a = 10;
        int b = 20;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a is: "+ a);
        System.out.println("b is: "+b);

    }
}
