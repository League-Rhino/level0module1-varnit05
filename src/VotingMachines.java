import javax.swing.JOptionPane;

public class VotingMachines {
	public static void main(String[] args) {
		
	
	String vote = JOptionPane.showInputDialog("Enter: How many people will be voting?");
	 int vote2 = Integer.parseInt(vote);

	for (int i = vote2; i > 0; i--) {String vote3 = JOptionPane.showInputDialog("Are you voting for the rock or bill nye?");
	 int rock = 0;	
	 int Bill = 0;
	 if(vote3.equalsIgnoreCase("the rock")){
rock += 1;}
	



 else if(vote3.equalsIgnoreCase("Bill nye")){
Bill += 1;
	 

	 
	 
	 
	 
	 
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
}