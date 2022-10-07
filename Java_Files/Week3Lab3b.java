import javax.swing.JOptionPane;

public class Week3Lab3b {

	public static void main(String[] args) {
		//Adedapo Adeniyi
		//09/17/2022
		//The code uses the if.. else statement and Math.random to simulate a dice roll
		

		//Setting Variables
		
		int diceDigit = 0;
		diceDigit =  (int) (Math.random()* 6 + 1);
		double betAmount = 0;
		int response = 0;
		String message = "";
		
		System.out.println(diceDigit);
		
		//Ask User to enter Bet Amount
		String result = JOptionPane.showInputDialog("Please enter Amount to Bet");
		betAmount = Double.parseDouble(result);
		
		//Ask User to roll the Dice
		
		response = JOptionPane.showConfirmDialog(null, " Go ahead and roll the Dice? ", "Dice Roller", 
				JOptionPane.YES_NO_CANCEL_OPTION);
		
		if(response==0)
		{
			diceDigit = (int) (Math.random()* 6 + 1);
			
			if(diceDigit == 1 || diceDigit == 2 || diceDigit == 3)
			{
				message = " You bet " + "$" + String.format ("%.2f", betAmount) + " You rolled " + diceDigit + " \n " + 
			" You forfeit your bet ";
			}
			else if (diceDigit == 4)
			{
				message = " You bet " + "$" + String.format ("%.2f", betAmount) + " You rolled " + diceDigit + " \n " + 
						" You get back your bet " + " \n " + " You get " + "$" + String.format ("%.2f", betAmount);
			}
			else if (diceDigit == 5)
			{
				message = " You bet " + "$" + String.format ("%.2f", betAmount) + " You rolled " + diceDigit + " \n " + 
						" You get half your bet " + " \n " + " You get " + "$" + String.format ("%.2f", betAmount/2);
			}
			else 
			{
				message = " You bet " + "$" + String.format ("%.2f", betAmount) + " You rolled " + diceDigit + " \n " + 
						" You get double your bet " + " \n " + " You get " + "$" + String.format ("%.2f", betAmount*2);
			}
		}
	//If player chooses not to Roll Dice	
		else
		{
			JOptionPane.showMessageDialog(null, "No Dice Rolled");
		}
		
		JOptionPane.showConfirmDialog(null, message);
			
		
		
		
		
				
	}

}
