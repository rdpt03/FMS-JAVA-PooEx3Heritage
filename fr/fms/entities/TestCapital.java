package fr.fms.entities;

public class TestCapital {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Capital paris = new Capital("Paris","France",2000000,"Tour Eiffel");
		Capital london = new Capital("London","GB",9400000,"Bigben");
		
		System.out.println(paris);
		System.out.println(london);
	}

}
