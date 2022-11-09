import javax.swing.JOptionPane;

public class ValidatePassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Adedapo Adeniyi 
		//11/2/2022
		
		//declare vriables
		String pwd1;
		String pwd2 = "DDeee2";
		String pwd3 = "wednesday";
		String message;
		
		int counterU = 0, counterL = 0, counterD = 0;
		boolean isValid = false;
		
		
		while (isValid == false)
		{
			pwd1 = JOptionPane.showInputDialog(null, "Enter your password");
		
		
		//look through text
		for(int position = 0; position < pwd1.length(); position ++)
		{
			if (Character.isUpperCase(pwd1.charAt(position))== true)
			{
				counterU = counterU + 1;
			}
			
			if (Character.isLowerCase(pwd1.charAt(position))== true)
			{
				counterL = counterL + 1;
			}
			
			if (Character.isDigit(pwd1.charAt(position))== true)
			{
				counterD = counterD + 1;
			}
		}
		
		if ((counterU >= 2) && (counterL >= 3) && (counterD >=1))
		{
			isValid = true;
		}
		
		else
		{
			isValid = false;
		}
		
		if (isValid == true)
		{
			message = "Password is Valid";
		}
		
		else 
		{
			message = "Password is Invalid. It must contain at least 2 uppercase values, 3 lowercase values and 1 digit";
		}
		
		System.out.println(message);
		
		}
		
		
		
		
		
	}

}
