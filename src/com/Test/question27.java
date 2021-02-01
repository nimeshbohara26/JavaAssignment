package com.Test;

import java.util.Scanner;

public class question27 {

    public static void getSum(int number){
        int sum = 0;
        int num = number;
        while (num!=0){
            int lastDigit = num %10;
            sum = sum + lastDigit;
            num = num/10;
        }
        System.out.println("The sum of the number is: " +sum);
    }

    public static void getMul(int number){
        int mul = 1;
        while (number!=0){
            mul = mul * (number %10);
            number = number /10;
        }
        System.out.println("The multiplication of the number is: " +mul);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to calculate sum and multiplication: ");
        int number = sc.nextInt();
        getSum(number);
        getMul(number);
    }
}
