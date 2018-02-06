

import javax.swing.JOptionPane;
public class SimpleCalculator {
	public static void main(String[] args) {
for(int i=0; i<3;i++) {
	// 1. Get 2 numbers from the user and convert them to integer.
String q=JOptionPane.showInputDialog("type in 1 number");
String u= JOptionPane.showInputDialog("type in 1 number");
int w= Integer.parseInt(q);
int v= Integer.parseInt(u);

		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "What math operation do you want?", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "addition", "subtraction", "multiplication", "divison" },
				null);
System.out.println(operation);
		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
if (operation==0) {
	addition(w,v);
}
if (operation==1) {
	subtraction(w,v);
}
if (operation==2) {
	multiplication(w,v);
}
if (operation==3) {
	division(w,v);
}
	}	
	}
	// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations}
	
	
	
	
	
	

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
static void addition (int w, int v) {
	JOptionPane.showMessageDialog(null, w+"+"+v+"="+(w+v));
}
	// 4. Create similar methods for subtraction, multiplication and division.
static void subtraction (int w, int v) {
	JOptionPane.showMessageDialog(null, w+"-"+v+"="+(w-v));
}
static void multiplication (int w, int v) {
	JOptionPane.showMessageDialog(null, w+"*"+v+"="+(w*v));
}
static void division (int w, int v) {
	JOptionPane.showMessageDialog(null, w+"/"+v+"="+((double)w/(double)v));
}










}