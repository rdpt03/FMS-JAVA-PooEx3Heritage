package fr.fms.entities;

/**
 * The Employe class represents a person who works for a company and receives a fixed salary.
 * It extends the Person class and adds details about the company and the employee's salary.
 * 
 * The class ensures that salary values are valid (not below the defined minimum wage)
 * and includes a simple method to calculate and display the employee's monthly pay after tax.
 */
public class Employe extends Person {
	private String entreprise;
	private int salary;
	private static int MIN_WAGE = 0;
	private static double tax = 0.2;
	
	/**
	 * Creates a new employee with the given information.
	 *
	 * @param lastName   the employee's last name
	 * @param firstName  the employee's first name
	 * @param age        the employee's age
	 * @param adress     the employee's address
	 * @param bornCity   the city where the employee was born
	 * @param entreprise the company where the employee works
	 * @param salary     the employee's monthly salary
	 * @throws Exception if the salary is below the minimum allowed value
	 */
	public Employe(String lastName, String firstName, int age, String adress, City bornCity, String entreprise, int salary) throws Exception {
		super(lastName, firstName, age, adress, bornCity);
		if(salary < MIN_WAGE) {
			throw new Exception("Veuillez mettre un salaire plus grand que " + MIN_WAGE);
		}
		this.entreprise = entreprise;
		this.salary = salary;
	}
	
	/**
	 * Returns the name of the company where the employee works.
	 *
	 * @return the company name
	 */
	public String getEntreprise() {
		return entreprise;
	}

	/**
	 * Updates the company name for this employee.
	 *
	 * @param entreprise the new company name
	 */
	public void setEntreprise(String entreprise) {
		this.entreprise = entreprise;
	}

	/**
	 * Returns the employee's salary.
	 *
	 * @return the current salary
	 */
	public int getSalary() {
		return salary;
	}

	/**
	 * Sets a new salary for the employee.
	 *
	 * @param salary the new salary amount
	 * @throws Exception if the salary is below the minimum allowed value
	 */
	public void setSalary(int salary) throws Exception {
		if(salary < MIN_WAGE) {
			throw new Exception("Veuillez mettre un salaire plus grand que " + MIN_WAGE);
		}
		this.salary = salary;
	}

	/**
	 * Displays the employee’s monthly net salary after tax deduction.
	 * The result is printed in a friendly and readable format.
	 */
	public void remuneration() {
		System.out.println("Salaire mensuel de " + super.getPrenom() + " " + super.getNom() + " : " + (this.salary * (1 - tax)));
	}

	/**
	 * Returns a short description of the employee including name, company, and salary.
	 *
	 * @return a readable text description of the employee
	 */
	@Override
	public String toString() {
		return super.toString() + ", Entreprise: " + entreprise + ", salaire : " + salary;
	}
}
