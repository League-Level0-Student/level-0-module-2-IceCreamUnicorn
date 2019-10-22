import java.util.*;

import javax.swing.JOptionPane;
public class LOTTERY_KITTEN {
	public static void main(String[] args) 
	{
int randnum = new Random().nextInt(10);	
int randnum1 = new Random().nextInt(10);	
int randnum2 = new Random().nextInt(10);	
int randnum3 = new Random().nextInt(10);	
int randnum4 = new Random().nextInt(10);	
JOptionPane.showMessageDialog(null,randnum+" "+randnum1+" "+randnum2+" "+randnum3+" "+randnum4);
		
	}
}
