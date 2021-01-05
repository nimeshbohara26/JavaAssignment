package com;

import javax.swing.*;

public class question20 {

    static void calculator(int x, int y, char z){
        switch (z){
            case '+':
              int sum = x + y;
                System.out.println("The addition is: " + sum);
              break;
            case '-':
                int difference = x - y;
                System.out.println("The difference  is: " + difference);
            break;
            case '*':
                int mul = x * y;
                System.out.println("The multiplication is: " + mul);
            break;
            case '/':
                int div = x / y;
                System.out.println("The division is: " + div);
            break;
        }
    }

    public static void main(String[] args) {
        String n1 = JOptionPane.showInputDialog("Enter first number: ");
        String n2 = JOptionPane.showInputDialog("Enter second number: ");
        String op = JOptionPane.showInputDialog("Enter the operator: ");

        int x = Integer.parseInt(n1);
        int y = Integer.parseInt(n2);
        char o = op.charAt(0);

        calculator(x,y,o);
    }
}
