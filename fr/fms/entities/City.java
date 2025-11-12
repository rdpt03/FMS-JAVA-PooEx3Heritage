package fr.fms.entities;

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
	public City(String nVille, String nPays, int habitants) throws Exception {
		if(habitants < 0) {
			throw new Exception("La ville "+ nVille +" ne peut contenir moins de 0 habitants");
		}
		this.cityName = nVille;
		this.countryName = nPays;
		this.inhabitants = habitants;
		City.citiesCount++;
	}
	
	public City(String nVille, int habitants) throws Exception{
		if(habitants < 0) {
			throw new Exception("La ville "+ nVille +" ne peut contenir moins de 0 habitants");
		}	
		this.cityName = nVille;
		this.countryName = "unknown";
		this.inhabitants = habitants;
		City.citiesCount++;
	}
	
	public City(String nVille, String country) throws Exception{
		if(inhabitants < 0) {
			throw new Exception("La ville "+ nVille +" ne peut contenir moins de 0 habitants");
		}	
		this.cityName = nVille;
		this.countryName = country;
		this.inhabitants = 0;
		City.citiesCount++;
	}
	

	//----------------------getters and setters---------------------
	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}


	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}


	public int getInhabitants() {
		return inhabitants;
	}

	public void setInhabitants(int habitants) throws Exception {
		if(habitants < 0) {
			throw new Exception("La ville"+ this.countryName +"ne peut contenir moins de 0 habitants");
		}
		this.inhabitants = habitants;
	}
	
	public void addHabitants(int inhabitantsToAdd) throws Exception {
		this.setInhabitants(this.getInhabitants() + inhabitantsToAdd);
	}

	
	
	

	public static int getCitiesQuantity() {
		return citiesCount;
	}

	//ex1.4
	public void display() {
		System.out.println(this.toString());
	}
	
	
	//ex1.6
	@Override
	public String toString() {
	    return "Ville de " + this.cityName + " en/au " + this.countryName +
	           (this.inhabitants > 0 ? " ayant " + this.inhabitants + " habitants" : "");
	}

}
