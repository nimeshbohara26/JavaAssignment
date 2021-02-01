package com.Test;

import java.util.Scanner;

public class question30 {

    static int n1=0, n2=1,n3=0;
    static void printFibonacci(int number){
        if (number>0){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" "+ n3);
            printFibonacci(number-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter upto where you want to print fibonacci number: ");
        int number = sc.nextInt();
        System.out.print(n1 + " " +n2);
        printFibonacci(number-2);
    }



}
