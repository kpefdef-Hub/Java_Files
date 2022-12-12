import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

import Week52022.Mortgage;

public class searchMortgage {
	// Name Adedapo Adeniyi
	// Date 11/26/2022
	// Course BINS 5312 Final Project

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declaring the variables
		// collecting input from loan agent
		int response = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Enter 1 to search for loan default report" + '\n' + "or 2 to search for Loan information",
				"Welcome to the Realty APP", JOptionPane.INFORMATION_MESSAGE));

		if (response == 2) {
			String fileLoanID, borrowerID, bFName, bLName, credScore;
			borrowerID = null;

			double loanAmount = 0, homeValue = 0, homeSquareFt = 0;
			String loanID = JOptionPane.showInputDialog(null, "Enter Loan ID to search", "Find Loan Info",
					JOptionPane.INFORMATION_MESSAGE);

			// Create Instance of Mortgage class
			Mortgage newMortgage = new Mortgage();

			boolean foundLoanID = false;
			try {

				BufferedReader br = new BufferedReader(new FileReader("loans.txt"));

				String line;

				while ((line = br.readLine()) != null) {
					int startIndex = 0;
					fileLoanID = line.substring(startIndex, line.indexOf(","));

					if (loanID.equalsIgnoreCase(fileLoanID)) {
						foundLoanID = true;
						startIndex = line.indexOf(",", startIndex) + 1;
						borrowerID = line.substring(startIndex, line.indexOf(",", startIndex));
						startIndex = line.indexOf(",", startIndex) + 1;
						loanAmount = Double.parseDouble(line.substring(startIndex, line.indexOf(",", startIndex)));
						startIndex = line.indexOf(",", startIndex) + 1;
						homeValue = Double.parseDouble(line.substring(startIndex, line.indexOf(",", startIndex)));
						startIndex = line.indexOf(",", startIndex) + 1;
						homeSquareFt = Double.parseDouble(line.substring(startIndex, line.indexOf(",", startIndex)));
						startIndex = line.indexOf(",", startIndex) + 1;

						newMortgage.setLoanID(loanID);
						newMortgage.setLoanAmount(loanAmount);
						newMortgage.setSquareFoot(homeSquareFt);
						newMortgage.setHomePrice(homeValue);

						break;
					}
				}

				br.close();

			}

			catch (IOException e) {
			}

			if (!foundLoanID) {
				JOptionPane.showMessageDialog(null, "Invalid Mortgage ID");
				return;
			}
			try {
				FileReader fr = new FileReader("borrowers.txt");
				BufferedReader br = new BufferedReader(fr);

				String line;

				while ((line = br.readLine()) != null) {
					int startIndex = 0;
					if (borrowerID.equalsIgnoreCase(line.substring(0, line.indexOf(",")))) {

						startIndex = line.indexOf(",", startIndex) + 1;
						bLName = line.substring(startIndex, line.indexOf(",", startIndex));
						startIndex = line.indexOf(",", startIndex) + 1;
						bFName = line.substring(startIndex, line.indexOf(",", startIndex));
						startIndex = line.indexOf(",", startIndex) + 1;
						credScore = line.substring(startIndex, line.length());

						newMortgage.setLastName(bLName);
						newMortgage.setFirstName(bFName);
						break;
					}
				}

				br.close();

			} catch (IOException e) {
			}

			// Display the information
			System.out.println("************Mortgage Information Search Results********************************");
			System.out.println("Mortgage ID				: " + newMortgage.getLoanID().toUpperCase());
			System.out.println(
					"Loan Amount				: " + "$" + String.format("%,.2f", newMortgage.getLoanAmount()));
			System.out.println(
					"Borrower Name				: " + newMortgage.getLastName() + " " + newMortgage.getFirstName());
			System.out.println(
					"Home Size				: " + String.format("%,.2f", newMortgage.getSquareFoot()) + " SQFT");
			System.out.println("Home Value				: " + "$" + String.format("%,.2f", newMortgage.getHomePrice()));

			double overValueAmount = 0;
			if (newMortgage.calculateOverAmount() < 0) {
				overValueAmount = Math.abs(newMortgage.calculateOverAmount());
			}

			System.out.println("Overvalue Amount			: " + "$" + String.format("%,.2f", overValueAmount));

			if (newMortgage.calculateOverAmount() < 0) {
				System.out.println("                                                                            ");
				System.out.println("Your loan is underwater");
				System.out.println("Loan amount more than home value");
			} else {
				System.out.println("There is Equity in your home loan");
			}
		} else if (response == 1) {

			try

			{
				FileWriter fw = new FileWriter("default.txt");

				FileReader fr = new FileReader("loans.txt");
				BufferedReader br = new BufferedReader(fr);
				String line;

				while ((line = br.readLine()) != null) {
					int startIndex = 0;
					startIndex = line.indexOf(",", startIndex) + 1;
					String borrowerID = line.substring(startIndex, line.indexOf(",", startIndex));
					startIndex = line.indexOf(",", startIndex) + 1;
					double loanAmount = Double.parseDouble(line.substring(startIndex, line.indexOf(",", startIndex)));
					startIndex = line.indexOf(",", startIndex) + 1;
					double homeValue = Double.parseDouble(line.substring(startIndex, line.indexOf(",", startIndex)));
					startIndex = line.indexOf(",", startIndex) + 1;
					double homeSquareFt = Double.parseDouble(line.substring(startIndex, line.indexOf(",", startIndex)));
					startIndex = line.indexOf(",", startIndex) + 1;

					String loanStatus = line.substring(startIndex, line.length());
					;

					if (loanStatus.equals("Default")) {

						System.out.println(line);
						fw.write(line);
						fw.write("\n");
					}

				}

				fw.close();
				br.close();

			} catch (Exception e) {

			}
		}
	}
}
