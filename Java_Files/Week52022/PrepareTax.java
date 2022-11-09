package Week52022;

import javax.swing.JOptionPane;

public class PrepareTax {
	//Adedapo Adeniyi
	//10/30/2022

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variables
		String SSN, lastName,residentState, input;
		double yearIncome, taxLiability;
		boolean isMarried;
		
		
		//Prompt user for details
		SSN = JOptionPane.showInputDialog(null, "Enter your SSN", "Tax Info", 3);
		lastName = JOptionPane.showInputDialog(null, "Enter your Last Name", "Tax Info", 3);
		residentState = JOptionPane.showInputDialog(null, "Enter your State", "Tax Info", 3);
		
		input = JOptionPane.showInputDialog(null, "Enter your Yearly Income	", "Tax Info", 3);
		yearIncome = Double.parseDouble(input);
		
		int response = JOptionPane.showConfirmDialog(null, "Are you Married?", "Tax info",
				   JOptionPane.YES_NO_CANCEL_OPTION);
		
		if (response == 0)
		{
			isMarried = true;
		}
		else
		{
			isMarried = false;
		}
		
		
		TaxReturn yourTaxR = new TaxReturn();
		yourTaxR.setSocSec(SSN);
		yourTaxR.setLName(lastName);
		yourTaxR.setState(residentState);
		yourTaxR.setMStatus(isMarried);
		yourTaxR.setAnnIncome(yearIncome);
		taxLiability = yourTaxR.computeLiability();
		
		
		
		
		
		//Display Information
		System.out.println("Tax Returns");
		System.out.println("***********************");
		System.out.println("SSN: 	    	   " + yourTaxR.getSocSec());
		System.out.println("Last Name:   	   " + yourTaxR.getLName());
		System.out.println("State:             " + yourTaxR.getState());
		System.out.println("Marital Status:    " + (yourTaxR.getMStatus() ? "Married" : "Single"));
		System.out.println("Annual Income:	   " + "$" + String.format("%,.2f", yourTaxR.getAnnIncome()));
		System.out.println("Tax Liability: 	   " + "$" + String.format("%,.2f",taxLiability));

	}

	
	}


