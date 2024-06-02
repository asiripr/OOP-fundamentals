package learnAbstraction;
// in abstract classes we can't be created objects
abstract class Animal{
	public abstract void animalSound(); // abstract methods does not having bodies
	public void sleep() {
		System.out.println("I am sleeping...");
	}
}
class Cat extends Animal{
	// in here we must write the body of our abstract method
	public void animalSound() {
		System.out.println("The cat sys: meow.. meow..");
	}	
}

public class LearnAbs {
	public static void main(String[] args) {
		Cat kitty = new Cat();
		kitty.animalSound();
		kitty.sleep();
	}
}