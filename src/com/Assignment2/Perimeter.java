package com.Assignment2;

public class Perimeter {
    public static void main(String[] args) {
        // Perimeter of Circle

        int r = 5;
        final double pi = 3.1416;
        double perimeterCircle = 2*pi*r;
        System.out.println("Perimeter of Circle is: "+ perimeterCircle);

        // Perimeter of Triangle
        int a = 2;
        int b = 3;
        int c = 5;
        int perimeterTriangle = a + b + c;
        System.out.println("Perimeter of Triangle is: " +perimeterTriangle);

        // Perimeter of Rectangle

        int l = 5;
        int w = 4;
        int perimeterRectangle = 2*(l+w);
        System.out.println("Perimeter of Rectangle is: " + perimeterRectangle);

        // Volume of Cylinder

        int radius = 3;
        int height = 2;
        double volumeCylinder = pi*radius*radius*height;
        System.out.println("Volume of Cylinder is: " + volumeCylinder);


    }
}
