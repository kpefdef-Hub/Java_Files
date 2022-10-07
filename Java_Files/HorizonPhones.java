

	//Import Scanner class
	import java.util.Scanner;

	public class HorizonPhones 
			//Adedapo Adeniyi
			//09252022
			
	{ 
		public static void main(String[] args) {
	
			Scanner input = new Scanner(System.in);

			//Prompt user to enter monthly talk minutes
			System.out.println("Enter the maximum monthly talk minutes used");
			int maxTalkMinutes = input.nextInt();

			//Prompts user to monthly text messages 
			System.out.println("Enter the maximum monthly text messages sent");
			int maxTextMessages = input.nextInt();

			//Prompts user for monthly data used
			System.out.println("Enter the maximum gigabytes of data used");
			int maxData = input.nextInt();

			if(maxTalkMinutes < 500 && maxTextMessages == 0 && maxData == 0) 
			{ 
			// Check for and display information about plan A
			System.out.println("Plan A: ($49.00");
			} 
			else if
			(maxTalkMinutes < 500 && maxTextMessages > 0 && maxData == 0) 
			{ 
			// Check for and display information about plan B
			System.out.println("Plan B: ($55.00");
			} 
			else if
			(maxTalkMinutes >= 500 && maxData == 0)  
			{ 
			// Check for plan C or D
			if(maxTextMessages <= 100) 
			{ 
			// Check for  and display information about plan C
			System.out.println("Plan C: ($61.00)");
			} 
			else if(maxTextMessages > 100) 
			{ 
			// Check for and display information about plan D
			
			System.out.println("Plan D: ($70.00)");
			}
			} 
			else if(maxTalkMinutes >= 500 && maxTextMessages > 0) 
			{ 
			if(maxData <= 3) 
			{ 
			// Check for and display information about plan E
			System.out.println("Plan E: ($79.00)");
			} 
			else if(maxData > 3) 
			{ 
			//Check for and display information about plan F
			System.out.println("Plan F: ($87.00)");
			}

}
}
}