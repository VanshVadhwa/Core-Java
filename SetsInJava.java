import java.util.*;

public class SetsInJava {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        for(int i=4;i>=1;i--) {
            set.add(i);
        }
        set.add(3);

        Iterator<Integer> values = set.iterator();

        while(values.hasNext()) {
            System.err.println(values.next());
        }

        for(int i : set) {
            System.out.print(i + " ");
        }
    }
}
