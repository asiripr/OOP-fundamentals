package package01;
//used to initialize objects.
//used to set initial values for object attributes.
public class LearnConstructors {
	int modelYear;
	String modelName;

	public LearnConstructors(int year, String name) {
	    modelYear = year;
	    modelName = name;
	}

	public static void main(String[] args) {
		LearnConstructors myCar = new LearnConstructors(1969, "Mustang");
		System.out.println(myCar.modelYear + " " + myCar.modelName);
	}

}
