package learnEnum;

import java.util.Iterator;

enum Days{ // enum is a group of constants
	MONDAY, // every constant should be written in capital letters
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY,
	SUNDAY
}
public class LearnEnum {
	public static void main(String[] args) {
		for (Days myDay : Days.values()) { // Days.values() returns a list of constants
			System.out.println(myDay);
			
		}
	}
}
