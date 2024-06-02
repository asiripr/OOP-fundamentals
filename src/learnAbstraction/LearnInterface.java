package learnAbstraction;

interface Vehical{
	// methods with empty bodies
	public void vehicalSound();
	public void speed();
}

class Car implements Vehical{
	@Override
	public void vehicalSound() {
		System.out.println("Brumm... Brumm...");
		
	}
	@Override
	public void speed() {
		System.out.println("120kmph");
		
	}
}

public class LearnInterface {
	public static void main(String[] args) {
		Car luvi = new Car();
		luvi.vehicalSound();
		luvi.speed();
	}
}
