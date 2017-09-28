package exercises;

import java.util.Scanner;

public class Pay {

	public static void main(String[] args) {
		// Page 295-296 #6
		int skillLevel, insuranceType;
		String retirementYN = null;
		double payRate = 0, hours = 0, grossPay, retirement = 0, hoursWorked, overtimePay = 0, regularRate;
		double medInsurance = 32.50, startingGrossPay, deductions = 0;
		double dentalInsurance = 20.0;
		double disabilityInsurance = 10.0;
		Scanner input = new Scanner(System.in);
		System.out.print("What is your skill level?");
		skillLevel = input.nextInt();
		System.out.print("What are your hours");
		hours = input.nextDouble();
		System.out.println("Choose 1 2 or 3");
		System.out.print("Do you have Medical Insurance #1, Do you have Dental Insurance #2, or Do "
				+ "you have Long Term Disability Insurance #3");
		insuranceType = input.nextInt();
		if (skillLevel == 1) {
			payRate = 17;
		}
		if (skillLevel == 2) {
			payRate =  20.00;
		}
		if (skillLevel == 3) {
			payRate = 22.00;
		}
		if (hours > 40) {
			hoursWorked = hours - 40;
			grossPay = ((hours - 40) * payRate);
			overtimePay = (payRate * 1.5) * hoursWorked;
			grossPay = grossPay + overtimePay;
		}
		if (hours <= 40 ) {
			grossPay = hours * skillLevel;
		}
		regularRate = skillLevel * 40;
		grossPay = payRate * hours; 
		startingGrossPay = grossPay;
		if (insuranceType == 1){
			deductions = medInsurance;
			grossPay = grossPay - medInsurance;
			
		}
		if (insuranceType == 2){
			deductions = dentalInsurance;
			grossPay = grossPay - dentalInsurance;
		}
		if (insuranceType == 3){
			deductions = disabilityInsurance;
			grossPay = grossPay - disabilityInsurance;
		}
		if (skillLevel == 3) {
			
			System.out.print("Would you like to participate in the retirement plan?");
				retirementYN = input.nextLine();
			}
		if ("Yes".equalsIgnoreCase(retirementYN) || "Y".equalsIgnoreCase(retirementYN)) {
			retirement = grossPay / 0.03;
			grossPay = grossPay / 0.03;
			}
		deductions = deductions + retirement;
		System.out.println("You worked " + hours + " hours with a pay rate of $" + payRate + " the average rate"
				+ " for 40 hours is $" + regularRate + " your overtime wages are $" + overtimePay + "the "
						+ "amount recieved without deductions is $" + startingGrossPay + " the deductions"
								+ " are $" + deductions + " this leaves you with a net pay of $" + grossPay);
		
		}

	}



