package com;

import java.util.Scanner;

public class question26 {
    public static void main(String[] args) {
        // Reverse a number

        int number = 0;
        int revNum =0;
        System.out.print("Enter a number to reverse: ");
        Scanner inp = new Scanner(System.in);
        number = inp.nextInt();
        while(number!=0){
            revNum = revNum * 10;
            revNum = revNum + number % 10;
            number = number /10;
        }
        System.out.println("The reverse of the number is: " + revNum );

    }
}



