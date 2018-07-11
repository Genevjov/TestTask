package ua.dlubovskyi.core;

import java.util.Scanner;

/**
 * 
 *
 * @author Dlubovskyi Oleg
 *
 */
public class Task2 {
	/**
	 * Method for 3rd task execution
	 */
	public static void executeTaskThree() {

		Scanner scanner = new Scanner(System.in);
		int numberOfTests = scanner.nextInt();
		if (numberOfTests > 10 || numberOfTests < 1) {
			System.out.println("Invalid input");
			return;
		}
		int numbersOfCities = scanner.nextInt();
		if (numbersOfCities > 10000 || numbersOfCities < 1) {
			System.out.println("Invalid input");
			return;
		}
		for (int i = 1; i <= numbersOfCities; i++) {

		}
		if (scanner.nextLine().isEmpty()) {
			
		}
	}
}
