
public class Population {
		// Adedapo Adeniyi
		//09252022
		
	public static void main(String[] args) {
		
		
		//Declaring the variables
		int usaPop = 323000000;
		int mexPop = 128000000;
		double usaRate = 0.0015;
		double mexRate = 0.0101;
		int numYears = 1;
	
		System.out.println("The population of Mexico and USA");
		System.out.println("Year " +" "+ "Mexico" +" " + "USA");
	
		//Calculating the population of Mexico and USA
	for(int i = 1; i > 0; i++)
	{
		usaPop = (int)(usaPop*(1- usaRate));
		mexPop = (int)(mexPop*(1+ mexRate));
		System.out.println(numYears +   " "+ mexPop + " " + usaPop);
		numYears ++;
		
		//Identifying and printing the year Mexico's population is greater than the USA's
		if (mexPop > usaPop) 
		{
			i = -1;
			
			System.out.println("In year" + " " + numYears +  " the population of Mexico will be"
					+ " " + mexPop + "\n" + "and the population of the USA will be " + usaPop);
			
		}
		
	}
	}

}
