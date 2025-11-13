package fr.fms.entities;

/**
 * Represents a person with basic personal information including name, age, address, and birthplace.
 * This class provides multiple constructors for creating a person with different levels of detail.
 * It also provides standard getters and setters to access and modify the person's attributes.
 */
public class Person {
	private String lastName;
	private String firstName;
	private int age;
	private String adress;
	private City bornCity;
	
	/**
	 * Creates a person with full information including birthplace city.
	 *
	 * @param lastName  the person's family name
	 * @param firstName the person's given name
	 * @param age       the person's age
	 * @param adress    the person's address
	 * @param bornCity  the city where the person was born
	 */
	public Person(String lastName, String firstName, int age, String adress, City bornCity) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
		this.adress = adress;
		this.bornCity = bornCity;
	}
	
	/**
	 * Creates a person with basic information excluding birthplace.
	 *
	 * @param nom     the person's family name
	 * @param prenom  the person's given name
	 * @param age     the person's age
	 * @param adresse the person's address
	 */
	public Person(String nom, String prenom, int age, String adresse) {
		super();
		this.lastName = nom;
		this.firstName = prenom;
		this.age = age;
		this.adress = adresse;
	}
	
	/**
	 * Creates a person with only name and age.
	 *
	 * @param nom    the person's family name
	 * @param prenom the person's given name
	 * @param age    the person's age
	 */
	public Person(String nom, String prenom, int age) {
		super();
		this.lastName = nom;
		this.firstName = prenom;
		this.age = age;
	}
	
	/**
	 * Creates a person with only name.
	 *
	 * @param nom    the person's family name
	 * @param prenom the person's given name
	 */
	public Person(String nom, String prenom) {
		super();
		this.lastName = nom;
		this.firstName = prenom;
	}

	/**
	 * Returns the family name of the person.
	 *
	 * @return the last name
	 */
	public String getNom() {
		return lastName;
	}

	/**
	 * Updates the family name of the person.
	 *
	 * @param nom the new last name
	 */
	public void setNom(String nom) {
		this.lastName = nom;
	}
	
	/**
	 * Returns the given name of the person.
	 *
	 * @return the first name
	 */
	public String getPrenom() {
		return firstName;
	}

	/**
	 * Updates the given name of the person.
	 *
	 * @param prenom the new first name
	 */
	public void setPrenom(String prenom) {
		this.firstName = prenom;
	}
	
	/**
	 * Returns the age of the person.
	 *
	 * @return the age in years
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Updates the age of the person.
	 *
	 * @param age the new age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * Returns the address of the person.
	 *
	 * @return the address as a string
	 */
	public String getAdresse() {
		return adress;
	}

	/**
	 * Updates the address of the person.
	 *
	 * @param adresse the new address
	 */
	public void setAdresse(String adresse) {
		this.adress = adresse;
	}

	/**
	 * Returns the city where the person was born.
	 *
	 * @return the birthplace city
	 */
	public City getBornCity() {
		return bornCity;
	}

	/**
	 * Updates the city where the person was born.
	 *
	 * @param bornCity the new birthplace city
	 */
	public void setBornCity(City bornCity) {
		this.bornCity = bornCity;
	}

	/**
	 * Returns a readable string describing the person, including name, age, address, and birthplace.
	 *
	 * @return a string with personal details
	 */
	@Override
	public String toString() {
		return lastName + ", "+ firstName + ", "+ age + " ans, habitant " + adress + ", ville de naissance : " + bornCity;
	}
}
