//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



import javax.swing.JOptionPane;

public class HappyPet {
	// 2. Create a happinessLevel variable to store the pet's happiness number.
	//    Initialize to zero.
 static int happinessLevel= 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store in variable

		String z=JOptionPane.showInputDialog("What kind of pet would you buy?");

		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int i = 0; i < 6;i++) {
			
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			//String task = JOptionPane.showOptionDialog(null,null, "What would you do to make your pet happy?", 0, 0 ,JOptionPane.INFORMATION_MESSAGE, new String[] { "cuddle", "eat it", "take a walk" }, null);
int task = JOptionPane.showOptionDialog(null, "What would you do to make your pet happy?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "cuddle", "eat it", "take a walk"  }, null);
			// 5. Use user input to call the appropriate method created in step 4.
if (task==0) {
	cuddle();
}
if(task==1) {
eatIt();
}
if(task==2) {
	takeaWalk();
}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.


		
		
		if(happinessLevel>1+10+5) {
			JOptionPane.showMessageDialog(null, "You love your pet!");
			break;
		}
		}
}
	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	
static	void cuddle() {
		JOptionPane.showMessageDialog(null, "most likely it will be annoyed");
		happinessLevel=happinessLevel+1;
	}
static	void eatIt() {
		JOptionPane.showMessageDialog(null, "eating it will pleasure you.");
		happinessLevel=happinessLevel+10;
	}
	
static void takeaWalk() {
		JOptionPane.showMessageDialog(null, "I guess you could exericse from that");
		happinessLevel=happinessLevel+5;
	}
	
	
	
	
	
	
	
	
}