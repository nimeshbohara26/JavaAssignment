package homework;

import javax.swing.JOptionPane;

public class question14 {

	public static void main(String[] args) {
		String n1 = JOptionPane.showInputDialog("Enter first number: ");
		String n2 = JOptionPane.showInputDialog("Enter second number: ");
		
		Double num1 = Double.parseDouble(n1);
		Double num2 = Double.parseDouble(n2);
		
		if(num1 > num2) {
			System.out.println(num1 + " is greater than " + num2);
		}
		else if(num1 < num2){
			System.out.println(num1 + " is less than " + num2);
		}
//		else if(num1 == num2) {
//			System.out.println(num1 + " is equals to " + num2);
//		}
		else {
			// System.out.println("Enter a valid number.");
			System.out.println(num1 + " is equals to " + num2);
		}

	}

}
