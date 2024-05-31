package learnInnerClasses;

class OuterClass{
	int x = 14;
	class InnerClass{
		int y = 36;
	}
}

public class Main {
	public static void main(String[] args) {
		//  ***** we can easily access to the outer class attributes. *****
//		OuterClass myOuter = new OuterClass();
//		System.out.println(myOuter.x);
		
		//  ***** to create objects of the inner class we must go through the outer class ***** 
		OuterClass.InnerClass myInner = new OuterClass().new InnerClass(); // we have to create object of outer class, if inner class was static we no need to create an object of outer class
		System.out.println(myInner.y);
	}
}
