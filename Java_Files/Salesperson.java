
public class Salesperson {

	// Adedapo Adeniyi
	// 11/13/2022

	// Creating the Data fields
	private int id;
	private double sales;

	
	public void setId(int idNum) { // set/modifier methods
		id = idNum;
	}

	public void setSales(double salesAmt) {
		sales = salesAmt;
	}

	public int getId() { // get/accessor methods
		return id;
	}

	public double getSales() {
		return sales;
	}

	Salesperson(int idNum, double salesAmt) { // Set Constructor method for data fields
		id = idNum;
		sales = salesAmt;
	}
}
