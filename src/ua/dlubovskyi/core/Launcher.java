package ua.dlubovskyi.core;

import java.io.IOException;

import ua.dlubovskyi.core.task1.Task1;
import ua.dlubovskyi.core.task2.Task2;
import ua.dlubovskyi.core.task3.Task3;

/**
 * Class for launching application
 * 
 * @author Dlubovskyi Oleg
 */
public class Launcher {
	public static void main(String[] args) throws IOException {
		// executing 1st task
		System.out.println("---------TASK 1------------");
		Task1.executeFirstTask(3);
		// executing 2nd task
		System.out.println("---------TASK 2------------");
		Task2.executeSecondTask();
		// executing 3rd task
		System.out.println("---------TASK 3------------");
		Task3.executeTask3(100);

	}
}
