package exercises;

import java.util.Scanner;
	// this is part 2 I messed up
public class CondoSales {
		//Page 294
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String CondoChoice;
		int cost, choice = 0, parkingChoice = 0;
		System.out.println("Are you getting a condo yes or no? >> ");
		CondoChoice = input.nextLine();
		if("Yes".equalsIgnoreCase(CondoChoice)||"Y".equalsIgnoreCase(CondoChoice)) {
			 System.out.println("Choose one of the following by the number");
			 System.out.print("Choice 1 park view $150,000, Choice 2 golf course view $170,000, "
			 		+ "Choice 3 lake view $210,000 Please choose 1, 2, or 3>> ");
			 choice = input.nextInt();
		}
		if (choice == 1) {
			cost = 150000;
			System.out.print("Would you like Choice 1 a Garage or Choice 2"
					+ " a Parking Space or Choice 3 Neither. Both cost $5000 >> ");
			parkingChoice = input.nextInt();
			if (parkingChoice == 1 || parkingChoice == 2) {
				cost = cost + 5000;
			}
			if (parkingChoice != 1 & parkingChoice != 2) {
				System.out.println("We appreciate you choosing us over our competitors");
			}
			System.out.println("Thank you your cost will be $" + cost);
		}
		if (choice == 2) {
			cost = 170000;
			System.out.print("Would you like Choice 1 a Garage or Choice 2"
					+ " a Parking Space or Choice 3 Neither. Both cost $5000 >> ");
			parkingChoice = input.nextInt();
			if (parkingChoice == 1 || parkingChoice == 2) {
				cost = cost + 5000;
			}
			if (parkingChoice != 1 & parkingChoice != 2) {
				System.out.println("We appreciate you choosing us over our competitors");
			}
			System.out.println("Thank you your cost will be $" + cost);
		}
		if (choice == 3) {
			cost = 210000;
			System.out.print("Would you like Choice 1 a Garage or Choice 2"
					+ " a Parking Space or Choice 3 Neither. Both cost $5000 >> ");
			parkingChoice = input.nextInt();
			if (parkingChoice == 1 || parkingChoice == 2) {
				cost = cost + 5000;
			}
			if (parkingChoice != 1 & parkingChoice != 2) {
				System.out.println("We appreciate you choosing us over our competitors");
			}
			System.out.println("Thank you your cost will be $" + cost);
		}
		if ("No".equalsIgnoreCase(CondoChoice)||"N".equalsIgnoreCase(CondoChoice)) {
			System.out.println("Thanks for visiting come back if you change your mind");
		}
		if (choice != 2 & choice != 1 & choice != 3) {
			cost = 0;
			System.out.println("That was not a choice your cost will be $" + cost);
		}
		
	}

}
