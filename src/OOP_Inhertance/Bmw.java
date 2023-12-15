package OOP_Inhertance;

public class Bmw extends Car {
	// Method overriding : poly (many) + morphism (forms) :runtime dynamic 
	
	// when we have parent and child class
	
//1. with same method name 
	// 2. with same method name (same parameters )
	// 3. with same method no of  parameters + same sequence
	// 4. same return type 
	
	
	//
	//@Override
	/*public void start() {
		System.out.println(" BMW ... start");
	
	}*/
	
	
	int maxSpeed= 500;
	public void start() {
		System.out.println(" BMW ... start");
	
	}
	
	public void autoparking() {
		
		System.out.println("BMW .....autoparking");
	}
@Override

	public void engine () {
		System.out.println("Bmw....engine");
}
		
@Override
		public void motorparts() {
			System.out.println("Bmw....motorparts");
			
		}

    public void useAudiPowerSteering(Audi audi) {
   audi.powersteer();
   
}
   // @Override- cannot override the static methods in the subclass.
    // same static method when parent and child has is called method hiding it cannot be called method overloading 
    //as this are static method . this concept is called method hiding -generally it will hide parent class billing method 
//
     public static void billing() {
     System.out.println("bmw ...biling");
   }
  
     // @Override private methods cannot be overiden 
     
     private void bulbs() {
 		System.out.println("bmw ... bulb");
 		
 	}
    // now to access the above private methods create a public layer and access it :
    	 
    	 public void checkall() {
    		 System.out.println(" check no alarms  ");
    		 
    		 bulbs();
    	 }
    
    
	}

