//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String f= JOptionPane.showInputDialog("how many nickels do you have?");
		// Convert their answer to an int using Integer.parseInt()
int v=Integer.parseInt(f);
double nickels= v * 0.05;
		// Ask the user how many dimes they have, and convert their answer
String b= JOptionPane.showInputDialog("how many dimes do you have?");
int y=Integer.parseInt(b);
double dimes= y * 0.10;
		// Ask the user how many quarters they have, and convert their answer
String a= JOptionPane.showInputDialog("how many quarters do you have?");
int x=Integer.parseInt(a);
double quarters= x * 0.25;
		// Calculate how much money the user has and save it in a double variable 
double w= nickels+dimes+quarters;
		// Tell the user how much money 8they have
JOptionPane.showMessageDialog(null, "you have "+ w);
	}
}

