import java.util.Scanner;

public class Week2Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//Declare scanner input object
		Scanner userInput = new Scanner(System.in);

		//Declare variables
		double purchaseAmount;
		double paymentAmount = 0;
		double taxRate = 0.085;
		double totalAmount = 0;
        
		
		// Prompt user for input
		System.out.println("Please Enter the Cost of the Purchased Items:");
		purchaseAmount = userInput.nextDouble();
		
		System.out.println("Please Enter the Amount Paid:");
		
		paymentAmount = userInput.nextDouble();

		//calculating tax amount 
		double taxAmount = purchaseAmount * taxRate; 
		
		//calculating total amount payable by the user
		totalAmount = purchaseAmount + taxAmount;

		//calulcating change amount
		double changeAmount =  paymentAmount - totalAmount;

		//Compute total purchase and display a simple sales receipt



		//Display output
System.out.println("Cost of Items = " + "$" + String.format ("%.2f", purchaseAmount));
System.out.println("Taxes = " + "$" + String.format ("%.2f",taxAmount ));
System.out.println("Total Amount Payable = " + "$" + String.format ("%.2f",totalAmount));
System.out.println("Change = " + "$" + String.format ("%.2f",changeAmount));
	
	}

}
