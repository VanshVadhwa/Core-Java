import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the number of test cases
        System.out.print("Enter the number of test cases: ");
        int t = input.nextInt();

        // Process each test case
        for (int i = 0; i < t; i++) {
            System.out.print("Enter the number: ");
            int n = input.nextInt();

            if (n % 2 == 0) {
                System.out.println("It is an even number");
            } else {
                System.out.println("It is an odd number");
            }
        }

        input.close();
    }
}
