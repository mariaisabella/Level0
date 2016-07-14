import javax.swing.JOptionPane;

public class ChooseYourOwnAdventure {
public static void main(String[] args) {
	String one=JOptionPane.showInputDialog("You are taking your giraffe for a casual walk on the moon.\nNext thing you know, the Sapuji alliance approaches you.\nThey give you two options. You can either join their murdering alliance, \nor risk your life jumping from the Black Sea to a floating saucer.\n\nType 'join' to join the aliance or 'jump' to jump.\nAt any time in your adventure, you can type 'dungeon' to live forever in a packed dungeon with hobos and rats. ");
if(one.equalsIgnoreCase("join")){
	JOptionPane.showInputDialog("Now that you have chosen to join the alliance, you must go through initiation ceremony.\nThe first step requires you to either jump off the 9th story of a burning building or \nswim 3 meters while a hungry shark is behind you.\nType 'swim' to try and swim away from the shark or 'jump' to jump.\nAt any time in your adventure, you can type 'dungeon' to live forever in a packed dungeon with hobos and rats. " );
}
}
}
