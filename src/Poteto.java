import javax.swing.JOptionPane;

public class Poteto {
	public static void main(String[] args) {
		String want = JOptionPane.showInputDialog("Do you want to see a lit code? Yes or no?");
		if (want.equalsIgnoreCase("yes")) {
			String object = JOptionPane.showInputDialog("What would you like to count?");
			int count = 1;
			while (count <= 8) {
				if (count == 4) {
					JOptionPane.showMessageDialog(null, "4");
				} else if (count == 8) {
					JOptionPane.showMessageDialog(null, "more!");
				}

				else if (count <= 7) {
					JOptionPane.showMessageDialog(null, count + " " + object);
				}
				count++;
			}

		} else
			JOptionPane.showMessageDialog(null, ":(");
	}
}
