package Methods;

public class Browser {

	// WAF : To launch browser
	// function name : launchBrowser
	// param : browerName(string) chrome/ff/safari/edge
	// return : boolean type return (true/false)

	public boolean launchBroswer(String browserName) {
		System.out.println("your browser name is :" + browserName);
	boolean flag= true;
	
		switch (browserName.trim().toLowerCase()) {
		case "chrome":
			System.out.println("chrome is lauched  ");
			break;

		case "ff":
			System.out.println("ff is lauched  ");
			break;

		case "safari":
			System.out.println(" safari is lauched");
			break;

		case "edge":
			System.out.println("edge is launched");
			break;

		default:
			System.out.println("pls provide correct browser name ....");
			flag=false;
			break;
		}
     return flag;
	}

	public static void main(String[] args) {

		// main method is caller to call all the method !
		// we should never write the business logic in the main method.
		
		Browser br = new Browser();
		//br.launchBroswer("chrome");
	boolean flag = br.launchBroswer("sheetal"); //note :just only value of flag  i.e true/false from the above method is returned /passed 
	//to local variable flag in the local flag - there by scope of variable "flag" is local to this main method
	if (flag) {
		System.out.println("enter the url ....");
	}
	else {
    System.out.println("error...no browser is there");
	}

}
}

