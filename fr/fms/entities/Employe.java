package fr.fms.entities;

public class Employe extends Person{
	private String entreprise;
	private int salary;
	private static int MIN_WAGE = 0;
	
	
	public Employe(String lastName, String firstName, int age, String adress, City bornCity, String entreprise, int salary) throws Exception {
		super(lastName, firstName, age, adress, bornCity);
		if(salary < MIN_WAGE) {
			throw new Exception("Veuillez mettre une comission plus grande que "+MIN_WAGE);
		}
		this.entreprise = entreprise;
		this.salary = salary;
	}
	
	

	public String getEntreprise() {
		return entreprise;
	}



	public void setEntreprise(String entreprise) {
		this.entreprise = entreprise;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		if(salary < MIN_WAGE) {
			throw new Exception("Veuillez mettre une comission plus grande que "+MIN_WAGE);
		}
		this.salary = salary;
	}



	@Override
	public String toString() {
		return super.toString()+", Entreprise: " + entreprise + ", salaire : " + salary;
	}
	
	
	
	
}
