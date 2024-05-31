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
		OuterClass.InnerClass myInner = new OuterClass().new InnerClass();
		System.out.println(myInner.y);
	}
}
