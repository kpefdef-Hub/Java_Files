package Week52022;

import javax.swing.JOptionPane;

public class Insurance {
	//Adedapo Adeniyi
	//10/08/2022
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaring the variables
		int currentYear = 0;
		int birthYear = 0;
		int age = 0;
		
		boolean isMale = false;
		double agePayment = 0;
		double totalPayment = 0;
		
		//Prompting user to enter details
		String input = JOptionPane.showInputDialog(null, "Enter Current Year");
		currentYear = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog(null, "Enter Year of Birth");
		birthYear = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog(null, "Enter 1 for Male or 2 for Female");
		int genderNumber = Integer.parseInt(input);
		
		if (genderNumber == 1)
		{
			isMale = true;
		}
		else
		{
			isMale = false;
		}
		
		
		age = currentYear - birthYear;
		
		//Calling information from methods
		agePayment = agePremium(age);
		totalPayment = totalPremium (agePayment, isMale);
		
		//Printing message to Console
		String message = 
				"Age               " + age + "\n" +
				"Age Premium       " + agePayment + "\n" +
				"Total Premium     " + totalPayment;
		System.out.println(message);


	}
	
	public static double agePremium (int myAge)
	{
		double insuranceAmount = 0;
		insuranceAmount =((myAge/10)+ 15) *20;
		
		return insuranceAmount;
	}
	
	public static double totalPremium (double premium, boolean isMale)
	{
		if(isMale == true)
		{
			premium = premium*(1+ .015);
			return premium;
		}
		return premium;
	}

}
