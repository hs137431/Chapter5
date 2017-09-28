package exercises;

import java.util.Scanner;

public class PizzaChoice {
	private static Scanner input  = new Scanner(System.in);
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String choiceYes;
		String toppingsChoice;
		String size;
		String pizzaKind;

		
		
		
		
		System.out.print("Would you like a pizza? Yes or No? >>>>>>>> ");
		choiceYes = input.nextLine();
		if("Yes".equals(choiceYes)||"yes".equals(choiceYes)||"Y".equals(choiceYes)||"y".equals(choiceYes));
		{
			System.out.println("You said " + choiceYes + " to having pizza");
			System.out.print("Please choose Small, Medium, or Large >>>>>> ");
			size = input.nextLine();
		}
			if("small".equals(size)|| "Small".equals(size))
			{
				displayPizzaSize(size);
				displayPizzaType();
				displayPrice(size);
									
			}
			if("medium".equalsIgnoreCase(size))
			{
				displayPizzaSize(size);
				displayPizzaType();
				displayPrice(size);
				
			}
			if("large".equalsIgnoreCase(size))
			{
				displayPizzaSize(size);
				displayPizzaType();
				displayPrice(size);
			}
		
		}
	
	public static void displayPrice(String size)
	{
		double mediumCost = 9.99;
		double largeCost = 12.99;
		double smallCost = 6.99;
		if("small".equalsIgnoreCase(size))
			System.out.println("The cost will be " + smallCost + " thank you");
		if("medium".equalsIgnoreCase(size))
			System.out.println("The cost will be " + mediumCost + " thank you");
		if("large".equalsIgnoreCase(size))
			System.out.println("The cost will be " + largeCost + " thank you");
	}
	public static void displayPizzaSize(String size)
	{
		System.out.println("You said " + size + " pizza size");
	}
	public static void displayPizzaType()
	{
		//displayPizzaSize(null);
		System.out.print("What kind of pizza do you want? Pepperoni, Sausage, or Cheese?");
		String pizzaKind = input.nextLine();
		System.out.println("You want " + pizzaKind);
		
	}

}
