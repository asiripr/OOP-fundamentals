package learnAbstraction;

interface FirstInterface{
	public void firstMethod();
}
interface SecondInterface{
	public void secondMethod();
}
class Student implements FirstInterface, SecondInterface{

	@Override
	public void firstMethod() {
		System.out.println("He is a good teacher.");
		
	}
	@Override
	public void secondMethod() {
		System.out.println("She is a good teacher.");
		
	}

	
}
public class LearnInterfaceMore {
	public static void main(String[] args) {
		Student sunil = new Student();
		sunil.firstMethod();
		sunil.secondMethod();
	}
}
