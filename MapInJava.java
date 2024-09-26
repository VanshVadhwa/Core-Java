import java.util.*;

public class MapInJava {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();

        students.put("Thirza", 12);
        students.put("Umang", 25);
        students.put("Vansh", 32);

        // System.out.println(students.get("Vansh"));

        for(String key : students.keySet())
        {
            System.out.println(key + " : " + students.get(key));
        }
    }
}