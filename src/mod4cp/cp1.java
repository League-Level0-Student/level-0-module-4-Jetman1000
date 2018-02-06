package mod4cp;


import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class cp1 {
public static void main(String[] args) {
	
	String n=JOptionPane.showInputDialog("What is your favorite color?");
	
	JOptionPane.showMessageDialog(null,n+" is also my favorite color!");
	
	Robot bob= new Robot();
	
	for(int i=0;i<3;i++) {
		bob.penDown();
		bob.move(100);
		bob.turn(120);
	}
	String y="yes";
if(y.equals("yes")) {
	JOptionPane.showMessageDialog(null, "happy");
} else {
	JOptionPane.showMessageDialog(null, "sad");
}

}




}