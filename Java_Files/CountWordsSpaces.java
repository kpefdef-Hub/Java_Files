import javax.swing.JOptionPane;

public class CountWordsSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Adedapo Adeniyi
		//11/2/2022
		
		String quote1 = "Count the spaces in this sentence";
		
		String quote = JOptionPane.showInputDialog("Enter a Quote");
		
		int countSpace = 0, countWords = 0;
		
		for (int index = 0; index < quote.length(); index ++)
		{
			if (Character.isWhitespace(quote.charAt(index)) == true)
			{
				countSpace = countSpace +1;
				countWords = countWords +1;
			}
		}
		
		String message = "Your quote has " + countSpace + " spaces " + (countWords+1) + " words ";
		
		System.out.println(message);

	}

}
