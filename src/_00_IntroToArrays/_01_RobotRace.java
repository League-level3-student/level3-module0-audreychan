package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	
	static boolean hasWon = false;
	static Random amount = new Random();
	
	public static void main(String[] args) {
		Robot[] robots = new Robot[amount.nextInt(6)+2];
		
		for(int i = 0; i < robots.length; i++) {
			robots[i] = new Robot();
			robots[i].setX(i*100 + 60);
			robots[i].setY(400);
		}
		
		while(hasWon == false) {
			for(int i = 0; i < robots.length; i++) {
				robots[i].setSpeed(10);
				Random rand = new Random();
				robots[i].move(rand.nextInt(50));
				
				if(robots[i].getY() <= 0) {
					hasWon = true;
					System.out.println("Robot #" + (i + 1) + " wins!");
				}
			}
		}
	}
	
	
	
	//1. make a main method
		//2. create an array of 5 robots
		//3. use a for loop to initialize the robots.
			//4. make each robot start at the bottom of the screen, side by side, facing up
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
		//7. declare that robot the winner and throw it a party!
		//8. try different races with different amounts of robots.
	    //9. make the robots race around a circular track.
	
}
