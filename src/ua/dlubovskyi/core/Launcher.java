package ua.dlubovskyi.core;

/**
 * Class for launching application
 * 
 * @author Dlubovskyi Oleg
 */
public class Launcher {
	public static void main(String[] args) {
		// executing 1st task
		System.out.println("---------TASK 1------------");
		Task1.executeFirstTask(3);
		// executing 2nd task
		System.out.println("---------TASK 2------------");
		Task2.executeTaskThree();
		// executing 3rd task
		System.out.println("---------TASK 3------------");
		Task3.executeTask3(100);

	}
}
