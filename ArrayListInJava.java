import java.util.*;

public class ArrayListInJava {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();

        // for(int i=1;i<=4;i++) {
        //     nums.add(i);
        // }

        // for(int i=0;i<4;i++) {
        //     System.out.print(nums.get(i) + " ");
        // }

        // nums.remove(3);

        Comparator<Integer> com = (Integer i, Integer j) -> {
            return i%10 > j%10 ? 1 : -1;
        };

        nums.add(43);
        nums.add(10);
        nums.add(58);
        nums.add(25);
        nums.add(12);

        Collections.sort(nums, com);

        System.out.println(nums);
    }
}
