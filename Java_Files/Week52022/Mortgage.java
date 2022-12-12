package Week52022;

public class Mortgage {

	// Name Adedapo Adeniyi
	// Date 11/23/2022
	// Course BINS 5312 Final Project

	// Declaring the properties
	private String loanID;
	private double loanAmount;
	private String firstName;
	private String lastName;
	private double squareFoot;
	private double homePrice;

	// set/mutator accessor methods

	public void setLoanID(String mortgageID) {
		loanID = mortgageID;
	}

	public void setLoanAmount(double loanSize) {
		loanAmount = loanSize;
	}

	public void setFirstName(String fName) {
		firstName = fName;
	}

	public void setLastName(String lName) {
		lastName = lName;
	}

	public void setSquareFoot(double sqFoot) {
		squareFoot = sqFoot;
	}

	public void setHomePrice(double homeCost) {
		homePrice = homeCost;
	}

	// Get/Accessor Methods
	public String getLoanID() {
		return loanID;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public double getSquareFoot() {
		return squareFoot;
	}

	public double getHomePrice() {
		return homePrice;
	}

	public double calculateOverAmount() // adding methods to calculate the loan amount to house value ratio
	{
		return homePrice - loanAmount;
	}

}
