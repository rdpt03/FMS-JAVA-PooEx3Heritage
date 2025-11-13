package fr.fms.entities;

public class Employe extends Person{
	private String entreprise;
	private int salary;
	
	
	public Employe(String lastName, String firstName, int age, String adress, City bornCity, String entreprise, int salary) {
		super(lastName, firstName, age, adress, bornCity);
		this.entreprise = entreprise;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return super.toString()+", Entreprise: " + entreprise + ", salaire : " + salary;
	}
	
	
	
	
}
