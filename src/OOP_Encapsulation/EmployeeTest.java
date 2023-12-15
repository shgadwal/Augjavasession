package OOP_Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
	
		Employee e1 = new Employee();
		 e1.setName("she");
		 e1.setCity("hyd");
		 e1.setId(8);
		 e1.setIsPerm(true);
		 //e1.getName();
		 System.out.println(e1.getId());
		
		 System.out.println(e1.getCity());
		 System.out.println(e1.getIsPerm());
		 System.out.println(e1.getName());
		 System.out.println(e1.getId());
		 
		 /// user wants to update the name 
		 
		 System.out.println("--------");
		 
		 e1.setName("sheetal");
		 e1.setId(9);
		 
		 System.out.println(e1.getName());
		 System.out.println(e1.getId());
		 
	}

		
	}


