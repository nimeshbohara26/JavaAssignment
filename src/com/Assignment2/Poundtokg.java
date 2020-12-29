package com.Assignment2;

import java.util.Scanner;

public class Poundtokg {
    public static void main(String[] args) {
        double kg;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the pound: ");
        int pound = sc.nextInt();

        kg = pound * 0.454;

        System.out.println("The pound to kg is: " + kg);
    }
}
