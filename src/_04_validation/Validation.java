//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _04_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		for(int i = 0; i < 10; i++) {
		int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.0

		if(randomNumber==0)
		{
			JOptionPane.showMessageDialog(null,"You are totally the best");
		}
		else
		if(randomNumber==1)
		{
			JOptionPane.showMessageDialog(null,"You are not a complete loser");
		}	
		else
			if(randomNumber==2)
		{
			JOptionPane.showMessageDialog(null,"You're cool. I think that's what I was paid to say.");
		}	
			else 
				if(randomNumber==3)
		{
			JOptionPane.showMessageDialog(null,"You're awesome. WoW. We friends? Gib me money");
		}	else 
			if(randomNumber==4)
		{ 
			JOptionPane.showMessageDialog(null,"One plus one is two. I hope you know that cause with ur IQ you have a 5% chance for this.");
		}
		
		}
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
