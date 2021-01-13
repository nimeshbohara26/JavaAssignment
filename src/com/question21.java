package com;

import javax.swing.*;

public class question21 {
    public static void main(String[] args) {

        String dayString = JOptionPane.showInputDialog("Enter a number to convert to day: ");
        int day = Integer.parseInt(dayString);

        //Switch statement
        switch(day){
            //case statements within the switch block
            case 1: dayString="1 - Sunday";
                break;
            case 2: dayString="2 - Monday";
                break;
            case 3: dayString="3 - Tuesday";
                break;
            case 4: dayString="4 - Wednesday";
                break;
            case 5: dayString="5 - Thursday";
                break;
            case 6: dayString="6 - Friday";
                break;
            case 7: dayString="7 - Saturday";
                break;

            default:System.out.println("Invalid Day!");
        }

        System.out.println(dayString);
    }
}
