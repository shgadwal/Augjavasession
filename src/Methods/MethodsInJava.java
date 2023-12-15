package Methods;
import java.util.ArrayList;
import java.util.Arrays;

public class MethodsInJava {
	String name ;
	static int wheels =4;

	
	//can not create a method inside the method
	// can call a method inside the method
	//methods are always independent and parallel to each other
	// methods are class data members
	//method : the behaviour of object  / class 
	
	

	// first type ->of methods - no input and no return 
	
	// 1. no input no return 
	public void test() {
		System.out.println("test method");
	
	}
	//2. no input but some return
	public int getinfo() {
		int a=10;
		System.out.println("getinfo");
		int b=20;
		int c=a+b;
		return c ;
		//System.out.println("getinfo"); this unreable code
	
	
	}
	
	//3. string name 
	
	public String  name() {
		System.out.println("print name ");
		String her = "sheetal";
		return her;
		
	}
	//4 , can we return multiple value from return --- ANSWER -NO using array list <>
	
	public ArrayList<String> listofnames() {
		String s = "vih";
		String k = "ish";
		//return s,k ; cannot return multiple values 
	
		ArrayList <String> famlist = new ArrayList <String>(); // this creates empty array list 
		famlist.add(s);
		famlist.add(k);
		return famlist;
		
	}
	
	//5. static array 
	
	public String[] farray() {
		System.out.println("print array");
		String a[]= {"vava", "sheetal"};
		return a;
	
		
				
				
	}
	
	//some input and some return 
	
	public int add(int a, int b) {
		int tot = a+b ;
		return tot;
		
	}
	
	
	
	
	public static void main(String[] args) {
		System.out.println(wheels);
		System.out.println(MethodsInJava.wheels);//
		MethodsInJava obj= new MethodsInJava();
		obj.name="tom";
		obj.test();
		int d= obj.getinfo();
		System.out.println(d);
		System.out.println(d-30);
		String j =obj.name();
		System.out.println(j);
		System.out.println(j + " " + "gadwal");
		
		ArrayList<String> flist=obj.listofnames();
		System.out.println(flist);
		System.out.println(flist.size());
		System.out.println(flist.add("lax"));
		System.out.println(flist);
		flist.remove(1);
		System.out.println(flist);
		System.out.println(flist.add("ish"));
		System.out.println(flist.add("she"));
		System.out.println(flist);
		
		String familylist[]=obj.farray();
		System.out.println(familylist.length);
		System.out.println(Arrays.toString(familylist));// this will print the values 
		System.out.println(familylist);
		
		int sum = obj.add(10,20);
		System.out.println(sum);
		
		
	}

}
