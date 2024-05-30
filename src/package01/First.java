package package01;

public class First {
	int x =16;
	public static void main(String[] args) {
		First baby = new First();
		First kitty = new First();
		System.out.println(baby.x);
		System.out.println(kitty.x);
		
		// making objects of the second class
		Second rocky = new Second();
		System.out.println(rocky.c);
	}
}
