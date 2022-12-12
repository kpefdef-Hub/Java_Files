import javax.swing.JOptionPane;

public class BMICalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Adedapo Adeniyi
		//11/18/2022
		
		
		//Prompt User for height and weight
		double weight = Double.parseDouble(JOptionPane.showInputDialog("Please enter your Weight"));
		double height = Double.parseDouble(JOptionPane.showInputDialog("Please enter your Height"));
		
		//Calculating the BMI
		double BMI = (weight / (height * height)) * 703;
		
		System.out.println( "Your BMI is "+String.format("%,.2f", BMI)); // printing the BMI and the status
		
		if (BMI < 18.5 ) {
			System.out.println( "You are under weight");
		}
		
		else if (BMI >= 18.5 && BMI <= 25 ) {
			System.out.println( "You are normal weight");
		}
		
		else if (BMI >= 25 && BMI <= 30 ){
			System.out.println( "You are  overweight");
		}
		
		else if (BMI >30 ){
			System.out.println( "You are obese");
		}
		
		
		

	}

}
