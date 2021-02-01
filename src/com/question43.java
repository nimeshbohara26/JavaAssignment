package com;

import java.io.*;

public class question43 {
    static void arithmeticException(){
        try{
            int num1=30, num2=0;
            int output=num1/num2;
            System.out.println ("Result: "+output);
        }
        catch(ArithmeticException e){
            System.out.println ("You Shouldn't divide a number by zero");
        }
    }

    static void arrIndexoutofBoundException(){
        try{
            int a[]=new int[10];
            //Array has only 10 elements
            a[11] = 9;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println ("ArrayIndexOutOfBounds Exception");
        }
    }

    public static void main(String[] args) {
        arithmeticException();
        arrIndexoutofBoundException();
    }

}

