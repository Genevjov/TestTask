package ua.dlubovskyi.core.task2;

import java.util.List;

/**
 * 
 * @author Zver
 *
 */
public class CityGraph {
	private static List<City> cities;

	/**
	 * 
	 * @param city
	 */
	public static void addCity(City city) {
		cities.add(city);
	}

	/**
	 * 
	 * @param city
	 */
	public static void removeCity(City city) {
		cities.remove(city);

	}

	/**
	 * 
	 * @param firstCity
	 * @param secondCity
	 * @return
	 */
	public static int getMinTransportationCost(String firstCity, String secondCity) {

		if (validateCitiesNames(firstCity) && validateCitiesNames(secondCity)) {
			int currentMinCost = Integer.MAX_VALUE;
			City from = getCityByName(firstCity);
			City to = getCityByName(secondCity);
			City currentCity = from;
			if (!from.getCostToNeighors().containsKey(to.getIndex())) {
			}
			return currentMinCost;
		}
		return -1;
	}

	/**
	 * 
	 * @param name
	 * @return
	 */
	private static boolean validateCitiesNames(String name) {
		for (City city : cities) {
			if (city.getCityName().equals(name)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 
	 * @param name
	 * @return
	 */
	private static City getCityByName(String name) {
		for (City city : cities) {
			if (city.getCityName().equals(name)) {
				return city;
			}
		}
		return null;
	}

}
