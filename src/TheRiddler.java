import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score=0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		
String answerT= JOptionPane.showInputDialog(null, "What is always coming but never arrives?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(answerT.equalsIgnoreCase("tomorrow"))
{JOptionPane.showMessageDialog(null, "Nice! You got it ;)");
score++;
}
else
{JOptionPane.showMessageDialog(null, "WORONG ._.\nThe right answer is tomorrow");
}

String answerO= JOptionPane.showInputDialog(null, "Take off my skin - I won't cry, but you will! What am I?");
if(answerO.equalsIgnoreCase("an onion"))
{JOptionPane.showMessageDialog(null, "Nice! You got it ;)");
score++;
}
else if(answerO.equalsIgnoreCase("onion"))
{JOptionPane.showMessageDialog(null, "Nice! You got it ;)");
score++;
}
else
{JOptionPane.showMessageDialog(null, "WORONG ._.\nThe right answer is tomorrow");
}


JOptionPane.showMessageDialog(null, "Your score is..."+score+"/2");

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}

