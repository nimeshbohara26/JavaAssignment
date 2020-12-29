package com.Assignment2;

import static java.lang.Math.sqrt;

public class MathematicalFunction {
    public static void main(String[] args) {
        // Question a

            int u = 4;
            int t = 2;
            int a = 5;

            double s = u*t+(a*t*t)/2;

        System.out.println("S : "+ s);


        // Question b

        int sb = 10;
        int  ab = 5;
        int bb = 2;
        int cc = 3;

        double area = sqrt(sb*(sb-ab)*(sb*bb)*(sb*cc));

        System.out.println("Area: "+ area);

        // Question c

        int b = 1;
        int ac = 2;
        int ccc = 15;

        double x = (-b+sqrt(b*b-4*ac*ccc))/(2*ac);

        System.out.println("x: "+x);



    }
}
