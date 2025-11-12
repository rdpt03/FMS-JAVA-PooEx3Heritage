package fr.fms.entities;

public class Capital extends City {
	
	private String monument;

	public Capital(String nVille, String nPays, int habitants, String monument) throws Exception {
		super(nVille, nPays, habitants);
		this.monument = monument;
	}

}
