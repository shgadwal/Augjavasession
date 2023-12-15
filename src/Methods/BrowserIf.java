package Methods;

public class BrowserIf {
	

	public boolean launchbro(String browserName) {
		boolean flag = true;
		
		if(browserName.equals("chrome")) {
			System.out.println("launch the browser :"+ browserName) ;
			}
		else if(browserName.equals("ff")){
			System.out.println("launch the browser :" + browserName );
			}
		else if(browserName.equals("safari")) {
			System.out.println(" launch the browser : " + browserName );
		}
		else if (browserName.equals("edge")) {
			System.out.println("launch the browser : " + browserName);
		}
		else {
			System.out.println(" please provide the correct browser" );
			flag = false ;
		}
		
		return flag;
	}
	
	// waf to get the student marks 
	//function name - getstudentMarks(String stname)
	//return - marks
	
	
	public int getstudentMarks(String stname) {
		int marks=-1; // local variables always need to be initialized
		
		if (stname.equals("sheetal")) {
			System.out.println("this student sheetal");
			marks= 100;
		}
		else if (stname.equals("ish")) {
			System.out.println("this student ish");
			marks =90;
		
		}
		else if (stname.equals("vin")) {
			System.out.println("this student vih");
			marks =91;
		}
		else {
			System.out.println("provide the correct name...");
			//marks= -1 ; 
		}
		
		return marks ;
		
	}

	public static void main(String[] args) {
		BrowserIf bri = new BrowserIf();
		boolean flag= bri.launchbro("chrome");
		if(flag) {
			System.out.println("enter the url...");
		}
		else 
		{
			System.out.println("error ...please provide correct browser");
		}
		
		int result=bri.getstudentMarks("sheetal    ");
		
		System.out.println("here is  the result  " +  result );
		
		if (result >=0) {
			System.out.println("print the markssheet");   
		}
		
	}

}
