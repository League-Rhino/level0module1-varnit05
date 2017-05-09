import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {
public static void main(String[] args) {
	
	
	
	Random bob = new Random();
			
	int number = bob.nextInt(101);int correct  = 0;
	for (int i = 0; i < 100; i++) {
		
	
			
	
String guess = JOptionPane.showInputDialog("My number is less than 100, what is it?");

int hi = Integer.parseInt(guess);

correct = correct +1;
 if(number< hi){
	 JOptionPane.showMessageDialog(null,"Number is too high");
 }
 int lo = Integer.parseInt(guess);
	
 if(number> lo){
	 JOptionPane.showMessageDialog(null,"Number is too low");
 }
	
 int rit = Integer.parseInt(guess);
	
 if(number == rit){
	 JOptionPane.showMessageDialog(null,"Number is correct"); i = 100;
	 
 }
		
	}
	
	JOptionPane.showMessageDialog(null, "It took you "+ correct);
}
}
