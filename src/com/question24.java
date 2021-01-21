package com;

import javax.swing.*;

public class question24 {
    public static void main(String[] args) {
        String nFact = JOptionPane.showInputDialog("Enter a number to find the factorial: ");
        Integer numFactorial = Integer.parseInt(nFact);
        int factorial = 1;
        for (int i =1;i<=numFactorial;i++){
            factorial = factorial * i;
        }
        System.out.println("The factorial of " + numFactorial + " is: " + factorial);
    }
}





