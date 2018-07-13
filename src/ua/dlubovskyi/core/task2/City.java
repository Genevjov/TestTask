package ua.dlubovskyi.core.task2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * City entity for 2nd task
 * 
 * @author Dlubovskyi Oleg
 *
 */
public class City {
	// cities
	private ArrayList<String> cities;
	// count of neigh
	private int connectedCitiesCount = 0;
	// array which collect prices
	private int[][] price;
	// array which collect path for work
	private int[][] pathsToFind;

	/*
	 * Default constructor
	 * 
	 */
	public City(int connectedCitiesCount) {
		this.connectedCitiesCount = connectedCitiesCount;
		cities = new ArrayList<>(connectedCitiesCount);
		price = new int[connectedCitiesCount][connectedCitiesCount];
		for (int i = 0; i < connectedCitiesCount; i++) {
			Arrays.fill(price[i], Integer.MAX_VALUE);
		}
	}

	/**
	 * Method for adding city to connected cities list
	 * 
	 * @param name - name of the city
	 */
	public void addCity(String name) {
		cities.add(name);
	}

	/**
	 * Method for adding route cost using params
	 * 
	 * @param departure   -current city
	 * @param destination -city we need to go
	 * @param cost        -price of transportation
	 */
	public void addRouteCost(int departure, int destination, int cost) {
		if (departure < 0 || destination < 0 || cost <= 0) {
			throw new IllegalArgumentException();
		}
		price[departure][destination] = cost;
	}

	/**
	 * Method for adding path to current city
	 * 
	 * @param paths -array with path
	 * @see Task2
	 */
	public void addPaths(String paths[][]) {
		pathsToFind = new int[paths.length][2];
		for (int i = 0; i < paths.length; i++) {
			pathsToFind[i][0] = cities.indexOf(paths[i][0]);
			pathsToFind[i][1] = cities.indexOf(paths[i][1]);
		}
	}

	/**
	 * Method for count min cost by all connected ways
	 */
	public int[] getResult() {
		int[] answer = new int[pathsToFind.length];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = calculateFromCity(pathsToFind[i][0])[pathsToFind[i][1]];
		}
		return answer;
	}

	/**
	 * Getting price of transportation from cityIndex to other cities
	 * 
	 * @param cityIndex -city index where we are
	 * @return prices -array of prices
	 */
	public int[] calculateFromCity(int cityIndex) {
		// cost length = connected cities count. Logic..
		int[] cost = new int[connectedCitiesCount];
		// def filling array for future comparison
		Arrays.fill(cost, Integer.MAX_VALUE);
		// cost from city to itself = '0' Logic.. Default boolean math rule
		cost[cityIndex] = 0;
		// init visited cities
		boolean[] visitedCity = new boolean[connectedCitiesCount];
		while (true) {
			// flag for cheaper way found alert
			int currentCity = -1;
			for (int i = 0; i < connectedCitiesCount; i++) {
				if (!visitedCity[i] && cost[i] < Integer.MAX_VALUE
						&& (currentCity == -1 || cost[currentCity] > cost[i])) {
					currentCity = i;
				}
			}

			if (currentCity == -1)
				break;
			// mark city as visited after manipulations
			visitedCity[currentCity] = true;
			// set price to prices
			for (int i = 0; i < connectedCitiesCount; i++) {
				if (!visitedCity[i] && price[currentCity][i] < Integer.MAX_VALUE) {
					cost[i] = Math.min(cost[i], price[currentCity][i] + cost[currentCity]);
				}
			}
		}
		return cost;
	}

}