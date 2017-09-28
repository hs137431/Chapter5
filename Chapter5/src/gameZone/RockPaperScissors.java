package gameZone;

import java.util.Random;

import javax.swing.JOptionPane;

public class RockPaperScissors {

	public static void main(String[] args) {
		for (int x = 0; x < 5; ++x) {
			displayRPS();
		}
	}
	public static void displayRPS()
	{
		String userEntryString, result = null;
		int userEntry;
		Random rand = new Random();
		int r = rand.nextInt(3) + 1;
		userEntryString = JOptionPane.showInputDialog(null, "Welcome to rock, paper,"
				+ " scissors. \n1 = Rock \n2 = Paper \n3 = Scissors");
		userEntry = Integer.parseInt(userEntryString);
		if(userEntry == 1)//rock
		{
			if(r == 3)//scissors
				result = "You Won!";
			if(r == 2)//paper
				result = "You Lose!";
			if(r == 1)//rock
				result = "Tie";
		}
		if(userEntry == 2)//Paper
		{
			if(r == 3)//scissors
				result = "You lose!";
			if(r == 2)//paper
				result = "Tie";
			if(r == 1)//rock
				result = "You Won!";
		}
		if(userEntry == 3)//Scissors
		{
			if(r == 3)//scissors
				result = "Tie";
			if(r == 2)//paper
				result = "You Won!";
			if(r == 1)//rock
				result = "You Lose!";
		}
		JOptionPane.showMessageDialog(null, "" + result);
	}

}
