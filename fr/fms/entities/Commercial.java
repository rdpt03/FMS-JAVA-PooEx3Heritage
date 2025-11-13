package fr.fms.entities;

/**
 * A Commercial is a type of Person who works for a company and receives a commission
 * based on company revenue. This class stores the company name and the commission
 * percentage, validates commission values, and can print a simple monthly remuneration.
 *
 * The wording in the messages and exceptions is kept simple and conversational so it is
 * easy to read and understand.
 */
public class Commercial extends Person{

	private String entreprise;
	private double comission;
	private static double MIN_WAGE = 0.0;
	private static int companyRevenue = 50000;
	
	
	/**
	 * Create a new Commercial.
	 *
	 * @param lastName   the person's family name
	 * @param firstName  the person's given name
	 * @param age        the person's age
	 * @param adress     the person's address
	 * @param bornCity   the city where the person was born
	 * @param entreprise the company the commercial works for
	 * @param comission  the commission percentage (must be at least MIN_WAGE)
	 * @throws Exception if the commission is less than the allowed minimum
	 */
	public Commercial(String lastName, String firstName, int age, String adress, City bornCity, String entreprise, double comission) throws Exception {
		super(lastName, firstName, age, adress, bornCity);
		if(comission < MIN_WAGE) {
			throw new Exception("Veuillez mettre une comission plus grande que "+MIN_WAGE);
		}
		// TODO Auto-generated constructor stub
		this.entreprise = entreprise;
		this.comission = comission;
	}


	/**
	 * Return the company name where this commercial works.
	 *
	 * @return the company name
	 */
	public String getEntreprise() {
		return entreprise;
	}


	/**
	 * Set or update the company name.
	 *
	 * @param entreprise the new company name
	 */
	public void setEntreprise(String entreprise) {
		this.entreprise = entreprise;
	}


	/**
	 * Return the commission percentage for this commercial.
	 *
	 * @return the commission percentage
	 */
	public double getComission() {
		return comission;
	}


	/**
	 * Update the commission percentage.
	 *
	 * @param comission the new commission percentage (must be at least MIN_WAGE)
	 * @throws Exception if the commission is less than the allowed minimum
	 */
	public void setComission(double comission) throws Exception {
		if(comission < MIN_WAGE) {
			throw new Exception("Veuillez mettre une comission plus grande que "+MIN_WAGE);
		}
		this.comission = comission;
	}
	
	
	/**
	 * Print a simple monthly salary message to standard output.
	 * The salary is calculated as companyRevenue multiplied by the commission percentage.
	 * This is a convenience method for quick display and uses a plain sentence format.
	 */
	public void remuneration() {
		System.out.println("Salaire mensuel de "+super.getPrenom()+" "+super.getNom()+" : "+companyRevenue * (this.comission/100));
	}


	/**
	 * Return a friendly string that describes the commercial, including
	 * the person information, the company and the commission percentage.
	 *
	 * @return a readable description of this commercial
	 */
	@Override
	public String toString() {
		return super.toString() + ", Entreprise : " + entreprise + ", % du CA : " + comission;
	}
	
}
