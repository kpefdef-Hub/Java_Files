import javax.swing.JOptionPane;

public class ArrayMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Adedapo Adeniyi
		// 11/10/2022

		// int[] testArrays = { 12, 45, 10, 12, 4, 80, 21, 20 };
		int[] myArrays = new int[8];
		String msg = "";
		String input = "";

		// prompt user to enter 8 values

		for (int sub = 0; sub < myArrays.length; sub++) {
			msg = "Enter value for  array number  " + (sub + 1);
			input = JOptionPane.showInputDialog(msg);
			myArrays[sub] = Integer.parseInt(input);

		}

		displayArrays(myArrays);
		displayRevArrays(myArrays);
		sumArrays(myArrays);
		belowAverage(myArrays);
		aboveAverage(myArrays);

	}

	public static void displayArrays(int[] someArrays) {
		// display all the integers
		String msg = "The elements in the arrays are \n";
		for (int index = 0; index < someArrays.length; index++) {
			msg = msg + someArrays[index] + "\n";
		}

		JOptionPane.showMessageDialog(null, msg);
	}

	public static void displayRevArrays(int[] someArrays) {

		String msg = "The elements in the arrays are in reverse order \n";
		for (int index = 0; index < someArrays.length; index++) {
			msg = msg + someArrays[(someArrays.length - 1) - index] + "\n";
		}

		JOptionPane.showMessageDialog(null, msg);
	}

	public static void sumArrays(int[] someArrays) {
		int sumNumbers = 0;
		String msg = "The sum of the numbers in the arrays is \n";
		for (int index = 0; index < someArrays.length; index++) {
			sumNumbers = sumNumbers + someArrays[index];
			
		}

		JOptionPane.showMessageDialog(null, msg + sumNumbers);
	}

	public static void belowAverage(int[] someArrays) {
		int sumNumbers = 0;
		double average = 0;
		String msg = "These numbers are less than the average of ";
		for (int index = 0; index < someArrays.length; index++) {
			sumNumbers = sumNumbers + someArrays[index];

		}
		average = sumNumbers / someArrays.length;
		msg = msg + average + "\n";

		for (int index = 0; index < someArrays.length; index++) {
			if (someArrays[index] < average) {
				msg = msg + someArrays[index] + "\n";
			}
		}
		JOptionPane.showMessageDialog(null, msg);

	}

	public static void aboveAverage(int[] someArrays) {
		int sumNumbers = 0;
		double average = 0;
		String msg = "These numbers are more than the average of ";
		for (int index = 0; index < someArrays.length; index++) {
			sumNumbers = sumNumbers + someArrays[index];

		}
		average = sumNumbers / someArrays.length;
		msg = msg + average + "\n";

		for (int index = 0; index < someArrays.length; index++) {
			if (someArrays[index] > average) {
				msg = msg + someArrays[index] + "\n";
			}
		}
		JOptionPane.showMessageDialog(null, msg);
	}
}
