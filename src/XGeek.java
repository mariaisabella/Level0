// Copyright Wintriss Technical Schools 2014
import javax.swing.JOptionPane;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipies".
 */
public class XGeek {
public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
	String June = ("June can put her foot behind her head and writes amazing recipies");
	String Maria = ("Maria can eat a lot, including bad guys");
	String Savanah = ("Savanah is good at (skipping) volleyball");
	String Mychal = ("Mychal is mind compelling. Don't mess with her...");
	String Heather = ("Heather can make her last name have every letter of the alphabet and is an amazing DJ");
	String Wren = ("Wren can shapeshift. Shes basically a cool elastic woman");
		// 2. Ask the user to enter a name. Store their answer in a variable.
	String name = JOptionPane.showInputDialog("Enter the name of a classmate");
	if (name.equalsIgnoreCase("June")){
		JOptionPane.showMessageDialog(null, June);
	}
	if (name.equalsIgnoreCase("Maria")){
		JOptionPane.showMessageDialog(null, Maria);
	}
	if (name.equalsIgnoreCase("Savanah")){
		JOptionPane.showMessageDialog(null, Savanah);
	}
	if (name.equalsIgnoreCase("Mychal")){
		JOptionPane.showMessageDialog(null, Mychal);
	}
	if (name.equalsIgnoreCase("Heather")){
		JOptionPane.showMessageDialog(null, Heather);
	}
		
	if (name.equalsIgnoreCase("Wren")){
		JOptionPane.showMessageDialog(null, Wren);
	}
}
		// 3. Show the superpower in a pop-up, depending on the name entered. 

}	