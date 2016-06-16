import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		for(int i=0;i<10;i++){
	
			// 1. Watch the first 2 minutes of this movie: http://vimeo.com/2485018
			int randomNumber = new Random().nextInt(10);
			// 2. On paper, write all the numbers that get printed when you run this class
			System.out.println(randomNumber);
	
			// 3. Use the randomNumber to give the user a random compliment.
			
			if(randomNumber==0){
				JOptionPane.showMessageDialog(null, "I need more than 140 characters to tell you how beautiful you are.");
			}
			if(randomNumber==1){
				JOptionPane.showMessageDialog(null, "You are my loop condition. I keep coming back to you.");
			}
			if(randomNumber==2){
				JOptionPane.showMessageDialog(null, "I'm not a beater, a seeker, or a chaser.\nI'm a keeper.\n(It's Harry Potter you guys)");
			}
			if(randomNumber==3){
				JOptionPane.showMessageDialog(null, "Roses are #ff0000,\nViolets are #0000ff,\nI use hex codes,\nBut i'd use RGB for you.");
			}
			if(randomNumber==4){
				JOptionPane.showMessageDialog(null, "Are you a keyboard? Because you're my type!");
			}
			if(randomNumber==5){
				JOptionPane.showMessageDialog(null, "Are you google? Because you have everything I'm searching for.");
			}
			if(randomNumber==6){
				JOptionPane.showMessageDialog(null, "if(You Like Me) then{\n\tGO TO Date;\n\tLOOP(Kiss);\n\t}else{\n\tGO TO Home;\n\tLOOP(Cry);\n\t}");
			}
			if(randomNumber==7){
				JOptionPane.showMessageDialog(null, "Are you a 90 degree angle? Cause you lookin right ;)");
			}
			if(randomNumber==8){
				JOptionPane.showMessageDialog(null, "If you were a Transformer, you'd be Optimus Fine");
			}
			if(randomNumber==9){
				JOptionPane.showMessageDialog(null, "You are my semicolon; always present in everything I do.");
			}
			if(randomNumber==10){
				JOptionPane.showMessageDialog(null, "Is your name Wi-Fi? Because I'm feeling a connection.");
			}
			

		// 4. Repeat all the code above 10 times
		
		// 5. Find someone to test out your program. They will like it :)
		}
	}
}

