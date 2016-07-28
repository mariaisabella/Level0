import javax.swing.JOptionPane;

public class ChooseYourOwnAdventure {
public static void main(String[] args) {
	
	String one=JOptionPane.showInputDialog("You are taking your giraffe for a casual walk on the moon.\nNext thing you know, the Sapuji alliance approaches you.\nThey give you two options. You can either join their murdering alliance, \nor risk your life jumping from the Black Sea to a floating saucer.\n\nType 'join' to join the aliance or 'jump' to jump.\nAt any time in your adventure, you can type 'dungeon' to live forever in a packed dungeon with hobos and rats. ");
if(one.equalsIgnoreCase("join")){
	String two=JOptionPane.showInputDialog("Now that you have chosen to join the alliance, you must go through initiation ceremony.\nThe first step requires you to either jump off the 9th story of a burning building or \nswim 3 meters while a shark who hasn't eaten for 3 years is behind you.\n\nType 'swim' to try and swim away from the shark or 'jump' to jump.\nAt any time in your adventure, you can type 'dungeon' to live forever in a packed dungeon with hobos and rats." );
	
if(two.equalsIgnoreCase("swim")){
	String three=JOptionPane.showInputDialog("Ahh, so you decide to swim. Fortunatly for you, a shark who hasn't eaten in 3 years is a dead shark. \nThe Sapuji respect your intelligence. That have one more test for you. They ask you to shoot the man next to you. \nHis name is Nick. Nick has never hurt anyone, nor done anythiung to ruin a life. But the only way you can join the alliance, \nis if you shoot. What are you going to do?\n\nType 'shoot' to shoot Nick or 'no' to refuse.\nAt any time in your adventure, you can type 'dungeon' to live forever in a packed dungeon with hobos and rats." );
	
	if(three.equalsIgnoreCase("no")){
		String six=JOptionPane.showInputDialog("My advice to you is to... RUN! GRAB NICK AND GET OUT OF THERE. THEY ARE AFTER THE BOTH OF YOU AND \nWILL NOT STOP UNTIL YOU ARE BOTH DEAD. You run flying out the window and safely roll on to the street. \nAs a car rushes by you and Nick duck behind a dumpster. The Sapuji do not see, you but they also do not give up. \nYou and Nick are in grave danger. Once either of you are seen you will be killed.\n\nType 'explore' to try and sneek out of your hiding spot and find a safer place or 'stay' to stay the night there. \nAt any time in your adventure, you can type 'dungeon' to live forever in a packed dungeon with hobos and rats." );
	}
}
	else if(two.equalsIgnoreCase("jump")){
			JOptionPane.showMessageDialog(null, "You are dead. If you had chosen to swim with the shark who hasn't eaten for 3 years,\nyou would have been swimmiung with a dead shark. Instead, you dies in a fire. \nFarewell, idiot... :)");
		}
	// DEAD		
			
	}else if(one.equalsIgnoreCase("dungeon")){
		JOptionPane.showMessageDialog(null, "Too bad... I thought you had potential...");
		
		//DEAD
	}
else if(one.equalsIgnoreCase("jump")){
	String four=JOptionPane.showInputDialog("After your attemt to jump (which did NOT work out well I mean come on how do you expect to jump from a salt \nfilled body of water to a flying saucer...) the Sapuji have decided to kill you... yea i said kILL YOU! \nYou have two options, swim away or fight back. \n\nType 'swim' to try and swim away from the alliance or 'fight' to fight back.\nAt any time in your adventure, you can type 'dungeon' to live forever in a packed dungeon with hobos and rats." );
	
	if(four.equalsIgnoreCase("swim")){
		String five=JOptionPane.showInputDialog("You're pushing your way through the water, your backpack creating drag behind you. The Sapuji almost has ypur foot when SWOOSH everything goes black...\nYou wake up with a bubble around your head. Scared, you start kicking and screaming but you can't move. Then you see these... things. Nameless things. At least they have no name where you are from. These 'things' have long, black, slimy tails. t\They have no heads, but a floating arrow for a body. The 'things' introduce themselves as your caretakers Henry and Joan. You are to rightened to say a work. How do they know english? How did you end up down here? Where are you? The )
	}
}
}
}