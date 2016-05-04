import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
		
String date = JOptionPane.showInputDialog("When is your birthday? \n(mm/dd)");

if (date.equals("04/05")){
JOptionPane.showMessageDialog(null,"Happy Birthday!");
	}else{
	JOptionPane.showMessageDialog(null, "Happy Unbirthday!");
	}
	}
}
