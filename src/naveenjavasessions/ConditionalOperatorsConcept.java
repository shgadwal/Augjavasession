package naveenjavasessions;

public class ConditionalOperatorsConcept {

	public static void main(String[] args) {
//	int a=100;
//	int b=100;
//	int c=100;
//	int d=5000;
//	
//	if (a>b && a>c && a>d) {
//		System.out.println("a is big " + a);
//		
//	}
//	else if (b>c && b>d) {
//		System.out.println(" b i big " +b );
//	
//	}
//	
//	else if ( c>d) {
//		System.out.println(" print c is big " +c );
//	}
//	else {System.out.println("print d is big " + d);}
//	
	
	int marks = 35;
	
	if (marks > 100 || marks <= 0)
	{
		System.out.println("incorrect marks " +  marks);
	} 
	
	else {
		
	if (marks == 100) { 
		
		System.out.println("outstanding" + "grade A" ) ;
	}
		
	else {
		if (marks >= 90 && marks<=99) {
	
		System.out.println("grade A "+ marks) ;
		}
	
		if (marks >=75 && marks <= 89){
		
		  
		  System.out.println("grade B "+ marks );
		  
			}
	 if  (marks>=60 && marks<=74)	{
			System.out.println("grade C "+ marks);
	
		}
	 
		 
		 if (marks>=40 && marks<=59) {
	 
			
				System.out.println("grade D "+ marks);
		 }
			 if (marks <40) { System.out.println("fail" + marks);
			
		}
	 
			
	}
		
	}
	
	
	}
}
//However, note that using multiple nested if statements in 
//this manner (without else) can be inefficient because even if one condition is met, 
//the subsequent conditions will still be checked. In this particular example, it's not a major 
//performance concern because the number of checks is small, but for best practices and clarity, 
//using else if or a switch-case structure might be more appropriate for grade categorizations.



		
		
	
	



