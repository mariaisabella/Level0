import javax.swing.JOptionPane;

public class MorningZombie {
	static void dayPrint(String dayOfWeek) {
		JOptionPane.showMessageDialog(null, "It's " + dayOfWeek + "! Wake up!");
		JOptionPane.showMessageDialog(null, "Get out of your comfy bed");
		JOptionPane.showMessageDialog(null, "Brush your teeth and wash your face :)");
	}

	public static void main(String[] args) {
		String day = JOptionPane.showInputDialog("What day is it?");

		if (day.equalsIgnoreCase("Monday") 
				|| day.equalsIgnoreCase("Tuesday") 
				|| day.equalsIgnoreCase("Wednesday") 
				|| day.equalsIgnoreCase("Thursday")
				|| day.equalsIgnoreCase("Friday")) {
			dayPrint(day);

			// if (day.equalsIgnoreCase("Monday")) {
			// dayPrint(day);
			// } else if (day.equalsIgnoreCase("Tuesday")) {
			// dayPrint(day);
			// } else if (day.equalsIgnoreCase("Wednesday")) {
			// dayPrint(day);
			// } else if (day.equalsIgnoreCase("Thursday")) {
			// dayPrint(day);
			// } else if (day.equalsIgnoreCase("Friday")) {
			// dayPrint(day);
		}
	}
}
