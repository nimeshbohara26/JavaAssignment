package com;

import javax.swing.*;

public class question23 {
    public static void main(String[] args) {
        String nthNum = JOptionPane.showInputDialog("Enter the nth number: ");
        int nthNumber = Integer.parseInt(nthNum);
        int sum = 0;
        for (int i =0; i<= nthNumber; i++){
             sum = sum + i;
        }
        System.out.println("The sum of nth number: " + nthNumber + " is " + sum);

    }
}
