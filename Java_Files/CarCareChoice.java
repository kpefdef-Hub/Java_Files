import javax.swing.JOptionPane;

public class CarCareChoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Adedapo Adeniyi
		// 11/9/2022

		String[] carServices = { "oil change", "tire rotation", "battery check", "brake inspection" };
		double[] servPrices = { 25.0, 22.0, 15.0, 5, 0 };
		double servicePrice = 0;

		String msg1 = "";
		String input = "";
		String msg = "Please enter the fist 3 letters of the service of your choice \n" + "1. Oil Change \n"
				+ "2. Tire Rotation \n" + "3. Battery Check \n" + "4. Brake Inspection \n";

		// Display via JOptionPane
		input = JOptionPane.showInputDialog(msg);

		// Inspect each element of the array to confirm if the message is consistent

		for (int index = 0; index < carServices.length; ++index) {
			if (carServices[index].substring(0, 3).equalsIgnoreCase(input)) {
				// servicePrice = servPrices[index];
				msg1 = "You have selected " + carServices[index] + " which costs" + "\n" + "$"
						+ String.format("%.2f", servPrices[index]);
				JOptionPane.showMessageDialog(null, msg1);
				return;

			}

			else {
				msg1 = "Your selection is invalid";

			}

		}
		JOptionPane.showMessageDialog(null, msg1);

	}

}
