package ua.dlubovskyi.core.task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 *
 * @author Dlubovskyi Oleg
 *
 */
public class Task2 {

	/**
	 * Method for 2nd task execution
	 * 
	 * @see City
	 */

	public static void executeSecondTask() throws IOException {
		// cities container
		List<City> cities = new ArrayList<>();

		// input data reader src/input.txt
		BufferedReader reader = new BufferedReader(new FileReader("src/input.txt"));
		// getting count of test
		int testsCount = Integer.parseInt(reader.readLine());
		if (testsCount > 10 || testsCount < 1) {
			System.err.println("Invalid input!");
		}
		// getting count of cities input
		for (int i = 0; i < testsCount; i++) {
			int numberCities = Integer.parseInt(reader.readLine());
			if (numberCities > 10000 || numberCities < 2) {
				System.err.println("Invalid input!");
			}
			// create new city and adding connections
			City city = new City(numberCities);
			for (int cityIndex = 0; cityIndex < numberCities; cityIndex++) {
				city.addCity(reader.readLine());
				int neighbours = Integer.parseInt(reader.readLine());
				for (int neighboursIndex = 0; neighboursIndex < neighbours; neighboursIndex++) {
					String[] tempStr = reader.readLine().split(" ");
					city.addRouteCost(cityIndex, Integer.parseInt(tempStr[0]) - 1, Integer.parseInt(tempStr[1]));
				}
			}
			int routesCount = Integer.parseInt(reader.readLine());
			if (routesCount < 1 || routesCount > 100) {
				System.err.println("Invalid input!");
			}
			// adding connections to city
			String[][] paths = new String[routesCount][2];
			for (int routeIndex = 0; routeIndex < routesCount; routeIndex++) {
				String[] tempStr = reader.readLine().split(" ");
				paths[routeIndex][0] = tempStr[0];
				paths[routeIndex][1] = tempStr[1];
			}
			city.addPaths(paths);
			cities.add(city);
			reader.readLine();
			reader.close();
		}
		// count min cost
		int[][] result = new int[testsCount][];
		for (int i = 0; i < testsCount; i++) {
			result[i] = cities.get(i).getResult();
			for (int j = 0; j < result[i].length; j++) {
				System.out.println(result[i][j]);
			}
		}

	}

}
