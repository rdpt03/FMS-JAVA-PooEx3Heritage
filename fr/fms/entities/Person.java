package fr.fms.entities;

public class Person {
	private String lastName;
	private String firstName;
	private int age;
	private String adress;
	private City bornCity;
	
	
	
	public Person(String lastName, String firstName, int age, String adress, City bornCity) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
		this.adress = adress;
		this.bornCity = bornCity;
	}
	
	
	public Person(String nom, String prenom, int age, String adresse) {
		super();
		this.lastName = nom;
		this.firstName = prenom;
		this.age = age;
		this.adress = adresse;
	}
	
	
	public Person(String nom, String prenom, int age) {
		super();
		this.lastName = nom;
		this.firstName = prenom;
		this.age = age;
	}
	
	
	public Person(String nom, String prenom) {
		super();
		this.lastName = nom;
		this.firstName = prenom;
	}


	/**
	 * @return the nom
	 */
	public String getNom() {
		return lastName;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.lastName = nom;
	}
	
	
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return firstName;
	}
	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.firstName = prenom;
	}
	
	
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	
	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adress;
	}
	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adress = adresse;
	}


	/**
	 * @return the bornCity
	 */
	public City getBornCity() {
		return bornCity;
	}


	/**
	 * @param bornCity the bornCity to set
	 */
	public void setBornCity(City bornCity) {
		this.bornCity = bornCity;
	}


	@Override
	public String toString() {
		return lastName + ", "+ firstName + ", "+ age + " ans, habitant " + adress + ", ville de naissance : " + bornCity;
	}
	
	
	
	
}
