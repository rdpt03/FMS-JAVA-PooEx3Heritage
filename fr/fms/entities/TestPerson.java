package fr.fms.entities;

import java.util.ArrayList;

public class TestPerson {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ArrayList<Person> listOfWorkers = new ArrayList<>();
		
		listOfWorkers.add(new Employe("Gate" , "Bill" , 65,"USA", new Capital("Washington","USA",7600000,"W-M"),"Fondation B&M",100000));
		listOfWorkers.add(new Employe("Musk" , "Elon" , 49,"Palo alto", new City("Pretoria","South-Africa",800000),"Tesla",150000));
		listOfWorkers.add(new Commercial("Dupont", "robert", 50, "rue des rosiers à Toulouse", new City("Limoges" , "France" , 133000),"brico", 5.0));
		
		
		for (Person worker : listOfWorkers) {
			System.out.println(worker.toString());
		}
		
		
		for (Person worker : listOfWorkers) {
			if(worker instanceof Employe) {
				Employe employe = (Employe) worker;
				employe.remuneration();
			}
			else if(worker instanceof Commercial) {
				Commercial commercial = (Commercial) worker;
				commercial.remuneration();
			}
			
		}
		
	}

}
