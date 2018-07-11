package ua.dlubovskyi.core;

import java.util.HashMap;
import java.util.Scanner;

import ua.dlubovskyi.core.task2.City;

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
			String name = scanner.nextLine();
			City city = new City(i, name);
			int numOfNeigh = scanner.nextInt();
			HashMap<Integer, Integer> neighCost = new HashMap<>();
			for (int j = 0; i < numOfNeigh; j++) {
				String neighor = scanner.nextLine();
				neighCost.put(Character.getNumericValue(neighor.charAt(0)),
						Character.getNumericValue(neighor.charAt(3)));
			}
			city.setCostToNeighors(neighCost);

		}
		int numberOfCityCount = scanner.nextInt();
		if (scanner.nextLine().isEmpty()) {

		}
	}

}
