package Array;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ArrayListIterations {

	public static void main(String[] args) {
	ArrayList<Integer> numlist = new ArrayList<Integer>();
	numlist.add(100);
	numlist.add(200);
	numlist.add(300);
	numlist.add(500);
	numlist.add(600);
	System.out.println(numlist);
	System.out.println(numlist.size());
	
	for(int i=0; i<numlist.size(); i++){
		
		System.out.println(numlist.get(i));
	}
	
	System.out.println("=================");
	
	
	for(Integer e: numlist) {
		System.out.println(e);
	
	}
	
	ArrayList<String> emplist = new ArrayList<String>();
	
	emplist.add("sheet");
	emplist.add("heloo");
	emplist.add(null);
	emplist.add("jj");
	emplist.set(0, "smith");// will replace the value in the index
	emplist.add("sheet");
	emplist.add("heloo");
	emplist.add("sheet");
	emplist.add("heloo");
	System.out.println(emplist);
	//emplist.set(5,"ss");
	
	for (String e: emplist) {
		System.out.println(e);
	}
	
	
	ArrayList<String> studentlist = new ArrayList<String>();
	
	studentlist.add(null);
	studentlist.add("kk");
	studentlist.add("kick");
	studentlist.add("ram");
	studentlist.add("lax");
	studentlist.add("sita");
	studentlist.add(0,"kuber");//-// doing shifting will just add a value without any replace and no data loss
	System.out.println(studentlist);
	System.out.println(studentlist.size());
	studentlist.add(0,"rama");
	System.out.println(studentlist);
	System.out.println(studentlist.size());
	studentlist.set(0,"rara");

	System.out.println(studentlist.remove(0));
	System.out.println(studentlist);
	System.out.println(studentlist.size());
	System.out.println(studentlist.remove(2));
	System.out.println(studentlist);
	System.out.println(studentlist.size());
	
	/// third type of arraylist // 
	ArrayList<String> famlist = new ArrayList<String>(Arrays.asList("om","sri","jai","jai"));
	System.out.println(famlist);
	System.out.println(famlist.size());
	famlist.add(null);
	famlist.add("girl");
	System.out.println(famlist);
	System.out.println(famlist.size());
	
	// fourth type arraylist 
	ArrayList<String> fourlist = new ArrayList<String>() {{
	add("im");
	add("queen");
	add("of");
	add("my world");

	}};
	
	System.out.println(fourlist);
	
	System.out.println(fourlist.size());
	
	
	
	
	
	}

}
