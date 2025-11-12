package fr.fms.entities;

public class Capital extends City {
	
	private String monument;

	public Capital(String nVille, String nPays, int habitants, String monument) throws Exception {
		super(nVille, nPays, habitants);
		this.monument = monument;
	}

	/**
	 * @return the monument
	 */
	public String getMonument() {
		return monument;
	}

	/**
	 * @param monument the monument to set
	 */
	public void setMonument(String monument) {
		this.monument = monument;
	}

	@Override
	public String toString() {
		return super.getCityName()+", "+super.getCountryName()+", "+super.getInhabitants()+" d'habitants, monument : "+monument;
	}
	
	

}
