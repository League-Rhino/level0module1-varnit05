package variables_and_conditionals;

import javax.swing.JOptionPane;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipes".
 */
public class XGeeks {
public static void main(String[] args) {

        // 1. Save the superpower for each person in a variable.
				String danny = " you know nothing";
				String varnit = " you have the power of everything";
				String arnav = "you have the power of invisibility";
				String evan = " you have the power of sleep";
				
        // 2. Ask the user to enter a name. Store their answer in a variable.
				String answer = JOptionPane.showInputDialog("who's power would you want");
				
        // 3. Show the superpower in a pop-up, depending on the name entered. 
				if(answer.equalsIgnoreCase("danny"))
				{JOptionPane.showMessageDialog(null,danny);
				}
				if(answer.equalsIgnoreCase("varnit"))
						{JOptionPane.showMessageDialog(null,varnit);
						}
				if(answer.equalsIgnoreCase("arnav"))
						{JOptionPane.showMessageDialog(null,arnav);
						}
								
				if(answer.equalsIgnoreCase("evan"))
				{JOptionPane.showMessageDialog(null,evan);
				}

}


				
				
				
				
    }
