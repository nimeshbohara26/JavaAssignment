package homework;

import javax.swing.JOptionPane;

public class question12 {

	public static void main(String[] args) {
		
		String Name = JOptionPane.showInputDialog("Enter your name: ");
		String Roll = JOptionPane.showInputDialog("Enter your Roll number: ");
		double rn = Double.parseDouble(Roll);
		String Nationality = JOptionPane.showInputDialog("Enter nationality: ");
		
		System.out.println("Your name is: " + Name);
		System.out.println("Your roll number is: " + rn);
		System.out.println("Your nationality is: " + Nationality);
		

	}

}
