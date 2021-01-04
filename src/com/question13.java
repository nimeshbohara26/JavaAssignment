package homework;

import javax.swing.JOptionPane;

public class question13 {
	public static void main(String args[]) {
		String num = JOptionPane.showInputDialog("Enter a negative number to display: ");
		Double number = Double.parseDouble(num);
		
		if (number >= 0){
			System.out.println("You have enter positive number. Enter negative number to display.");
		}
		else {
			System.out.println("The number you entered is: " + number);
		}
	}

}
