package fr.fms.entities;

/**
 * Represents a city with a name, country, and number of inhabitants.
 * This class provides constructors for creating cities with different sets of initial information,
 * as well as methods to modify and retrieve city data. It also tracks the total number of created city instances.
 * 
 * Each city must have a non-negative number of inhabitants; otherwise, an {@link Exception} is thrown.
 * 
 * @author 
 */
public class City {
	/*
	public String nVille;
	public String nPays;
	public int habitants;
	*/
	private String cityName;
	private String countryName;
	private int inhabitants;
	private static int citiesCount = 0;
	
	//---------constructors----------
	/**
	 * Constructs a {@code City} object with a name, country, and number of inhabitants.
	 *
	 * @param nVille     the name of the city
	 * @param nPays      the name of the country
	 * @param habitants  the number of inhabitants
	 * @throws Exception if the number of inhabitants is negative
	 */
	public City(String nVille, String nPays, int habitants) throws Exception {
		if(habitants < 0) {
			throw new Exception("La ville "+ nVille +" ne peut contenir moins de 0 habitants");
		}
		this.cityName = nVille;
		this.countryName = nPays;
		this.inhabitants = habitants;
		City.citiesCount++;
	}
	
	/**
	 * Constructs a {@code City} object with a name and number of inhabitants.
	 * The country is set to "unknown" by default.
	 *
	 * @param nVille     the name of the city
	 * @param habitants  the number of inhabitants
	 * @throws Exception if the number of inhabitants is negative
	 */
	public City(String nVille, int habitants) throws Exception {
		if(habitants < 0) {
			throw new Exception("La ville "+ nVille +" ne peut contenir moins de 0 habitants");
		}	
		this.cityName = nVille;
		this.countryName = "unknown";
		this.inhabitants = habitants;
		City.citiesCount++;
	}
	
	/**
	 * Constructs a {@code City} object with a name and a country.
	 * The number of inhabitants is initialized to zero.
	 *
	 * @param nVille  the name of the city
	 * @param country the name of the country
	 * @throws Exception if the number of inhabitants would be negative (should not occur)
	 */
	public City(String nVille, String country) throws Exception {
		if(inhabitants < 0) {
			throw new Exception("La ville "+ nVille +" ne peut contenir moins de 0 habitants");
		}	
		this.cityName = nVille;
		this.countryName = country;
		this.inhabitants = 0;
		City.citiesCount++;
	}
	

	//----------------------getters and setters---------------------

	/**
	 * Returns the name of the city.
	 *
	 * @return the city name
	 */
	public String getCityName() {
		return cityName;
	}

	/**
	 * Sets the name of the city.
	 *
	 * @param cityName the new city name
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	/**
	 * Returns the name of the country the city belongs to.
	 *
	 * @return the country name
	 */
	public String getCountryName() {
		return countryName;
	}

	/**
	 * Sets the name of the country the city belongs to.
	 *
	 * @param countryName the new country name
	 */
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	/**
	 * Returns the number of inhabitants in the city.
	 *
	 * @return the number of inhabitants
	 */
	public int getInhabitants() {
		return inhabitants;
	}

	/**
	 * Sets the number of inhabitants in the city.
	 *
	 * @param habitants the new number of inhabitants
	 * @throws Exception if the number of inhabitants is negative
	 */
	public void setInhabitants(int habitants) throws Exception {
		if(habitants < 0) {
			throw new Exception("La ville "+ this.countryName +" ne peut contenir moins de 0 habitants");
		}
		this.inhabitants = habitants;
	}

	/**
	 * Adds a number of inhabitants to the current city population.
	 *
	 * @param inhabitantsToAdd the number of inhabitants to add
	 * @throws Exception if the resulting number of inhabitants is negative
	 */
	public void addHabitants(int inhabitantsToAdd) throws Exception {
		this.setInhabitants(this.getInhabitants() + inhabitantsToAdd);
	}

	/**
	 * Returns the total number of created city instances.
	 *
	 * @return the number of {@code City} objects created
	 */
	public static int getCitiesQuantity() {
		return citiesCount;
	}

	/**
	 * Displays the city information using {@link #toString()}.
	 */
	public void display() {
		System.out.println(this.toString());
	}
	
	/**
	 * Returns a string representation of the city, including its name and country.
	 *
	 * @return a string with the city's name and country
	 */
	@Override
	public String toString() {
	    return "Ville de " + this.cityName + " en/au " + this.countryName; // +
	           //(this.inhabitants > 0 ? " ayant " + this.inhabitants + " habitants" : "");
	}

}
