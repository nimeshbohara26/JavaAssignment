package com;

import java.util.Arrays;
import java.util.Scanner;

public class question32 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        int sum = 0;
        System.out.println("Enter the elements: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        for (int num : array) {
            // sum = sum + num;
            Arrays.stream(array).sorted();
        }
        System.out.println("Sum of array elements is:" + sum);
    }
}
