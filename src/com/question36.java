package com;


import java.util.Scanner;

public class question36 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int[] my_array = new int[5];
        System.out.println("Enter five numbers: ");
        for (int i = 0; i < my_array.length; i++) {
            my_array[i] = scanner.nextInt();
        }

        for (int i = 0; i < my_array.length-1; i++)
        {
            for (int j = i+1; j < my_array.length; j++)
            {
                if ((my_array[i] == my_array[j]) && (i != j))
                {
                    System.out.println("Duplicate Number : "+my_array[j]);
                }
            }
        }
    }
}
