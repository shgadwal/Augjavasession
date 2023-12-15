package Methods;

public class FileConcept {
	
	static String name; // static variable -- goes in cma
	int filesize; // instance class variable
//static methods
	
	public static void readFile() {
		System.out.println("read file");
	}
	
	public  void writeFile() {
		System.out.println("write file");
	}
	
	public static void main(String[] args) {
		FileConcept fc = new FileConcept();
		fc.writeFile();
     FileConcept.readFile();

	}

}
