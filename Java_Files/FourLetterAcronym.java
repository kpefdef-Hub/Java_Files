import java.util.Scanner;


import javax.swing.JOptionPane;

public class FourLetterAcronym {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Adedapo Adeniyi
		// 11/8/2022

		// variables

		String msg = "";

		// collecting the user input
		System.out.print("Enter Course ID >>>>>>");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		
	
		
		if (input == null || input.length() < 4) {
			System.out.println("Invalid Input" );
			return;
		}
		String first4 = input.substring(0, 4); //declaring substring variables

		System.out.println("You entered " + input);
		
		//scanning the input
		if (first4.equalsIgnoreCase("BINS")) {
			msg = "It is offered in the Business Information Systems Department";
		} else if (first4.equalsIgnoreCase("ACCT")) {
			msg = "It is offered in the Accounting Department";
		} else if (first4.equalsIgnoreCase("MKTG")) {

			msg = "It is offered in the Marketing Department";
			
		} else if (first4.equalsIgnoreCase("FINC")) {
			msg = "It is offered in the Finance Department";

		} else if (first4.equalsIgnoreCase("MGMT")) {
			msg = "It is offered in the Management Department";
		}
		
		System.out.println(msg); //printing the message

	}

}
