 import java.util.Random;

import javax.swing.JOptionPane;

// Copyright Wintriss Technical Schools 2013
public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100);
		// 2. Print out the random variable above
		System.out.println(random);
		// 11. do the following 10 times
		
			// 1. ask the user for a guess using a pop-up window, and save their response 
		String guess=JOptionPane.showInputDialog("I have a number between 1-100. You have 10 tries to guess what it is.\nWhen the system closes it means you won! Good Luck!\n\nGive it a try!");
			// 4. convert the users’ answer to an int (Integer.parseInt(string)) 
		int answer=Integer.parseInt(guess);

		for(int i=0;i<10;i++) {
		
			// 5. if the guess is correct
				// 6. win
			// 7. if the guess is high
				// 8. tell them it's too high
			// 9. if the guess is low
				// 10. tell them it's too low
			if(answer==random){
				JOptionPane.showMessageDialog(null, "Nice! You got it ;)");
				System.exit(0);
			} else if(answer<random){
				JOptionPane.showMessageDialog(null, "Hmm... A bit too low. Try again!");
				guess=JOptionPane.showInputDialog("Guess again");
				answer=Integer.parseInt(guess);
			} else if(answer>random){
				JOptionPane.showMessageDialog(null, "Too high! Go ahead and try again.");
				guess=JOptionPane.showInputDialog("Guess again");
				answer=Integer.parseInt(guess);
			}
			
		}
		// 12. tell them they lose
		JOptionPane.showMessageDialog(null, "Whoops! Your tries are up! Too bad...");
	}
}

