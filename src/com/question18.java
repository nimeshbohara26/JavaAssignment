package com;

import javax.swing.*;

public class question18 {
    public static void main(String[] args) {
        String n1 = JOptionPane.showInputDialog("Enter first number: ");
        String n2 = JOptionPane.showInputDialog("Enter second number: ");
        String n3 = JOptionPane.showInputDialog("Enter third number: ");

        int num1 = Integer.parseInt(n1);
        int num2 = Integer.parseInt(n2);
        int num3 = Integer.parseInt(n3);

        if(num1 > num2 && num1 > num3){
            System.out.println(num1 + " is the largest");
        }
        else if(num2 > num1 && num2 > num3){
            System.out.println(num2 + " is the largest");
        }
        else
            System.out.println(num3 + " is the largest");

    }
}
