package extra;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	public static void main(String[] args) {

		Robot amy = new Robot();
		amy.setSpeed(300);
		amy.penDown();
		amy.turn(90);
		amy.move(50);
		amy.turn(180);
		amy.move(50);
		amy.turn(90);
		amy.move(150);
		amy.turn(90);
		amy.move(50);
		amy.turn(180);
		amy.move(50);
		amy.turn(-90);
		amy.move(75);
		amy.turn(-90);
		amy.move(50);
	}

}
