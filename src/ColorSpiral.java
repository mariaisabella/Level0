import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ColorSpiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		//Random random = new Random();
		String sides;
		String speed;
		sides = JOptionPane.showInputDialog("give me a number of sides");
		speed = JOptionPane.showInputDialog("give me a number for speed");
		int number = Integer.parseInt(sides);
		int speeed = Integer.parseInt(speed);
		Robot steve = new Robot();
	
		// 5. Set your robot's pen to the down position
		steve.penDown();
		// 3. Set the robot to go at max speed (10)
		steve.setSpeed(speeed);
		// 4. Repeat the code below 75 times (you’ll need to move the mustache!)
		for (int i = 0; i < 75; i++) {
			// 7. Change the pen color to random
			steve.setRandomPenColor();
			// 6. Move the robot 5 times the current line number you are drawing
			// (5*i)
			steve.move(i * 5);
			// 2. Turn the robot 1/3 of 360 degrees to the right
			steve.turn(360 / number);

			// 8. Change the number of sides to 7 (don’t add a new line of code
			// for
			// this one!)

			// 9. Set the pen width to i
			steve.setPenWidth(i);
		}
	}
}
