package learnPolymorphism;
// create the super class
class SriLankas{
	public  void message() {
		System.out.println("We are Sri Lankans!");
	}
}

// creating the sub classes
class Sinhala extends SriLankas{
	public  void message() {
		System.out.println("We speak Sinhala language");
	}
}
class Tamil extends SriLankas{
	public  void message() {
		System.out.println("We speak Tamil language");
	}
}

// the main class
public class Main {
	public static void main(String[] args) {
		//create objects
		SriLankas people = new SriLankas();
		Sinhala sunil = new Sinhala();
		Tamil niluxan = new Tamil();
		
		// call the methods
		people.message();
		sunil.message();
		niluxan.message();
	}
}

