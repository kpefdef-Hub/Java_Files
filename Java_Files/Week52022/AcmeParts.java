package Week52022;
		//Adedapo Adeniyi
		//09252022
		//BINS 5312 Assignment 4
		
//Import Scanner class
import java.util.Scanner;

public class AcmeParts {

	public static void main(String[] args) {
		
		//Declaring Variables
		final double overtimeRate = 0.0105;
		final double retirementRate = 0.03;
		int hoursWorked = 0;
		int shiftWorked = 0;
		int retirementPlan = 0;
		double hourlyRate = 0;
		double regularPay = 0;
		double overtimePay = 0;
		double retirementAmount = 0;
		double totalPay = 0;
		double netPay = 0;
		
		//Entering Shift
		System.out.println("Please enter Shift worked: 1,2,3");
		Scanner Keyboard = new Scanner(System.in);
		shiftWorked = Keyboard.nextInt();
		
		if (shiftWorked == 1) 
			{
			hourlyRate = 17;
			}	
		if(shiftWorked == 2)
			{
			hourlyRate = 18.50;
			}
		if(shiftWorked ==3)
			{
			hourlyRate = 22;
			}
		
		
		//Entering Hours Worked
		System.out.println("Please enter total number of hours worked");
		Scanner keyboard = new Scanner(System.in);
		hoursWorked = keyboard.nextInt();
		
	   if (hoursWorked <= 40) 
	   {
		   regularPay = hoursWorked * hourlyRate;
		   totalPay = regularPay;
	   }
	   else 
	   {
		   regularPay = hoursWorked * hourlyRate;
		   overtimePay = hoursWorked * hourlyRate * overtimeRate;
		   totalPay = regularPay + overtimePay;
		   
	   }
	   	
		
		//Entering if Worker elects for a Retirement Plan
		if (shiftWorked == 1)	
		{
			netPay	= totalPay;

		
		}
		
		else
			{
		System.out.println("Do you want to be on the Retirement plan?" + "\n" +
			"(Enter 1 for Yes, 2 for No) ");
		retirementPlan = keyboard.nextInt();
			}
		
		if (retirementPlan == 1)
		{
			retirementAmount = totalPay * retirementRate;
			netPay = totalPay - retirementAmount;
			
		System.out.println("Please see below Pay breakdown:");
		System.out.println("Hours Worked  " + hoursWorked + "\n" +"Shift Worked  " + shiftWorked + "\n" +
				"Hourly Pay Rate  " + "$" + String.format("%,.2f", hourlyRate)  + 
				"\n" +"Regular Pay  " + "$" + String.format("%,.2f", regularPay)  + "\n" + "Overtime Pay  " 
				+ "$" + String.format("%,.2f", overtimePay)+ "\n" + "Gross Pay  " + "$" + String.format("%,.2f", totalPay) +
				"\n" + "Retirement Deduction  " + "$" + String.format("%,.2f", retirementAmount) + 
				"\n" + "Net Pay  " +"$" + String.format("%,.2f", netPay));
			}
		
		else 
		{
			netPay	= totalPay;
			{System.out.println("Please see below Pay breakdown:");
			System.out.println("Hours Worked  " + hoursWorked + "\n" + "Shift Worked  " + shiftWorked + "\n" +
					"Hourly Pay Rate  " + "$" + String.format("%,.2f", hourlyRate) + "\n" +  "Regular Pay  " + "$" + String.format("%,.2f", regularPay) 
					+ "\n" + "Overtime Pay  " + "$" + String.format("%,.2f", overtimePay)+
					"\n" + "Gross Pay  " + "$" + String.format("%,.2f", totalPay) + "\n" + "Net Pay  " + "$" + String.format("%,.2f", netPay) );
			}
		}		
}
}
