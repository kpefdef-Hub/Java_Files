import javax.swing.JOptionPane;

public class Week3Lab3 {

	public static void main(String[] args) {
		// Adedapo Adeniyi
		//09/17/2022
		//The code uses the if.. else statement to determine if a User is of age to buy alcohol in the US and Canada. It uses the JOptionPane 
		//object to display the options
		
//Defining the Variables
		
//Confirming US Residency 
	int response = 0;
	response = JOptionPane.showConfirmDialog(null, "Are You a Resident of the US?", "Residence Status", 
			JOptionPane.YES_NO_CANCEL_OPTION);
//Confirming US Age	
	if (response==0)
	{
		response = JOptionPane.showConfirmDialog(null, "Are You 21 years or older?", "Age Status", 
				JOptionPane.YES_NO_CANCEL_OPTION);
		
		if (response==0)
		{
			JOptionPane.showMessageDialog(null, "You can legally purchase Alcohol");
		}
	}
//Confirming Canadian Residency
	else
	{
		JOptionPane.showMessageDialog(null, "You are not a Resident of the US");
		response = JOptionPane.showConfirmDialog(null, "Are You a Resident of Canada ?", "Residence Status", 
				JOptionPane.YES_NO_CANCEL_OPTION);
//Confirming Canadian Age		
		if (response==0)
		{
			response = JOptionPane.showConfirmDialog(null, "Are You 18 years or older?", "Age Status", 
					JOptionPane.YES_NO_CANCEL_OPTION);
			
			if (response==0)
			{
				JOptionPane.showMessageDialog(null, "You can legally purchase Alcohol");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "You are underage and cannot legally purchase Alcohol");
			}
				
		}
		else
		{
			JOptionPane.showMessageDialog(null, "You are not a resident of the US "
					+ "or Canada, cannot legally purchase Alcohol");
		}
	}
	
	


}
	}

	

