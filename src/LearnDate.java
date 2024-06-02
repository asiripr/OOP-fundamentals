import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class LearnDate {
	public static void main(String[] args) {
		LocalDate object1 = LocalDate.now();
		System.out.println(object1);
		
		LocalTime object2 = LocalTime.now();
		System.out.println(object2);
		
		LocalDateTime object3 = LocalDateTime.now();
		System.out.println(object3);
		
		LocalDateTime myDateObj = LocalDateTime.now();
	    System.out.println("Before formatting: " + myDateObj);
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

	    String formattedDate = myDateObj.format(myFormatObj);
	    System.out.println("After formatting: " + formattedDate);
	}
}
