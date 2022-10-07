import java.util.Scanner; //Importing Scanner
//Adedapo Adeniyi
//09/18/2022
//Code uses Scanner and If.. else to help User select and appropriate Phone Plan

public class CellPhoneService

{

    public static void main (String args[])

    {
    // Initialize the Scanner
    Scanner input = new Scanner(System.in);

    // Prompt User for Maximum talk minutes per month
    System.out.println("Enter your  monthly talk minutes");
    	
    int maxTalkMinutes = input.nextInt(); //store user input

    // prompts User for maximum text messages per month
    System.out.println("Enter your maximum monthly text messages");
    	
    int maxTextMessages = input.nextInt(); //store user input

    // prompts Use for the  maximum data gigabytes used per month
    System.out.println("Enter your maximum data gigabytes");
    	
    int maxData = input.nextInt(); //store user input

    if(maxTalkMinutes < 500 && maxTextMessages == 0 && maxData == 0) { // Plan A check
    	
    // Display Plan A information 
    System.out.println("Name of Plan: Plan A");
    System.out.println("Price of Plan: $49 per month");
    	
    } else if(maxTalkMinutes < 500 && maxTextMessages > 0) { // Plan B check
    // Display Plan B information 
    System.out.println("Name of Plan: Plan B");
    System.out.println("Price of Plan: $55 per month");
    	
    } else if(maxTalkMinutes >= 500 && maxData == 0)  { // Plan C or Plan D check
    if(maxTextMessages < 100) {  // Plan C check
    // Display Plan C information
    System.out.println("Name of Plan: Plan C");
    System.out.println("Price of Plan: $61 per month");
    	
    } else if(maxTextMessages >= 100) { // Plan D check
    // Display Plan D information 
    System.out.println("Name of Plan: Plan D");
    System.out.println("Price of Plan: $70 per month");
    }
    	
    } else if(maxData > 0) { // Plan E or F check
    if(maxData < 3) { // Plan E check
    // Display Plan E information a
    System.out.println("Name of Plan: Plan E");
    System.out.println("Price of Plan: $79 per month");
    	
    } else if(maxData >= 3) { // Plan F check
    // // Display Plan F information 
    System.out.println("Name of Plan: Plan F");
    System.out.println("Price of Plan: $87 per month");
    }

         }
    }
   }