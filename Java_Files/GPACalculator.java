
public class GPACalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Adedapo Adeniyi
		// 11/8/2022
		
		//declaring the variable
		double[] jsGradePoint = {3.5, 4.0, 3.0, 2.5, 3.5};
		double gradePointSum = 0;
		double average = 0;
		
		
		
		for (int i = 0; i < jsGradePoint.length; i++) { // looping through gradepoint array
			
			gradePointSum += jsGradePoint[i]; //adding the Array
		}
		
		average = gradePointSum/jsGradePoint.length; // calculating the average of the grade points
		
		System.out.println("The average GPA for the Semester is " + average); //printing out the average

	}

}
