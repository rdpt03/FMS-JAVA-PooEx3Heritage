package fr.fms.entities;

/**
 * Represents a capital city, which is a specialized type of {@link City} that includes a notable monument.
 * This class extends {@code City} and adds an additional attribute for the city's monument.
 * 
 * @author 
 */
public class Capital extends City {
	
	private String monument;

	/**
	 * Constructs a new {@code Capital} instance with the specified parameters.
	 *
	 * @param nVille     the name of the city
	 * @param nPays      the name of the country
	 * @param habitants  the number of inhabitants in the city
	 * @param monument   the main monument of the capital city
	 * @throws Exception if an error occurs when creating the city (inherited from {@code City})
	 */
	public Capital(String nVille, String nPays, int habitants, String monument) throws Exception {
		super(nVille, nPays, habitants);
		this.monument = monument;
	}

	/**
	 * Returns the main monument of the capital city.
	 *
	 * @return the monument of the city
	 */
	public String getMonument() {
		return monument;
	}

	/**
	 * Sets the main monument of the capital city.
	 *
	 * @param monument the monument to set
	 */
	public void setMonument(String monument) {
		this.monument = monument;
	}

	/**
	 * Returns a string representation of the capital city, including inherited city details
	 * and its main monument.
	 *
	 * @return a string containing information about the capital and its monument
	 */
	@Override
	public String toString() {
		return super.toString() + " d'habitants, monument : " + monument;
	}
}
