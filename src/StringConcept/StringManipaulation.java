package StringConcept;

import java.util.Arrays;

public class StringManipaulation {

	public static void main(String[] args) {
		
		String str = "Hi This is my java code and i am so happy";
		System.out.println(str.length());
		System.out.println("LI  " + 0);
		System.out.println("HI  " + (str.length()-1));
		System.out.println(str.length());
		System.out.println(str.charAt(0));
		//System.out.println(str.charAt(36));//string indexoutof bound runtime expection
		System.out.println(str.charAt(8));
		System.out.println(str.charAt(9));
		System.out.println(str.charAt(10));
		System.out.println(str.charAt(11));
		System.out.println(str.charAt(20));
		System.out.println(str.charAt(30));
		System.out.println(str.charAt(23));
		System.out.println(str.indexOf("h"));
		System.out.println(str.indexOf("c"));
		System.out.println(str.indexOf("o"));
		System.out.println(str.indexOf("i"));
		System.out.println(str.indexOf(32));
		
		System.out.println("================");
		
		int fc= str.indexOf("i");
		System.out.println(fc);
		int sc=str.indexOf("i", fc+1);
		System.out.println(sc);
		
		int tc=str.indexOf("i", sc+1);
		System.out.println(tc);
		int fouc=str.indexOf("i", tc+1);
		System.out.println(fouc);
	   System.out.println("================");
		
		System.out.println(str.indexOf("i", str.indexOf("i")+1));
			
		System.out.println(str.indexOf("i", str.indexOf("i")+5));
		System.out.println(str.charAt(8));
		System.out.println(str.indexOf("i", str.indexOf("i")+8));
		System.out.println(str.charAt(28));
		System.out.println(str.indexOf("i", str.indexOf("i")+28));
		
		System.out.println(str.indexOf("java"));
		System.out.println(str.charAt(14));
		
		
		String messg = "account admin";
		if (messg.indexOf("admin") > 0 ) {
			System.out.println("valid admin");
		}
		else
		{
			System.out.println("not present");
			
			
		}
		
		
		//trim 
		String strt = "     hi    im    happy  ";
			System.out.println(strt.trim());// to remove the start and end spaces 
			System.out.println(strt.replace(" ", ""));
		
		// replace 
			
			String rep = "04-18-1980";
		String tmp	=rep.replace("-", "/");
			System.out.println(tmp);
			
			// to Lower and to Upper 
			
			String str1 = "THIS is java";
			System.out.println(str1.toLowerCase());
			System.out.println(str1.toUpperCase());
			
			
			//comparion
			
			String l1= "glasses";
			String l2= "Glasses";
			System.out.println(l1==l2);
			System.out.println(l1.equals(l2));
			System.out.println(l1.equalsIgnoreCase(l2));	/// ignores the case
			
			
			// contains
			
			String mssg= "hello this is java lang";
			System.out.println(mssg.contains("java"));
			if(mssg.contains("java")) {
				System.out.println("pass");
		
			}
			else {
				System.out.println("fail");
			}
			
			//sub-string
			
			
			String hou ="This is my house: 1234";
			
			System.out.println(hou.substring(11));
			System.out.println(hou.substring(hou.indexOf(":")+1, hou.length()));
			
			//split 
			
			String lang= "JAVA_PYTHON_RUBY_JAVASCRIPT";
			String lg[]= lang.split("_");
			System.out.println(lg[0]);
			System.out.println(lg[3]);
			System.out.println(Arrays.toString(lg));
			
			String pop = "XxwhatXxXxxinXxXxtheXxworldXxXxisXxXxthisXxXx";
			String p[]=pop.split("Xx");
			System.out.println(p[0]);
			System.out.println(p[1]);
			System.out.println(p[2]);
			System.out.println(p[3]);
			System.out.println(p[4]);
			System.out.println(p[5]);
			System.out.println(p[6]);
			System.out.println(p[7]);
			System.out.println(p[8]);
			System.out.println(p[9]);
			System.out.println(p[10]);
			//System.out.println(p[11]);
			
			
			String pp="_she__is__fine";
			String r[]= pp.split("_");
			System.out.println(r[0]);
			System.out.println(r[1]);
			System.out.println(r[2]);
			System.out.println(r[3]);
			System.out.println(r[4]);
			System.out.println(r[5]);
			
			String ss="she_ is_fine";
			String s[]=ss.split("_");
			System.out.println(s[0]);
			System.out.println(s[1]);
			System.out.println(s[2]);
			//System.out.println(s[3]);
			
			String emp="ravi:sharma:raj:kk";
			String dd[]=emp.split(":");
			System.out.println(Arrays.toString(dd));
			System.out.println(dd[1]);
			
			String go=" This__ is __so__funny";
			
			String ne =go.trim();
			System.out.println(ne);
			String jj[]=ne.split("__");
			System.out.println(jj[0]);
			System.out.println(Arrays.toString(jj));
			
			
			//remove the special characters 
			String kk="java.selenium.python.ruby";
			String ll[]	=kk.split("\\.");
			System.out.println(ll[0]);
			System.out.println(Arrays.toString(ll));
			
			// remove the special characters |
			
			String nk="java|selenium|python|ruby";
			String yy[]=nk.split("\\|");
			System.out.println(yy[0]);
			System.out.println(Arrays.toString(yy));
			
			//print this way- "this is "java" im learning"
			String sm= "this is java im learning";	
			System.out.println(sm);
			System.out.println("this is \"java\" im learning" );
			
			////////////////////
			
			//System.out.println(sa);
			
			/*StringManipaulation bb = new StringManipaulation();
			bb=new StringManipaulation();
			bb=new StringManipaulation();
			bb=new StringManipaulation();*/
			
			
			
			String pip = "xXHelloNaveenxXXAutomationXxXLabsXXxXJava";
			String ro[] = pip.split("xX");
			System.out.println("-----------");
			//System.out.print(ro[0] + "  " + ":");
			
			System.out.print(ro[1].length());
			
			System.out.print(ro[2].length());
			
			System.out.print(ro[3].length());
			
			System.out.print(ro[4].length());
			
			//System.out.print(ro[5].length());
			
			//System.out.print(ro[1].length());
			
			System.out.println(Arrays.toString(ro));
			
			System.out.print(ro[0] + ":" + ro[0].length());
			
			
			
			
			
			
			
	}
	
	

}
