package exercises;

import org.jointheleague.graphical.robot.Robot;

public class FourSquare {

	public static void main(String[] args) {

		Robot rosa = new Robot();

		rosa.penDown();
		rosa.setPenWidth(20);
		rosa.setSpeed(5);

		for (int i = 0; i < 4; i++) {
			rosa.setRandomPenColor();
			rosa.turn(90);

			for (int j = 0; j < 4; j++) {
				rosa.move(100);
				rosa.turn(90);
			}
		}

	}

}
