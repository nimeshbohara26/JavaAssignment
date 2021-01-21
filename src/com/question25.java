package com;

import javax.swing.*;

public class question25 {
    public static void main(String[] args) {

        String nStudent = JOptionPane.showInputDialog("Enter the number of students: ");
        Integer numStd = Integer.parseInt(nStudent);
        int highest = 0;
        int stdScore = 0;
        String highestName ="";

        for (int i=1; i<=numStd;i++){
            String sName = JOptionPane.showInputDialog("Enter student name: ");
            String sScore = JOptionPane.showInputDialog("Enter the score: ");
            stdScore = Integer.parseInt(sScore);
            if (highest < stdScore){
                highest = stdScore;
                highestName = sName;
            }
        }
        System.out.println("The highest score is " + highest + " of " + highestName);

    }
}
