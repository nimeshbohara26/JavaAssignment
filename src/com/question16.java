package com;

import javax.swing.*;

public class question16 {
    public static void main(String[] args) {
        String n1 = JOptionPane.showInputDialog("Enter a number: ");
        int num = Integer.parseInt(n1);
        if(num % 2 == 0){
            System.out.println("The number " + num +  " is even.");
        }
        else{
            System.out.println("The number " + num +  " is odd.");
        }
    }
}
