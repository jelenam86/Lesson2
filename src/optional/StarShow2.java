package optional;

import org.jointheleague.graphical.robot.Robot;

/*
 * Asistent's task: when two lines intersect, the color changes. 
 * 
 * Probably it can be done simpler... :)
 * 
 * The main idea is the circles whose centers are two non-adjacent corner vertices of the star, 
 * and radius is the distance from the center to the adjacent corner vertex. The pentagram is regular 
 * (in this task, it has the same length edges and same angles), 
 * so the circles will pass through the intersection points of the edges.
 */

public class StarShow2 {

	Robot robot = new Robot("batman");
	
	void makeStars() {

		robot.setSpeed(8);
		float xRobot = 10;
		float yRobot = 950;
		int starSize = 25;

		for (int i = 0; i < 30; i++) {
			robot.setPenWidth(i);
			robot.setPos(xRobot, yRobot);
			drawStar(starSize);
			xRobot += starSize;
			yRobot -= starSize;
			starSize += 20;
			robot.turn(12);
			robot.setRandomPenColor();
		}
	}

	private void drawStar(int starSize) {

		robot.penDown();
		float x1 = robot.getX();
		float y1 = robot.getY();
		float x2 = 0;
		float y2 = 0;
		double x = 0;
		double y = 0;
		double d = 0;
		int s = 0;
		
		for (int i = 0; i < 5; i++) {
			
			if(i < 2)
			{
				robot.move(starSize);
				x2 = robot.getX();
				y2 = robot.getY();
				x = x1 - x2;
				y = y1 - y2;
				d = Math.sqrt(x*x + y*y);
				s = (int)(2*d - starSize);
				
			}			
			else if(i == 2)
			{
				robot.move((starSize - s)/2 + s);
				robot.setRandomPenColor();
				robot.move((starSize - s)/2);
			}
			else
			{
				robot.move((starSize - s)/2);
				robot.setRandomPenColor();
				robot.move(s);
				robot.setRandomPenColor();
				robot.move((starSize - s)/2);
			}
			robot.turn(144);
		}
	}


	public static void main(String[] args) {

		new StarShow2().makeStars();
	}
}