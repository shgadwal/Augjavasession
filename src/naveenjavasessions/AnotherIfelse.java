package naveenjavasessions;

public class AnotherIfelse {

	public static void main(String[] args) {
		int marks = 39;
		
		if (marks>100 || marks<0) {
			System.out.println("incorrect marks " + marks );
		}
		
		else if(marks==100) {
			System.out.println("outsanding "+ "grade A" );
		}
		
		else if( marks >= 85 && marks <=99) {
			System.out.println( "grade A" + marks );
		}
		
		else if (marks >=65 && marks <= 84) {
			System.out.println(" grade B" + marks );
		}
		
		else if (marks >=40 && marks <= 64) {
			
			System.out.println("grade C "+ marks);
			
			}
		
		else  {
			
			System.out.println(" FAIL " + marks );
		}
		
		//note even this is correct else if (marks < 40) { or just specify the else 
		
	}

}
