package exercises;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int response = 1;
		Scanner input = new Scanner(System.in);
		int evenOdd;
		while (response == 1){
			
		
		System.out.print("Please enter an Integer between 1 & 10 >> ");
		evenOdd = input.nextInt();
		if (evenOdd == 1| evenOdd == 3| evenOdd == 5| evenOdd == 7| evenOdd == 9) {
			System.out.println("The number is odd!");
		}
		else;
		if (evenOdd == 2| evenOdd == 4| evenOdd == 6| evenOdd == 8| evenOdd == 10) {
			System.out.println("The number is even!");
		}
		
		else; 
		if (evenOdd != 1 & evenOdd != 3 & evenOdd != 5 & evenOdd != 7 &
			+ evenOdd != 9 & evenOdd != 2 & evenOdd != 4 & evenOdd != 8 & evenOdd != 10 & evenOdd != 6){
		
		System.out.println("That number is not between 1 and 10!!!");
		}
		System.out.print("Wiykd yiy like to enter another number? 1 for yes 2 for no >>>> ");
		response = input.nextInt();
	}
	}

}
