package com;

import java.util.Scanner;

public class question27 {

    public static void getSum(int number) {
        int sum = 0;
        int input = number;
        while (input != 0) {
            int lastdigit = input % 10;
            sum += lastdigit;
            input /= 10;
        }
        System.out.printf("Sum of digits of number %d is %d", number, sum);
    }
    public static void getMul(int number){
        int mul = 1;
        while (number!=0){
            mul = mul * (number % 10);
            number = number /10;
        }
        System.out.println("The multiplication is : " + mul);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number to calculate sum of digits");
        int number = sc.nextInt();
        getSum(number);
        System.out.println();
        getMul(number);
    }
}
