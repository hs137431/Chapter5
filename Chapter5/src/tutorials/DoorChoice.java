package tutorials;

import javax.swing.JOptionPane;

public class DoorChoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String choiceString, secretAnswer, responseString;
		int doorChoice = 0, response = 0;
		while(response == 0) {
		choiceString = JOptionPane.showInputDialog(null, "Pick a door any door 1, 2, or 3.",
			"Door Choice", JOptionPane.INFORMATION_MESSAGE);
		doorChoice = Integer.parseInt(choiceString);
		
		//if statement structure for door choice
		if(doorChoice == 1)
		{
			JOptionPane.showMessageDialog(null, "You win Nothing!!!");
			responseString = JOptionPane.showInputDialog(null, "Would you like to try again? 0 for yes 1 for no >>>>>>>> ", 
					JOptionPane.INFORMATION_MESSAGE);
			response = Integer.parseInt(responseString);
		}
		if(doorChoice == 2)
		{
			JOptionPane.showMessageDialog(null, "You win less than Nothing!!!");
			responseString = JOptionPane.showInputDialog(null, "Would you like to try again? 0 for yes 1 for no >>>>>>>> ", 
					JOptionPane.INFORMATION_MESSAGE);
			response = Integer.parseInt(responseString);
		}
		if(doorChoice == 3)
		{
			JOptionPane.showMessageDialog(null, "You win A BRAND NEW BIKE!!!");
			responseString = JOptionPane.showInputDialog(null, "Would you like to try again? 0 for yes 1 for no >>>>>>>> ", 
					JOptionPane.INFORMATION_MESSAGE);
			response = Integer.parseInt(responseString);
		}
		if(doorChoice == 999)
		{
			JOptionPane.showMessageDialog(null, "You win the entire state of Iowa!!!");
			responseString = JOptionPane.showInputDialog(null, "Would you like to try again? 0 for yes 1 for no >>>>>>>> ", 
					JOptionPane.INFORMATION_MESSAGE);
			response = Integer.parseInt(responseString);
		}
		if (doorChoice != 1 && doorChoice != 2 && doorChoice != 3 && doorChoice != 999)
		JOptionPane.showMessageDialog(null, "That number was not an option, I said 1-3");
		}
		

}
}