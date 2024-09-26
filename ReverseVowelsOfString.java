import java.util.*;

public class ReverseVowelsOfString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of test cases: ");
        int t = input.nextInt();
        input.nextLine(); // Consume the newline character

        for (int k = 0; k < t; k++) {
            System.out.print("Enter the string: ");
            String s = input.nextLine();
            System.out.println("Reversed vowels string: " + reverseVowels(s));
        }

        input.close();
    }

    public static String reverseVowels(String s) {
        // Convert string to character array
        char[] chars = s.toCharArray();

        // Define vowels
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 
                                                              'A', 'E', 'I', 'O', 'U'));

        // Two pointers approach
        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            // Move start pointer to the next vowel
            while (start < end && !vowels.contains(chars[start])) {
                start++;
            }
            // Move end pointer to the previous vowel
            while (start < end && !vowels.contains(chars[end])) {
                end--;
            }
            // Swap vowels
            if (start < end) {
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;
                start++;
                end--;
            }
        }

        // Convert character array back to string
        return new String(chars);
    }
}
