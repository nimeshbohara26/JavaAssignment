package com;
import java.lang.*;
import java.util.Scanner;


public class question40 {
    public static void main(String[] args) {
        String str = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        str = sc.nextLine();

        StringBuilder input1 = new StringBuilder();

        // append a string into StringBuilder input1
        input1.append(str);

        // reverse StringBuilder input1
        input1.reverse();

        // print reversed String
        System.out.println(input1);
    }
}
