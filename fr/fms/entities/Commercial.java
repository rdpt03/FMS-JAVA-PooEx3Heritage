package fr.fms.entities;

public class Commercial extends Person{

	private String entreprise;
	private double comission;
	private static double MIN_WAGE = 0.0;
	
	
	public Commercial(String lastName, String firstName, int age, String adress, City bornCity, String entreprise, double comission) throws Exception {
		super(lastName, firstName, age, adress, bornCity);
		if(comission < MIN_WAGE) {
			throw new Exception("Veuillez mettre une comission plus grande que "+MIN_WAGE);
		}
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


	public void setComission(double comission) throws Exception {
		if(comission < MIN_WAGE) {
			throw new Exception("Veuillez mettre une comission plus grande que "+MIN_WAGE);
		}
		this.comission = comission;
	}


	@Override
	public String toString() {
		return super.toString() + ", Entreprise : " + entreprise + ", % du CA : " + comission;
	}
	
	

}
