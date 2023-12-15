package OOP_Inhertance;

public class Car extends Vehicle {
	
	/* public final void  start( ) { // final method cannot be overriden in child class  
		
		System.out.println("car ....start");
		
	}*/
	
	int minSpeed =100;
public void start() {
		
		System.out.println("car.... start");
	
	}
	
	public void stop() {
		
		System.out.println("car.... stop");
	
	}
	
	public void refuel() {
		System.out.println("car...refuel");
		
	}

	public static void billing() {
		System.out.println("car ...biling");
	}
	
	private void bulbs() {
		System.out.println("car ... bulb");
		
	}
	
	public void function() {
		System.out.println("show all the features");
		bulbs();
	}
}
