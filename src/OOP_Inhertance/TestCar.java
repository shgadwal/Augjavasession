package OOP_Inhertance;

public class TestCar {

	public static void main(String[] args) {
	
	Bmw b = new Bmw();
	b.autoparking();
	b.start();
	b.stop();
	b.refuel();
	b.engine();
	b.motorparts();
	b.tyres();
	b.design_of_engine();
	b.dynamics_of_engine();
	b.motorspeed(50);
	Bmw.billing();
	b.function();
	b.checkall();
	
	System.out.println(b.minSpeed);
	System.out.println("-------");
	
	//==============to do top casting =====
	
	System.out.println( "===== topcasting");
	Car c1= new Bmw();
	c1.start();//overridden
	c1.function();//inherited
	c1.refuel();//inherited
	c1.engine();//overridden
	c1.stop();//inherited
	Car.billing();//static
	c1.motorparts();//overridden
	
	System.out.println(c1.minSpeed);
	System.out.println("----to cast end---- ");
	//========
	
	
	Audi a = new Audi();
	a.powersteer();
	b.useAudiPowerSteering(a);

	
	
	
	
	System.out.println("-----------");
	
	
	Car c = new Car();
	c.start();
	c.stop();
	c.refuel();
	c.engine();
	c.dynamics_of_engine();
	c.design_of_engine();
	c.motorparts();
	c.tyres();
	c.motorspeed(800);
	Car.billing();
	c.function();
	System.out.println(c.minSpeed);
	System.out.println("-----------");
	
	Vehicle v = new Vehicle ();
	
	
	v.engine();
	v.motorparts();
	v.tyres();
	v.design_of_engine();
	
	System.out.println("-----------");
	
	Automobile am = new Automobile();
	am.tyres();
	am.motorparts();
	
	System.out.println("-----------");
	
		
	
	Mechanical m = new Mechanical();
		
		m.design_of_engine();
		m.design_of_engine();
		m.motorspeed(100);
		int result = m.motorspeed(100);
		System.out.println("Mechinal ....." + result );
			
		System.out.println("-----------");
		
		Physics p = new Physics();
		
		p.light();
		p.radiation();
		p.sound();
				
		
		
		
	}

}
