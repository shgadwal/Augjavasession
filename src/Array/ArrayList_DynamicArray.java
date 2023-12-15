package Array;

import java.util.ArrayList;

public class ArrayList_DynamicArray {

	public static void main(String[] args) {
	ArrayList ar = new ArrayList();
	System.out.println(ar.size());
	System.out.println(ar);
	ar.add(100);
	ar.add(200);
	System.out.println(ar);
	System.out.println(ar.size());
	System.out.println(ar.indexOf(200));
	
	ar.add(300);
	ar.add(500);
	System.out.println(ar);
	System.out.println(ar.size());
	System.out.println(ar.get(3));
	System.out.println(ar.get(2));
	ar.add(200.10);
	ar.add("hello");
	ar.add(true);
	System.out.println(ar.size());
	System.out.println(ar.get(6));
	//System.out.println(ar.get(7));// index out of bound expection in the case of the 
	//dynamic array list, wheras in static array it throws array out of boundexpection: note
	// in dyamic array list can only grow dynamicaly when ur trying add the data in the segments
	// else it will throw iob
	System.out.println(ar);
	ar.add(1000);
	System.out.println(ar.size());
	System.out.println(ar.get(7));
	ar.add("selenium");
	ar.add(null);
	System.out.println(ar);
	System.out.println(ar.size());
	ar.add(100);
	System.out.println(ar);
	System.out.println(ar.size());
	System.out.println(ar.get(10));
	
	ArrayList ar1 = new ArrayList();
	System.out.println(ar1);
	ar1.add(10);
	System.out.println(ar1);
	System.out.println(ar1.size());
	
	ArrayList ar2 = new ArrayList(20); //vc=20, pc=0- index[0--19]-->added ,when adding pc21 or
	//pc index 20  == no of vc gets created are pc /2 or size/10= 10 ;  
	System.out.println(ar2);
	
	ArrayList ar3 = new ArrayList(7); //vc=7, pc=0
	System.out.println(ar2);
	ar3.add(200);// vc=6 , pc =1 or pc is same as the size 
	
	// generics :are used as objects as wrapper classes whereas primitive int are used on non objects 
	
	ArrayList<Integer> li = new ArrayList<Integer>();// vc=10 , pc=0;
	li.add(500);
	//li.add(502.0)// float cannot be added
	li.add(100);
	System.out.println(li);
	System.out.println(li.size());// vc=8 pc =2
	
	ArrayList<Double> lid = new ArrayList<Double>();
	lid.add(100.0);
	lid.add(300.00);
	//lid.add(6)cannot add just integer, has to double datatype
	
	ArrayList<Double> lids = new ArrayList<>();// is acceptable.
	lids.add(null);
	lids.add(90.0);
	
	ArrayList<String> empname= new ArrayList<String>();
	empname.add("sh");
	empname.add(null);
	empname.add("kk");
	empname.add("oo");
	System.out.println(empname);
	System.out.println(empname.size());
	
	
	ArrayList<Object> obh=new ArrayList<Object>();
	obh.add("she");
	obh.add(12);
	obh.add(99.0);
	obh.add(null);
	obh.add(true);
	obh.add('A');// pc= 6 , vc =4
	
	System.out.println(obh);
	System.out.println(obh.size());
	
	
	
	
	}

}
