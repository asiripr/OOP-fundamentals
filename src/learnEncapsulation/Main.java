package learnEncapsulation;
// the difference between private attributes and public attributes
// getters and setters only want to private attributes
public class Main {
	public static void main(String[] args) {
		// create an object for a person
		Person sunil = new Person();
		sunil.setName("Sunil");
		System.out.println(sunil.getName());
		
		//create an object for a vehicle
		Vehicle office = new Vehicle();
		office.brand = "toyota";
		System.out.println(office.brand);
	}
}



