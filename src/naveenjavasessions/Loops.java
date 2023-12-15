package naveenjavasessions;

public class Loops {

	public static void main(String[] args) {
		int i =0;
		
		while (i>=10) {
			System.out.println("even " + i);
			
			i=i+2;
				
		}
			
		
System.out.println("........................");
			
			
			int j=1;
			while (j<=10 ) {
				
		   System.out.println(" odd "+ j);
				
				j=j+2;		
			}
			
	System.out.println("...........");
			
			
			int k=1;
			
			while (k<=100) {
				
			
			System.out.println(" numbers " + k );
				k=k+1;
			}
					
		int l=1;
		while (l<=50) {
			
		System.out.println(l);
		System.out.println("hi");
		
		if (l % 5 == 0) {
			
			System.out.println(" hi ");
			break;
			
		}
		l++;
		}
		
System.out.println("---------------");
		
	

for(int s=1 ; s<=10 ; s=s+2) {
	System.out.println(s);
	
			
			
		}
		
System.out.println("---------------");


int m ;

for(m=0;m <=10 ; m=m+2 ) {
	System.out.println(m);
	
}
			
System.out.println("---------------");
// a-z : 97-122
// a=97
//b=98

for( char ch = 'a'; ch <='z'; ch++) {
	
	System.out.println(ch + "=" + ( byte) ch);
}

System.out.println("---------------");

for( char kh = 'A'; kh <='Z'; kh++) {
	
	System.out.println(kh + "=" + ( byte) kh);
}


System.out.println("---------------");
	
int a =10;
int b=20;

System.out.println(a);
//a=b;

//System.out.println(a);
	
System.out.println(b);
b=a;

System.out.println(b);

int c= a+b;
System.out.println(c);


System.out.println("---------------");

for (i =0; i<=50 ; i ++) {
	if (i % 2==0) {
		
		System.out.println(" even number "+ i);
	}
		else {
			System.out.println(" odd number " + i );
		}
	}
	
System.out.println("---------------");

int x = 10;

while (x>=1) {
	System.out.println( x); //10,9,8,7,6,5,4,3,2,1
	x--;


	}
System.out.println("---------------");

for (int y=10 ; y>=1; y--) {
	System.out.println(y);//10,9,8,7,6,5,4,3,2,1
}

System.out.println("---------------");

int h =10;

do {
	System.out.println(h);//10,9,8,7,6,5,4,3,2,1
	h--;//9,8,7,6,5,4,3,2,1,0
}
while (h>=1);//9,8,7,6,5,4,3,2,1
	
System.out.println("---------------");

int t =10;

do {
	
	t--;//9,8,7,6,5,4,3,2,1,0
	System.out.println(t);//9,8,7,6,5,4,3,2,1,0
	
}
while (t>=1);//9,8,7,6,5,4,3,2,1
	
	}

	/*
	 * If you have a `for` loop with the initialization of `k = 0`, a condition of `k <= 3`, and an increment of `k++`, the loop would execute like this:

```java
for (int k = 0; k <= 3; k++) {
    System.out.println("p");
}
```

Here's what happens during the execution:

1. **Initialization**: `int k = 0;` sets the starting value of `k` to 0.

2. **Condition Check**: The condition `k <= 3;` is checked. Since `k` is 0, and 0 is less than or equal to 3, the condition is `true`.

3. **Enter Loop Body**: Because the condition is `true`, the program enters the loop body.

4. **Execute Loop Body**: It executes the code inside the loop body, which in this case is `System.out.println("p");`. This prints the string "p" to the console.

5. **Increment**: After executing the loop body, `k` is incremented by 1 because of `k++`.

6. **Condition Check Again**: Now `k` is 1, and the loop condition `k <= 3;` is checked again. It's still `true`, so the loop body executes again, printing "p" to the console.

7. **Loop Continues**: This process (steps 4 to 6) repeats until `k` is incremented to 4.

8. **Condition Fails**: When `k` is 4, the condition `k <= 3;` is no longer `true`. Now the condition fails.

9. **Exit Loop**: Because the condition is `false`, the loop stops executing, and the program moves to the next line of code following the loop.

In total, the string "p" will be printed to the console 4 times (for `k` values of 0, 1, 2, and 3).
	 * 
	 * 
	 * 
	 */
	
	
}
