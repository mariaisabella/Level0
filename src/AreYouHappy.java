import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {

		String mood = JOptionPane.showInputDialog("Are you happy? Yes or no...");

		if (mood.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing! :)");
		}

		else if (mood.equalsIgnoreCase("no")) {
			String want = JOptionPane.showInputDialog("Do you want to be happy? (Please answer with either yes or no)");
			if (want.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null, "Change something. You CAN be happy.. \nCheck out http://www.realsimple.com/health/mind-mood/emotional-health/10-ways-happier");
			}
			if (want.equalsIgnoreCase("no")) {
				JOptionPane.showMessageDialog(null, "Keep doing what you're doing.");
			}
		} else {
			JOptionPane.showMessageDialog(null, "I didn't get that... try typing just 'yes' or 'no'");
		}

	}
}