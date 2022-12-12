
public class DemoSalesperson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Adedapo Adeniyi
		// 11/13/2022

		// Declaring the variables
		Salesperson[] salesPeople = new Salesperson[6];
		final int START_ID = 1001;
		final double START_SALES = 10000;
		
		System.out.println("ID   " + "  Sales");
		for (int i = 0; i < salesPeople.length; i++) { //looping through the salesPerson array
			salesPeople[i] = new Salesperson(START_ID + i, START_SALES + 10000 * i); //initializing salesperson with an ID and sales figure

			
			System.out.println(salesPeople[i].getId() + "   " + "$" + // displaying the instance with the ID and sales figure
							   String.format("%,.2f", salesPeople[i].getSales()));
		}

	}

}
