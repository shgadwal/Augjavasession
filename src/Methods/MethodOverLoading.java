package Methods;

public class MethodOverLoading {
	//method overloading in the same class, : poly morphsim - multiple forms , compile type polymorphism 
	//with same method name, 
	// with different number of parameters 
	// with different types of parameters
	//return type doesn,t matter 
	//sequence of the parameter should be different 
	
	

	public void test() {
		System.out.println(" print this method");
	}
	
	public void test(int a) {
		System.out.println(" print this method");
	}
	public void test(int x, int y ) {
		System.out.println(x+y );
       
	}
	public void test (int a, String b) {
		System.out.println(" print this method" + a+b);// note with parenthesis and concatenation the output chanegs 
	}
	
	public void test ( String b, int a ) {
		System.out.println( a+b);
	}
	
	public void test ( int a, float c ) {
		System.out.println(" print this method");
	}
	
	public void test ( float c , int a ) {
		System.out.println(" print this method");
	}
		
	
	public static void main(String[] args) {

		MethodOverLoading ml = new MethodOverLoading();
		ml.test();
		ml.test(10,20);
		
		
	}

}
