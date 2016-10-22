import javax.swing.JOptionPane;

public class RiddleMeThis {
public static void main(String[] args) {
	
	int points = 0;
	
	String answer1 = JOptionPane.showInputDialog("What is a 7 letter word containing thousands of letters?");
	if (answer1.equalsIgnoreCase("A mailbox"));{
		points = points+1;
	}
	
	
	String answer2 = JOptionPane.showInputDialog("What did the tree wear to the pool?");
	if (answer2.equalsIgnoreCase("Swim trunks"));{
		points = points+1;
	}
	
	String answer3 = JOptionPane.showInputDialog("What do you call a lazy person?");
	if (answer3.equalsIgnoreCase("A programmer")){
		points = points+1;
	}
	
	JOptionPane.showMessageDialog(null, "You got " + points + "/3 right!");
}
	
}
