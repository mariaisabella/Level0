import javax.swing.JOptionPane;

public class WhatShouldIWear {
	public static void main(String[] args) {
		int hot = JOptionPane.showConfirmDialog(null, "Is it hot today?");

		if (hot == 0) {
			JOptionPane.showMessageDialog(null, "Wear some flip flops!");
		} else {
			int rain = JOptionPane.showConfirmDialog(null, "Is it raining?");

			if (rain == 0) {
				JOptionPane.showMessageDialog(null, "Wear rain boots!");
			} else {
				int cold = JOptionPane.showConfirmDialog(null, "Is it cold?");
				System.out.println(cold);
				if (cold == 0) {
					JOptionPane.showMessageDialog(null, "Wear some ugg boots!");
				} else
					JOptionPane.showMessageDialog(null, "Close your eyes, spin in 3 circles, and wear the first thing you see!");
			}
		}
	}
}