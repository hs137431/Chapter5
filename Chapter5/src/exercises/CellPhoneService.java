package exercises;

import javax.swing.JOptionPane;

public class CellPhoneService {

	public static void main(String[] args) {
		// Page 295 #4
		int planA = 49, planB = 55, planC = 61, planD = 70, planE = 79, planF = 87;
		String usersChoice;
		int talk , planChoice;
		int data, cost;
		 usersChoice = JOptionPane.showInputDialog(null,
		         "Please Choose a Plan \n1 - Less than 500 minutes of talk no text or Data $49"
		         + "\n2 - Less than 500 minutes of talk and any texting $55" +
		         "\n3 - 500 minutes or more of talk, up to 100 text messages, and no data $61 "
		         + "\n4 - 500 minutes or more of talk, 100 text messages or more, and no data $70"
		         + "\n5 - Up to 2 Gigabytes Data $79 \n6 - 2 Gigabytes or More $87");
		      planChoice= Integer.parseInt(usersChoice);
		      if(planChoice == 1) {
		    	  JOptionPane.showMessageDialog(null, "You plan is A and the cost is $" + planA);
		      }
		      if(planChoice == 2) {
		    	  JOptionPane.showMessageDialog(null, "You plan is B and the cost is $" + planB);
		      }
		      if(planChoice == 3) {
		    	  JOptionPane.showMessageDialog(null, "You plan is C and the cost is $" + planC);
		      }
		      if(planChoice == 4) {
		    	  JOptionPane.showMessageDialog(null, "You plan is D and the cost is $" + planD);
		      }
		      if(planChoice == 5) {
		    	  JOptionPane.showMessageDialog(null, "You plan is E and the cost is $" + planE);
		      }
		      if(planChoice == 6) {
		    	  JOptionPane.showMessageDialog(null, "You plan is F and the cost is $" + planF);
		      }
		      if(planChoice != 1 & planChoice != 2 & planChoice != 3 & planChoice != 4 & planChoice != 5
		    		  & planChoice != 6) {
		    	  JOptionPane.showMessageDialog(null, "That is not a choice");
		      }
	}

}
