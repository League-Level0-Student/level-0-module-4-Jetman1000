//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation;
        
        /*
         * Ask the user for these values using
         * JOptionPane.showConfirmDialog(null, "is it a weekday?", "",
         * JOptionPane.YES_NO_OPTION);
         */
    int x=JOptionPane.showConfirmDialog(null, "is it a weekday?", "",JOptionPane.YES_NO_OPTION);
System.out.println(x);

        /*
         * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!” If it is a weekday, and we are on vacation,
         * print “sleep in”.
         */
if(x==0) {

	int s=JOptionPane.showConfirmDialog(null, "Are you in vacation?", "",JOptionPane.YES_NO_OPTION);
	if(s==0) {
		JOptionPane.showMessageDialog(null, "sleep in");
	} else {
		JOptionPane.showMessageDialog(null, "get up lazybones!");
	}
}



if(x==1) {
	JOptionPane.showMessageDialog(null, "sleep in");
}











    }
}
