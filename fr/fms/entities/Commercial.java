package fr.fms.entities;

public class Commercial extends Person{

	private String entreprise;
	private double comission;
	
	
	public Commercial(String lastName, String firstName, int age, String adress, City bornCity, String entreprise, double comission) {
		super(lastName, firstName, age, adress, bornCity);
		// TODO Auto-generated constructor stub
		this.entreprise = entreprise;
		this.comission = comission;
	}


	public String getEntreprise() {
		return entreprise;
	}


	public void setEntreprise(String entreprise) {
		this.entreprise = entreprise;
	}


	
	

	public double getComission() {
		return comission;
	}


	public void setComission(double comission) {
		this.comission = comission;
	}


	@Override
	public String toString() {
		return super.toString() + ", Entreprise : " + entreprise + ", % du CA : " + comission;
	}
	
	

}
