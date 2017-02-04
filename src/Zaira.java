import org.jointheleague.graphical.robot.Robot;

public class Zaira {
	public static void main(String[] args) {

		Robot zaira = new Robot();
		
		zaira.penDown();
		zaira.setPenColor(175, 184, 221);
		for (int i = 0; i < 72; i++) {
			zaira.turn(5);
			zaira.move(5);
			zaira.sparkle();
		}	
		zaira.penUp();
		zaira.move(30);
		zaira.setPenColor(68, 68, 238);
		zaira.penDown();
		for (int i = 0; i < 72; i++) {
			zaira.turn(5);
			zaira.move(20);
			zaira.sparkle();
		}
	}
}
