import javax.swing.JOptionPane;

public class ThreeLetterAcronym {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Adedapo Adeniyi
		//11/3/2022
		
		StringBuilder sb = new StringBuilder();
		

		//Collect User input
		String threeWords = JOptionPane.showInputDialog("Please enter three words");
		
	
		
		//Scan User input
		for (int index = 0; index < threeWords.length(); index ++)
		{
			if(index ==0)
			{
				sb.append(threeWords.charAt(index));
			}
			else if (index >0 && threeWords.charAt(index-1)== ' ') 
			{
				if(sb.length() == 3) break;
				sb.append(threeWords.charAt(index));
				
			}
		}
		
		
		String ans = sb.toString();	
		
		System.out.println(ans.toUpperCase());
		

	}

}
