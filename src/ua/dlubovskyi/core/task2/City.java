package ua.dlubovskyi.core.task2;

import java.util.HashMap;

/**
 * City entity for 2nd task
 * 
 * @author Dlubovskyi Oleg
 *
 */
public class City {
	// index
	private int index;
	// name
	private String cityName;

	// map which contains heighors city id and cost of transportation there
	private HashMap<Integer, Integer> costToNeighors;

	/**
	 * Default constructor
	 * 
	 * @param index    -city index
	 * @param cityName -city name
	 */
	public City(int index, String cityName) {
		this.setIndex(index);
		this.setCityName(cityName);
	}

	/**
	 * @return the index
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * @param index the index to set
	 */
	public void setIndex(int index) {
		this.index = index;
	}

	/**
	 * @return the cityName
	 */
	public String getCityName() {
		return cityName;
	}

	/**
	 * @param cityName the cityName to set
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	/**
	 * @return the costToNeighors
	 */
	public HashMap<Integer, Integer> getCostToNeighors() {
		return costToNeighors;
	}

	/**
	 * 
	 * @param costToNeighors
	 */
	public void setCostToNeighors(HashMap<Integer, Integer> costToNeighors) {
		this.costToNeighors = costToNeighors;
	}

	/**
	 * Method for adding neighor city and cost of transportation there
	 * 
	 * @param index -of neighors city
	 * @param cost  -cost of transportation there
	 */
	public void addNeighor(int index, int cost) {
		costToNeighors.put(index, cost);
	}

}
