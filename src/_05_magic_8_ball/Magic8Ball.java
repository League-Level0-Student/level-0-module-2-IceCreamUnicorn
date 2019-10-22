//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _05_magic_8_ball;
import java.util.*;
import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {
public static void main(String[] args) {

	// 1. Make a main method that includes all the steps below….

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
	int randnum = new Random().nextInt(4);
	// 3. Print out this variable
	JOptionPane.showMessageDialog(null, randnum);
	// 4. Get the user to enter a question for the 8 ball
	String yo = JOptionPane.showInputDialog("ENTER A QUESTION KID");
	// 5. If the random number is 0
	if(randnum==0) 
	{
		JOptionPane.showMessageDialog(null, "yes or figure it out");
	}
	// -- tell the user "Yes"

	// 6. If the random number is 1
	if(randnum==1) 
	{
		JOptionPane.showMessageDialog(null, "no or figure it out");
	}
	// -- tell the user "No"

	// 7. If the random number is 2
	if(randnum==2) 
	{
		JOptionPane.showMessageDialog(null, "Maybe you should ask Google?");
	}
	// -- tell the user "Maybe you should ask Google?"
	if(randnum==3) 
	{
		JOptionPane.showMessageDialog(null, "-_-");
	}
	// 8. If the random number is 3

	// -- write your own answer
	
}                                                   
}
