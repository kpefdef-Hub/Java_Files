package Week52022;

public class Tesla {
			// Adedapo Adeniyi
			//09252022
			//BINS 5312 Lab 4
	public static void main(String[] args) {
		

		//Declaring Variables
		double savings = 2000;
		double MSRP = 75000;
		double amount = 0;
		int years = 1;
		double rate = 0.025;
		
		System.out.println("Year" + " " + "Amount");
		
		for (int x = 1; x > 0; x++)
		{
			amount = savings * Math.pow(1 + rate, years)+ amount ;
			System.out.println(years + " " + "$" + String.format("%,.2f",amount));
			years++;
			
			if (amount >= MSRP)
			{
				x = -1;
				System.out.println("In year"+" "+ years + " I will have saved" + " " +"$" +
				String.format("%,.2f", amount));
				
			}
		}
	}

}
