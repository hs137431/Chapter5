package exercises;

import java.util.Scanner;

public class IFStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your age >>>>>");
		age = input.nextInt();
		if(age >= 23 & age <30)
		{
			System.out.println("User is ready for the real world");
		}
		if(age >= 50 & age < 65)
		{
			System.out.println("User is middle aged");
		}
		if (age > 66 & age <= 100)
		{
			System.out.println("You are have had a long life");
		}
		if (age > 18) 
		{
			System.out.println("User is older than 18");
		}
	}

}
