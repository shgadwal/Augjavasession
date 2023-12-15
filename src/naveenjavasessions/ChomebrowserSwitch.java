package naveenjavasessions;

public class ChomebrowserSwitch {

	public static void main(String[] args) {
	String browser = "SAFARI  " ;
	
	switch (browser.toLowerCase().trim()) {
	case "chrome" : {
		
		System.out.println("launch  " + browser);
		break ;
		
	}
	
	case "firefox" :{
		System.out.println("launch " + browser);
		break;
		
	}
	
	case "edge":{
		System.out.println("launch "+ browser);
		break;
		
	}
		
	case "safari":{
		System.out.println("launch "+ browser);
		break;
		
	}
	
	case "opera":{
		System.out.println("launch " + browser);
		break;
		
	}
	
	default:{
		System.out.println("plz pass the right browser  "+ browser );
	}
	
	}
	
	
			

	}

}
