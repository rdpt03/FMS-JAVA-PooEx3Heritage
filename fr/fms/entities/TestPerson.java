package fr.fms.entities;

import java.util.ArrayList;

/**
 * Test class for the Person hierarchy, including Employe and Commercial.
 * 
 * This class demonstrates creating a list of different types of workers, 
 * printing their details, and calculating/displaying their monthly remuneration.
 */
public class TestPerson {

	public static void main(String[] args) throws Exception {
		// Create a list to store various Person instances
		ArrayList<Person> listOfWorkers = new ArrayList<>();
		
		// Add employees and commercial workers to the list
		listOfWorkers.add(new Employe("Gate" , "Bill" , 65, "USA", new Capital("Washington","USA",7600000,"W-M"), "Fondation B&M", 100000));
		listOfWorkers.add(new Employe("Musk" , "Elon" , 49, "Palo alto", new City("Pretoria","South-Africa",800000), "Tesla", 150000));
		listOfWorkers.add(new Commercial("Dupont", "Robert", 50, "rue des rosiers à Toulouse", new City("Limoges" , "France" , 133000), "Brico", 5.0));
		
		// Print the details of each worker
		for (Person worker : listOfWorkers) {
			System.out.println(worker.toString());
		}
		
		// Display the monthly remuneration of each worker
		for (Person worker : listOfWorkers) {
			if(worker instanceof Employe) {
				Employe employe = (Employe) worker;
				employe.remuneration();
			} else if(worker instanceof Commercial) {
				Commercial commercial = (Commercial) worker;
				commercial.remuneration();
			}
		}
	}
}
