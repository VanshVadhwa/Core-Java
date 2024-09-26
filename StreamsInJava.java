import java.util.*;
import java.util.stream.Stream;

public class StreamsInJava {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();

        nums.add(43);
        nums.add(10);
        nums.add(58);
        nums.add(25);
        nums.add(12);

        // Stream<Integer> s1 = nums.stream(); // it has all values inside s1, we can only use it once
        // Stream<Integer> s2 = s1.filter(n -> n%2==0); //filtering the value
        // Stream<Integer> s3 = s2.map(n -> n*2); //doubling the value, and as s2 is used, it is finished so we move to s3
        // int result = s3.reduce(0,(c,e) -> c+e);

        // int result = nums.stream() 
        //             .filter(n->n%2==0)
        //             .map(n->n*2)
        //             .reduce(0,(c,e) -> c+e);

        // System.out.println(result);
        // s3.forEach(n -> System.out.print(n + " "));

        //Sorted Values
        Stream<Integer> sortedValues = nums.stream()
                                        .sorted();
        sortedValues.forEach(n -> System.out.print(n + " "));
    }
}
