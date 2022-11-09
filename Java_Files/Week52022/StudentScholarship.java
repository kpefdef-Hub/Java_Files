package Week52022;

import javax.swing.JOptionPane;

public class StudentScholarship {
	//Adedapo Adeniyi
	//10/08/2022
	
	public static double TuitionScholarship(double myGPA)
	{
		double amount = 0;
		
		if (myGPA > 3.25)
		{
			amount = 200;
			//amount =+ (myGPA - 3.25) * 2500;
			amount = amount + (myGPA -3.25)* 2500;
			return amount;
		}
		
		return amount;
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//declaring the variables
		double GPA=0;
		String name ="";
		double stipendB = 0;
		double stipendT = 0;
		double stipendR = 0;
		
		//Prompting user to enter details
		String input = JOptionPane.showInputDialog(null, "Enter GPA");
		GPA = Double.parseDouble(input);
		
		name = JOptionPane.showInputDialog(null, "Enter your Name");
		
		//Calling information from methods
		stipendB = BookScholarship (GPA);
		stipendT = TuitionScholarship (GPA);
		stipendR = ResearchScholarship (GPA);
		 
		//Printing message to Console
		String message = "Student Name " + name + "\n" +
				 "GPA          " + GPA + "\n" +
				 "Research     " + stipendR + "\n" +
				 "Books        " + stipendB + "\n" +
				 "Tuition      " + stipendT;
		System.out.println(message); 
		
	}
	
	public static double BookScholarship(double myGPA)
	{
		double funding= 0;
		
		funding = 10*myGPA;
		
		return funding;
	}

	public static double ResearchScholarship(double myGPA)
	{
		double funding= 0;
		if (myGPA > 3.50)
		{
			funding =(myGPA - 3.50) * 1000;
			return funding;
		}
		
		return funding;
	}
	
	
}
