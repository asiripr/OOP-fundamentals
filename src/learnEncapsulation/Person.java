package learnEncapsulation;
//create a class with private variables
public class Person {
	//attribute (variable)
	private String name;
	
	//getter
	public String getName() {
		return name;
	}
	
	//setter
	public void setName(String newName) {
		this.name = newName; //The this keyword is used to refer to the current object.
	}

}
