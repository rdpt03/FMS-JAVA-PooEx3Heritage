package fr.fms.entities;

public class TestPerson {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Employe billgate = new Employe("Gate" , "Bill" , 65,"USA", new Capital("Washington","USA",7600000,"W-M"),"Fondation B&M",100000);
		Employe elonmusk = new Employe("Musk" , "Elon" , 49,"Palo alto", new City("Pretoria","South-Africa",800000),"Tesla",150000);
		
		System.out.println(billgate);
		System.out.println(elonmusk);
		
		Commercial robertdupont = new Commercial("Dupont", "robert", 50, "rue des rosiers à Toulouse", new City("Limoges" , "France" , 133000),"brico", 5.0);
		
		System.out.println(robertdupont);
	}

}
