package com.Assignment2;

public class Area {
    public static void main(String[] args) {
        // Area of Circle

        final double pi = 3.1416;
        int r = 5;
        double AreaOfCircle = pi*r*r;

        System.out.println("Area of circle is: " + AreaOfCircle);

        // Area of rectangle

        int length = 4;
        int breadth = 5;
        int AreaOfRectangle = length * breadth;

        System.out.println("Area of Rectangle is: " + AreaOfRectangle);

        // Area of triangle

        int base = 20;
        int height = 12;
        double AreaOfTriangle = (base*height)/2;

        System.out.println("Area of Triangle is: " + AreaOfTriangle);

    }
}
