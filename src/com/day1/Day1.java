package com.day1;

import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {

        // question 1
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("Welcome to Java");

        // question 2
        System.out.println("My name is \nNimesh Bohara.\nI am from Manchester, NH.");

        // question 3
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int number1 = input.nextInt();
        System.out.print("Enter number2: ");
        int number2 = input.nextInt();

        int sum = number1 + number2;
        System.out.println("Sum: " + sum);

        int avg = (number1 + number2) / 2;
        System.out.println("Average: " + avg);

        // question 4 - simple interest

        System.out.print("Enter principle amount: ");
        int p = input.nextInt();
        System.out.print("Enter time: ");
        int t = input.nextInt();
        System.out.print("Enter rate: ");
        int r = input.nextInt();

        int simpleInterest = (p*t*r)/100;
        System.out.println("The simple interest is: " + simpleInterest);


    }
}
