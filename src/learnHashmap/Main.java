package learnHashmap;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        HashMap<String, String> students = new HashMap<String, String>();
        students.put("Sunil", "Colombo");
        students.put("Chamara", "Chillaw");
        students.put("Kawindi", "Galle");
        students.put("Shashini", "Monaragala");

        System.out.println(students);
    }
}
