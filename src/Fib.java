import javax.swing.JOptionPane;

public class Fib {
	public static void main(String[] args) {

		String question = JOptionPane.showInputDialog("How many Fibonacci numbers do you want?");
		int ans = Integer.parseInt(question);
			
		int i = 0;
		int j = 1;
		System.out.print(i);
		System.out.print(" " + j);

		for (int count = 2; count<ans; count++) {
			int k = i + j;
			i = j;
			j = k;
			System.out.print(" " + k);
		}
	}
}
