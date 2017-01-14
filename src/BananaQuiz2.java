
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BananaQuiz2 {

	public static void main(String[] args) {
		String bananas;
		String hobby;
		String bread;
		String apples;
		String pie;
		String oranges;

		// 1. ask the user if they like bananas
		bananas = JOptionPane.showInputDialog("Do you like bananas?");
		// 2. if they say no,
		if (bananas.equalsIgnoreCase("no")) {
			bread = JOptionPane.showInputDialog(null, "Do you like banana bread?");
			if (bread.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null, "So you like banana bread but not bananas?? That's bananas!");
			} else if (bread.equalsIgnoreCase("no")) {
				apples = JOptionPane.showInputDialog(null, "That makes sense. Do you like apples?");
				if(apples.equalsIgnoreCase("yes")){
					JOptionPane.showMessageDialog(null, "An apple a day keeps the doctor away!");
				}
				if (apples.equalsIgnoreCase("no")) {
					pie = JOptionPane.showInputDialog("What about apple pie?");
					
				
					if (pie.equalsIgnoreCase("yes")) {
						JOptionPane.showMessageDialog(null, "So you like apple pie but not apples?? That's bananas!");
					} else if (apples.equalsIgnoreCase("no")) {
						oranges = JOptionPane.showInputDialog("That makes sense. Do you like oranges?");
						if (oranges.equalsIgnoreCase("yes")){
							JOptionPane.showMessageDialog(null, "Orange you glad you spent time doing this?!");
						}
						else{
							JOptionPane.showMessageDialog(null, "Orange you glad you spent time doing this?!");
						}
					}
				}
			} else {
				JOptionPane.showMessageDialog(null, "You're bananas!");
			}
		}
		// tell them they are crazy
		// and end quiz
		// 3. if they say yes
		else if (bananas.equalsIgnoreCase("yes")) {
			hobby = JOptionPane.showInputDialog("What is your favorite hobby?");
			JOptionPane.showMessageDialog(null, hobby + " is much better with bananas!");

		}
		// ask them what is their favorite hobby
		// show a pop up that says "<your hobby> is much better with bananas!"

		// 4. OPTIONAL: if they say something other than “yes” or “no”
		// show a pop up that says “You are bananas!”
		else {
			JOptionPane.showMessageDialog(null, "You are bananas!");
		}

	}

}
