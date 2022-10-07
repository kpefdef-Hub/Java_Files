 //Author Adedapo Adeniyi
	//Date 09122022
	//BINS 5312 Assignment 2 Q2
	//The Code uses the Scanner class to compute and display the pay slip of Ron

import java.util.Scanner;

public class Assgt2Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



				double taxRate = 8.5;

				

				//Declaring scanner input object

				Scanner scanner = new Scanner(System.in);

				



				//Declaring variables

				double hourlyRate =25.5;

				double overtimeRate = hourlyRate + (hourlyRate /2);;

				double grossPay = 0;

				

				double overtimeHours = 0;

				double regularHours = 0;

				





				// Prompt user for input

				System.out.println("Please hours worked");

				regularHours = scanner.nextDouble();

				

				System.out.println("Please enter your overtime hours");

				overtimeHours = scanner.nextDouble();

				System.out.println("*********************************");

				

				grossPay = (overtimeHours * overtimeRate) + (regularHours * hourlyRate);



				double incomeTax = 0.15 * grossPay;

				double retirementBenefits =  0.05 * grossPay;

				double healthBenefits = 0.05 * grossPay;

				double totalDeduction = incomeTax + retirementBenefits + healthBenefits;

				

				double netPay = grossPay - totalDeduction;

				//Using String format to limit to 2 Decimal Place

				System.out.println(String.format("GrossPay is $%.2f", grossPay));

				System.out.println(String.format("Health benefit deduction is $%.2f", healthBenefits));

				System.out.println(String.format("Retirement benefit deduction  is $%.2f", retirementBenefits)); 

				System.out.println(String.format("Income tax deduction is $%.2f", incomeTax));

				System.out.println(String.format("Netpay is $%.2f", netPay)); 



	}

}
