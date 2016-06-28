package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot Alex = new Robot();
Alex.penDown();
Alex.setRandomPenColor();
Alex.setSpeed(10);
Alex.setPenWidth(100);
Alex.sparkle();
for (int i = 0; i < 4; i++) {
Alex.move(500);	
Alex.turn(90);
}
		
}
}

