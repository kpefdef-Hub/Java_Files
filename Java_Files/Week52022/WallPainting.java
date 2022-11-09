package Week52022;

import javax.swing.JOptionPane;

public class WallPainting {
		//Adedapo Adeniyi
		//10/09/2022

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaring the Variables
		double roomLength;
		double roomWidth;
		String isCeiling = "No";
		
		double footage = 0;
		double gallonCount = 0;
		double paintAmount = 0;
		double laborAmount = 0;
		double totalAmount = 0;
		
		//Collecting input from user
		String input = JOptionPane.showInputDialog(null, "Enter Length of Room in feet");
		roomLength = Double.parseDouble(input);
		
		input = JOptionPane.showInputDialog(null, "Enter Width of Room in feet");
		roomWidth = Double.parseDouble(input);
		
//		input = JOptionPane.showInputDialog(null,"Will Ceiling be included? Enter 1 for Yes and 2 for No");
		String [] inputs = {"Yes", "No"};
		int inputDialog = JOptionPane.showOptionDialog(null, "Will Ceiling be included? Enter 1 for Yes and 2 for No", "Select an option", 0, 1, null, inputs, input);
		if (inputDialog == JOptionPane.YES_OPTION)
		{
			isCeiling = "Yes";
		}
			
		//Retrieving Data from Methods
		footage = CalculateFootage (roomLength, roomWidth);
		gallonCount = CalculateGallons(footage, isCeiling);
		paintAmount = CalculatePaintCost (gallonCount);
		laborAmount = CalculateLaborCost (gallonCount);
		
		//Calculating the Total Amount
		totalAmount = paintAmount + laborAmount;
		
		
		//Displaying the Message
		String message = 
		"Cost of Paint Job  " + "\n" +
		"Square Footage   = " + String.format("%,.2f",footage) + "\n" +
		"Ceiling Included = " + isCeiling + "\n" +
		"Gallons Required = " + String.format("%,.1f",gallonCount) + "\n" +
		"Paint Cost       = " + "$" + String.format("%,.2f",paintAmount) + "\n" +
		"Labor Cost       = " + "$" + String.format("%,.2f",laborAmount) + "\n" +
		"Total Cost       = " + "$" + String.format("%,.2f",totalAmount);
		System.out.println(message);
	}
	
	//Creating the CalculateFootage Method and calculating Squarefoot
	public static double CalculateFootage (double roomLength, double roomWidth)
	{
		double squareFoot;
		squareFoot = roomLength * roomWidth;
		
		return squareFoot;
	}
	
	//Creating the CalculateGallons Method and calculating number of required Gallons
	public static double CalculateGallons (double squareFoot, String isCeiling)
	{
		if (isCeiling == "Yes")
		{
			double gallon;
			gallon = (squareFoot/380)*1.25;
			
			return gallon;
		}
		else 
		{
			double gallon;
			gallon = (squareFoot/380)* 1;
			
			return gallon;
		}
	}
	
	//Creating the CalculatePaintCost Method and calculating cost of Paint needed
	public static double CalculatePaintCost (double gallon)
	{
		double paintCost = 0;
		paintCost = gallon * 38.0;
		
		return paintCost;
	}
	
	//Creating the CalculateLaborCost Method and calculating cost of Labor needed
	public static double CalculateLaborCost (double gallon)
	{
		double laborCost = 0;
		laborCost = gallon * 6 *150;
		
		return laborCost;
	}	

}
