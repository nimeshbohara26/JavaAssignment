package com;

import javax.swing.*;

public class question15 {
    public static void main(String[] args) {
        String num = JOptionPane.showInputDialog("Enter a number between 0 and 128: ");
        int n1 = Integer.parseInt(num);
        System.out.println("The number you entered is : " + n1);
        char ch = (char) n1;
        System.out.println("The equivalent ASCII code is: " + ch);
    }
}
