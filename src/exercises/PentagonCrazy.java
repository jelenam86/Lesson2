package exercises;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class PentagonCrazy {

	private void makePrettyThings() {

		Robot rob = new Robot();

		rob.penDown();
		rob.setSpeed(10);
		rob.setPenColor(Color.ORANGE);

		int side = 5;
		double angle = 360 / side;

		for (int i = 0; i < 200; i++) {
			rob.move(i);
			rob.turn(angle);
			rob.turn(1);
			rob.setRandomPenColor();
			rob.setPenWidth(i);
		}

	}

	public static void main(String[] args) {

		new PentagonCrazy().makePrettyThings();
	}
}