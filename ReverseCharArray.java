import java.util.Scanner;

public class ReverseCharArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of test cases: ");
        int t = input.nextInt();
        input.nextLine(); // Consume the newline character left by nextInt()

        for (int k = 0; k < t; k++) {
            System.out.print("Enter the length of character array: ");
            int len = input.nextInt();
            input.nextLine(); // Consume the newline character left by nextInt()

            // Declaration of char array
            char[] s = new char[len];
            
            System.out.println("Enter " + len + " characters:");
            for (int i = 0; i < len; i++) {
                s[i] = input.next().charAt(0); // Read one character at a time
            }
            
            // Reverse the character array
            reverseString(s);

            // Print the reversed array
            System.out.println("Reversed character array:");
            for (char c : s) {
                System.out.print(c + " ");
            }
            System.out.println();
        }

        input.close();
    }

    // Method to reverse the character array
    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;

        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            start++;
            end--;
        }
    }
}
