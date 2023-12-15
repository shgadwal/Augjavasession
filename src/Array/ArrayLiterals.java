package Array;

import java.util.Arrays;

public class ArrayLiterals {

	public static void main(String[] args) {
	//with new keyword 
	
	//int k[]=new int[5];
	//string literals
	
	int num[] = {1,2,3,4,5};
	System.out.println(num[2]);
	System.out.println(num[3]);
	System.out.println(num.length);
	System.out.println("==============");
	
	for (int e:num) {
		System.out.println(e);
	}

	
	for (int k=0; k<=num.length-1; k++ ) {
		System.out.println(num[k]);
	}
		
		System.out.println("===========");
		
		String s[] = {"sh","jj","kk","ll"};
		
		System.out.println(Arrays.toString(s));
		
		for (String e:s) {
			System.out.println(e);
			
	
		}
		
		Object empinfo[] = {"kk","ll", 99,99.07};
		System.out.println(Arrays.toString(empinfo));
		
		for(int j=0; j<=empinfo.length-1;j++) {
			System.out.println(empinfo[j]);
			
			
		}
		
		for ( Object e:empinfo) {
			System.out.println(e);
			
		}
		int numb[] = {1,2,3,4,5,6,7,8,9,10};
		for(int r=numb.length-1; r>=0; r--) {
			System.out.println(numb[r]);
		}
		
		
		
		
		
		
	}
	
	}


