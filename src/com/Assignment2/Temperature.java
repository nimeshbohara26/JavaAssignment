package com.Assignment2;

public class Temperature {
    public static void main(String[] args) {
        int f = 80;
        int c = 30;

        // F to C

        double tempFtoC = (f-32)*5/9;
        System.out.println("F to C is: "+tempFtoC);

        // C to F

        double tempCtoF = (c*9/5)+32;
        System.out.println("C to F is: " + tempCtoF);
    }
}
