package com;

import javax.swing.*;

public class question17 {
    public static void main(String[] args) {
        String n1 = JOptionPane.showInputDialog("Enter a year: ");
        int year = Integer.parseInt(n1);
        System.out.println("The year you entered is: " + year);
        boolean leap = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leap = true;
                } else {
                    leap = false;
                }
            } else
                leap = true;
        } else
            leap = false;

        if (leap)
            System.out.println(year + " is leap year");
        else
            System.out.println(year + " is not leap year");
    }
}





