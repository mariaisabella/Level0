import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball2 {
	public static void main(String[] args) {
		/// Create random number generator between 0-2
		Random random = new Random();

		//Create a for loop so the code runs 3 times
		for (int i = 0; i < 3; i++) {
			//Generate random number
			int number = random.nextInt(6);		
			// Print random number
			System.out.println(number);
			// Ask the user "What is your yes/no question"
			JOptionPane.showInputDialog(null, "What is your yes/no question?");
			// Set 0 to "It depends"
			if (number == 0) {
				JOptionPane.showMessageDialog(null, "It depends.");
			}
			// Set 1 to "yes"
			else if (number == 1) {
				JOptionPane.showMessageDialog(null, "Yes.");
			}
			// Set 2 to "no"
			else if (number == 2) {
				JOptionPane.showMessageDialog(null, "No.");
			} 
			// Set 3 to "Ask again later"
			else if (number == 3) {
				JOptionPane.showMessageDialog(null, "Ask again later.");
			} 
			// Set 4 to "Outcome looks good"
			else if (number == 4) {
				JOptionPane.showMessageDialog(null, "Outcome looks good.");
			} 
			// Set 5 to "Outcome looks bad"
			else {
				JOptionPane.showMessageDialog(null, "Outcome looks bad.");
			}
		
		}
	}
}
