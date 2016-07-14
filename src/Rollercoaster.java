import javax.swing.JOptionPane;

public class Rollercoaster {
public static void main(String[] args) {
	String height=JOptionPane.showInputDialog("How many inches tall are you?");
	int heightNum=Integer.parseInt(height);	
	if(heightNum<48){
	JOptionPane.showMessageDialog(null, "Go grow some more and then come back again!");
	}
else if(heightNum>48){
	JOptionPane.showMessageDialog(null, "Welcome to the rollercoaster!  You are tall enough to ride!");
}
}
}
