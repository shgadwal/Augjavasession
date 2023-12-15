package StringConcept;

public class User {

	public static void main(String[] args) {
		String s1 = new String("Hello"); //2
//1. String is a class 
		//2. using String literals 
		
		
		String s2 = "Hello";
		System.out.println( s1 == s2);
		System.out.println(s1.equals(s2));
		String s3 = new String("Hello");
		System.out.println(s3.equals(s2));
		System.out.println(s3==s2);
		String s4= "hello";
		System.out.println(s4);
		System.out.println(s3==s4);
		String s5 = new String("hello2");
		String s6 = s5.intern();
		System.out.println(s6);
		System.out.println(s5);
		System.out.println(s5.intern());
		
		String str = "hello";
		System.out.println(str + "selemium");
		System.out.println(str);
		System.out.println(str+100);
		
		System.out.println(str+"100");
		
		
		////////////////string builder is faster and asychrous ///
		
		StringBuilder sb = new StringBuilder("hi");
		System.out.println(sb.append(" how r u"));
		System.out.println(sb);
		
		
		
		
		
		
	}

}
