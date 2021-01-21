package com;

import javax.swing.*;

public class question22 {
    public static void main(String[] args) {
        String numStr = JOptionPane.showInputDialog("Enter a number to get the table: ");
        int num = Integer.parseInt(numStr);

        for (int i=1;i<=10;i++){
            int mul = num * i;
            System.out.println(num + " * " + i +" = " + mul);

        }

    }
}
