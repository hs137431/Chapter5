package exercises;

import java.util.Scanner;

public class AscendingAndDescending {

	public static void main(String[] args) {
		// NO
		System.out.println("Please choose different numbers each time");
		int one, two, three;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your first Integer >>> ");
		one = input.nextInt();
		System.out.print("Please enter your second Integer >>> ");
		two = input.nextInt();
		System.out.print("Please enter your third Integer >>> ");
		three = input.nextInt();
		if (one == three| one == two| two == three) {
			System.out.println("You didn't listen to me when I said no repeating numbers");
		}
		if (one > two & two > three & one > three) {
			System.out.println("Going from highest to lowest your inputs were " + one + " " + two + " " + three);
			System.out.println("Going from lowest to highest your inputs were " + three + " " + two + " " + one);
		}
		if (one > two & three > two & one < three) {		
			System.out.println("Going from highest to lowest your inputs were " + three + " " + one + " " + two);
			System.out.println("Going from highest to lowest your inputs were " + two + " " + one + " " + three);
		}
		if (one < two & three < two & one > three) {		
			System.out.println("Going from highest to lowest your inputs were " + two + " " + three + " " + one);
			System.out.println("Going from highest to lowest your inputs were " + two + " " + one + " " + three);
		}
		if (one < two & three < two & one < three) {		
			System.out.println("Going from highest to lowest your inputs were " + two + " " + three + " " + one);
			System.out.println("Going from highest to lowest your inputs were " + two + " " + three + " " + one);
		}
	}
}
