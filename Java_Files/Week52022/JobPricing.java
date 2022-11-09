package Week52022;

import javax.swing.JOptionPane;

public class JobPricing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initializing the Variables
		double materialCost = 0;
		String jobName ="";
		double jobHours = 0;
		double travelHours = 0;
		double taxRate = 0.075;
		double taxCost = 0;
		double laborEstimate = 0;
		double totalCost = 0;
		double aftertaxAmount = 0;
		double payDiscount = 0; 
		
		//Prompting user for input
		String input = JOptionPane.showInputDialog(null, "Please enter name of the Job");
		jobName = input;
		
		input = JOptionPane.showInputDialog(null, "Please enter cost of the Materials");
		materialCost = Double.parseDouble(input);
		
		input = JOptionPane.showInputDialog(null, "Please enter number of hours of work required");
		jobHours = Double.parseDouble(input);
		
		input = JOptionPane.showInputDialog(null, "Please enter number of hours of travel time");
		travelHours = Double.parseDouble(input);
		
	
		
		//Retrieving data from methods
		laborEstimate = CalculateEstimate(materialCost, jobHours, travelHours);
		aftertaxAmount = ComputeTax (laborEstimate);
		payDiscount = ComputeDiscount (aftertaxAmount);
		
		taxCost = laborEstimate * taxRate;
		totalCost = aftertaxAmount - payDiscount;
		
		//Printing the Repair estimate
		String message =
		"Job Name      = " + jobName + "\n"+
		"Material Cost = " + "$" + String.format("%,.2f", materialCost) + "\n"+
		"Taxes         = " + "$" + String.format("%,.2f", taxCost) + "\n"+
		"Labor Cost    = " + "$" + String.format("%,.2f", laborEstimate) + "\n"+
		"Discount      = " + "$" + String.format("%,.2f", payDiscount) + "\n"+
		"Total Cost    = " + "$" + String.format("%,.2f", totalCost);
		
		System.out.println(message);

	}

	public static double CalculateEstimate (double materialCost, double jobHours, double travelHours) 
	{
		double laborEstimate = 0;
		
		laborEstimate = materialCost + (jobHours * 35)+ (travelHours * 12);
		
		return laborEstimate;
	}
	
	public static double ComputeTax(double laborEstimate)
	{
		double aftertaxAmount = 0;
		aftertaxAmount = laborEstimate + (laborEstimate * 0.075);
		
		return aftertaxAmount;
	}
	
	public static double ComputeDiscount (double aftertaxAmount)
	{
		double discount = 0;
		discount = aftertaxAmount * 0.025;
		
		return discount;
		
	}
	
}
	

