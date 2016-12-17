import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery {
	public static void main(String[] args) {
		Random generator=new Random();
		String yournumber=JOptionPane.showInputDialog("What is your lottery #? Enter it like: x x x x x");
	
		
		String lotto= generator.nextInt(100)+" "+generator.nextInt(100)+" "+generator.nextInt(100)+" "+generator.nextInt(100)+" "+generator.nextInt(100);
		
		if(yournumber=lotto){
			JOptionPane.showMessageDialog(null, "Lit! You won the lotto! :)");
		}
		else{
			JOptionPane.showMessageDialog(null, "Sucks for u! Ur not the lucky winner :(");
		}
	}
}
