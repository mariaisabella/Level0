import javax.swing.JOptionPane;

public class Calculator {
	public static void main(String[] args) {
		String ans1 = JOptionPane.showInputDialog("Enter a number.");
		String ans2 = JOptionPane.showInputDialog("Enter a second number");
		
		int num1 = Integer.parseInt(ans1);
		int num2 = Integer.parseInt(ans2);
	
		int answer1 = add(num1, num2);
		int answer2 = sub(num1, num2);
		int answer3 = mult(num1, num2);
		int answer4 = div(num1, num2);
		JOptionPane.showMessageDialog(null, "Your answer when adding is " + answer1 +"\nYour answer when subtracting is " + answer2 + "\nYour answer when multiplying is " + answer3 + "\nYour answer when dividng is " + answer4);
		
	}
	
	static int add(int x,int y){
		return x+y;
	}
	
	static int sub(int x,int y){
		return x-y;
	}
	
	static int mult(int x,int y){
		return x*y;
	}
	
	static int div(int x,int y){
		return x/y;
	}
	
}
