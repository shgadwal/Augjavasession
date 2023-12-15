package OOP_Interface;

public class SiliconEdu implements USEducation,UKEducation,IndiaEducation {

	@Override
	public void math() {
	System.out.println("SE---------math");
		
	}

	@Override
	public void science() {
		System.out.println("SE ------ Science");
		
	}

	@Override
	public void datascience() {
		System.out.println("SE------datascience");
		
		
	}

	@Override
	public void artifical_inteligence() {

		System.out.println("SE--------artificial_inteligence");
	}

	@Override
	public void finance() {
		System.out.println("SE--------finance");
		
	}
//UKEDU
	
	@Override
	public void economics() {
System.out.println("SE--------economics");
		
	}

	@Override
	public void biotech() {
		System.out.println("SE--------biotech");
		
	}

	@Override
	public void physics() {
		System.out.println("SE--------physics");
		
	}
	
	
	
	@Override
	public void computerscience() {
		System.out.println("SE--------computerscience");
		
	}

	@Override
	public void database() {
		

		System.out.println("SE--------database");
	}

	@Override
	public void cloud_technology() {
	
		System.out.println("SE--------cloud_technology");
	}
	

}
