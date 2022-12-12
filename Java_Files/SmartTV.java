
public class SmartTV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Adedapo Adeniyi
		//11/18/2022
		
		//Variables
		double [] pricesTV  = {450.20, 350.95, 400.00, 495.00, 350.00};
		double [] discountRate = {0.20, 0.15, 0.10, 0.08, 0.12};
		
		System.out.println("The new Prices for the TVs are: ");
		
		for (int i = 0; i < pricesTV.length; i++) { // looping through prices array
			
			double discount = pricesTV [i] * discountRate [i]; //calculating the discount prices
			
			double newPricesTV = pricesTV[i] - discount; //calculating the new prices
			
			System.out.println("$" + String.format("%,.2f",newPricesTV)); //printing out the new prices
			
		}

	}

}
