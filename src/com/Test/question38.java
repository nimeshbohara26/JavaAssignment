package com.Test;

import java.util.Scanner;

public class question38 {
    public static void main(String[] args) {
        String str, rev ="";

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check palindrome: ");
        str = sc.nextLine();

        int lengthStr = str.length();
        for (int i = lengthStr -1; i>=0;i--){
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev))
            System.out.println("The string " +str+ " is palindrome");
        else
            System.out.println("The string " +str+ " is not palindrome");

    }

}
