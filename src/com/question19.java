package com;

import javax.swing.*;

public class question19 {

    static void checkTriangle(int x,int y,int z){
        if(x == y && y ==z){
            System.out.println("It is equilateral triangle");
        }
        else if(x ==y || y ==z || z ==x){
            System.out.println("It is Isoceles triangle");
        }
        else {
            System.out.println("It is Scalene Triangle");
        }
    }

    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Enter first side: ");
        String b = JOptionPane.showInputDialog("Enter second side");
        String c = JOptionPane.showInputDialog("Enter third side");

        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);
        int z = Integer.parseInt(c);

        checkTriangle(x,y,z);

    }
}
