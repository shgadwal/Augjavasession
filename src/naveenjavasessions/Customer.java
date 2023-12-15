package naveenjavasessions;

public class Customer {
	
	String firstname ;
	String lastname;
	String telephone;
	boolean subscribe;
	
	

	public static void main(String[] args) {
		
		Customer c1 = new Customer();
		c1.firstname= "she";
		c1.lastname= "gad";
		c1.telephone= "10827236789";
		c1.subscribe= true;
		
		
		System.out.println(" firstname "  +  c1.firstname + " lastname " + c1.lastname  );
				
				
		Customer c2 = new Customer();
		c2.firstname= "ish";
		c2.lastname= "vsh";
	
		System.out.println(c2.firstname);
        System.out.println(c2.lastname);
	}

}
