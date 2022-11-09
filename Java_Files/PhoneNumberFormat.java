import javax.swing.JOptionPane;

public class PhoneNumberFormat {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Adedapo Adeniyi
		//11/3/2022
		boolean shouldContinue = true;
		 
		while(shouldContinue) {
			StringBuilder sb = new StringBuilder();
			
			String phoneNum = JOptionPane.showInputDialog("Phone Number");
			
			
			for (int index = 0; index < phoneNum.length(); index ++)
			{
				
				if(index == 0)
				{
					sb.append("(");
				}
				
				if( index ==3)
				{
					sb.append(")");
				}
				
				if(index == 6) 
				{
					sb.append("-");

				}
				
				sb.append(phoneNum.charAt(index));
				
								
			}
			
			String fmtPhone = sb.toString();
			
			//
			if (phoneNum.length() == 10)
			{
				System.out.println(fmtPhone);
				shouldContinue = false;
			} else {
				System.out.println("Error");
			}			

			if(phoneNum.equals("999")) {
				shouldContinue = false;
			} 
			

		} 
		
	}
	
}
