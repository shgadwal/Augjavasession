package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_Assignments {

	public static void main(String[] args) {
		
	ArrayList<String> colorlist = new ArrayList<String>();
	
	colorlist.add("blue");
	colorlist.add("red");
	colorlist.add("black");
	colorlist.add("white");
	colorlist.add("purple");
	System.out.println(colorlist);
	System.out.println(colorlist.size());
	
	//To rexact the portion of array list 
	
	System.out.println(colorlist.subList(1, 4));// returns list b/w from index (includive to toindex exclusive 
	
	System.out.println(colorlist.set(2,"brown"));
	// to remove the third element from the arrayalist
	System.out.println(colorlist.remove(3));
	
	System.out.println(colorlist);
	//using for loop 
	
	for(int i=0; i<colorlist.size(); i++) {
		System.out.println(colorlist.get(i));
	}
	
	System.out.println("=============");
	
	for(String e: colorlist) {
		System.out.println(e);
		
	}
	
	System.out.println("=============");
	// to retrive the element at the specific index:
	
	for(int i=0; i<colorlist.size(); i++) {
		System.out.println(colorlist.get(0));
		break;
	}
	
	
	// or simple way to do;
	
	String color= colorlist.get(2);
	System.out.println(color);
	
	// another way 
	
	System.out.println("=======");
	System.out.println(colorlist.get(2));
	
	
	System.out.println("=======");
	String searchcolor = "purple";
	for(String e1:colorlist) {
		if(e1.equals(searchcolor)) 
		{
		System.out.println("found" +  searchcolor );
		break;
		}

		
		
	}
	
	ArrayList<String> studentNames = new ArrayList<String>();

	studentNames.add("Varun");
	studentNames.add("Reena");
	studentNames.add("Naveen");
	studentNames.add("Robin");
	studentNames.add("Peter");
	System.out.println(studentNames);
	System.out.println("========");
	Collections.reverse(studentNames);
	System.out.println(studentNames);
	
	// USING FOR LOOP
	for(int rev = studentNames.size()-1;rev>=0; rev--) {
	System.out.println(studentNames.get(rev));
		}
	
	System.out.println("=======");
	//USING FOR EACH 
	//int counter = studentNames.size()-1; //cannot use for each loop. u can tracdiotionally use for loop
	
	
		
	
ArrayList<String> clearlist = new ArrayList<String>();
	
	clearlist.add("blue");
	clearlist.add("red");
	clearlist.add("black");
	clearlist.add("white");
	clearlist.add("purple");
	System.out.println(clearlist);
	System.out.println(clearlist.size());
	clearlist.clear();
	System.out.println(clearlist);
	
//another method 
	List<String> newlist =Collections.EMPTY_LIST;
	System.out.println(newlist.size());
	
	
	List<Integer> markslist =Collections.EMPTY_LIST;
	System.out.println(markslist);
	
	
ArrayList<String> trimlist = new ArrayList<String>(3);
	
trimlist.add("blue");
trimlist.add("red");
trimlist.add("black");
	
trimlist.trimToSize();
	System.out.println(trimlist); 
	 
	System.out.println(trimlist.indexOf("black"));
	
	for (int tr = 0 ; tr < trimlist.size(); tr++) {
		System.out.println("elementof index  " +  " " + tr + " "+ trimlist.get(tr));
		
	}
	
	
	}
	
	
	}
	
	


