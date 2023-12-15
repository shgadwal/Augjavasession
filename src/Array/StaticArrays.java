package Array;

import java.util.Arrays;

public class StaticArrays {
	
	public static void main (String[] args ) {
		// array is non primitive- takes some memmory as object and referenced 
		// collection of similar type of data
		// how to check the length of the array i.length 
		// to print the array directly - Array.tostring(i), syso(i)will give u garbage error. 
	
	//static arrays are the fixed arrays 
	// this how its is declared - array is non primitive and considered as objects whcih are referred by reference variable
	// and take space in the memmory 
	
	int i[]= new int[4];// l.h.s defines the type of the integer and R.H.S defines an arrya pbject with no of 
	// segements to hold int type data or defines what kind of data you want to hold the value
	
	System.out.println(i);
	System.out.println(Arrays.toString(i));
	i[0]=10;
	i[1]=20;
	i[2]=30;
	i[3]=40;
	
	System.out.println(i);
	System.out.println(i[0]);
	System.out.println(i.length);
	System.out.println(i.length-1);
	//System.out.println(i[3]);
	//System.out.println(Arrays.toString(i));
	
	for (int k=0; k<=3;k++) {
	System.out.println(i[k]);
		if(i[k]==20) {
			System.out.println("hi");
		}
	}
	
	int pop[]= new int[5]; //rhs u just create a segment and there of type int, do not mention any variable .
	pop[0]=100;
	pop[2]=200;
	pop[3]=600;
	pop[4]=80;
	
	System.out.println(Arrays.toString(pop));
	
	
	String s[]= new String[3]; 
	s[0]="she";
	s[1]="ish";
	s[2]="vih";
	System.out.println(Arrays.toString(s));
	for(int t =0; t< s.length; t++)	{
	System.out.println(s[t]);
	if (s[t].equals("vih")) {
		System.out.println("he is good");
	}
	}
		System.out.println("-----------");	
	for (String e: s) {
		System.out.println(e);
		if(e.equals("she")) {
			System.out.println("amazing ");
			break;
		}
	}
	
			
	
	int k[]= new int[5];
	k[0]=10;
	k[1]=20;
	k[2]=40;
	k[3]=50;
	k[4]=60;	
	
	System.out.println(Arrays.toString(k));
		for(int e:k) {
			System.out.println(e);
		}
			
		
		float f[]= new float[3];
				f[0]=0.02f;
		f[1]=0.03f;
		f[2]=0.04f;
		
		System.out.println(Arrays.toString(f));
		for(float e:f) {
			System.out.println(e);
			
		}
		char ch[]=new char[3];
		ch[0]='a';
		ch[1]='c';
		ch[2]='d';
		
		System.out.println(Arrays.toString(ch));
		for(char e: ch ) {
			System.out.println(e);
			
		}
		
		for(int e: ch ) {
			System.out.println(e);
			
		}
				
		
		/*boolean flag = true;

		if (flag) {
		System.out.print("test");
		//break;
		}
		else {
		System.out.print("java");
		}

		System.out.print("Bye");
		

		System.out.print("------------");*/
// there is another static arrays - will hold simillar kind of data in the array, 
	//object array stores the different types in the arrays. string literals 
	
	
	Object obj[] = new Object[5];
	obj[0]= "she";
	obj[1]= "joe";
	obj[2]= 10;
	obj[3]=10.05;
	obj[4]="s";

	System.out.println("============");

System.out.println(Arrays.toString(obj));

System.out.println("======");


for(int l=0; l<= obj.length-1; l++) {
	System.out.println(l+ "=="+ obj[l] );
}

System.out.println("======");

int count=0;
for(Object e:obj) {
	System.out.println(count+ "===" + e ); 
	count++;
}


}

}

			
	
			




