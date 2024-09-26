
import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of test cases: ");
        int t = input.nextInt();
        input.nextLine();

        for (int k = 0; k < t; k++) {
            System.out.print("Enter the string: ");
            String s = input.nextLine();
            StringBuilder ans = new StringBuilder();
            int n = s.length();
            // for(int i=0;i<n;i++)
            // {
            //     char c = Character.toLowerCase(s.charAt(i));
            //     if(c-'a'<26 && c-'a'>=0) {
            //         ans.append(c);
            //     }
            //     if(c-'0'<10 && c-'0'>=0) {
            //         ans.append(c);
            //     }
            // }
            for (int i = 0; i < n; i++) {
                char c = Character.toLowerCase(s.charAt(i));
                if (Character.isLetterOrDigit(c)) {
                    ans.append(c);
                }
            }

            String temp = ans.toString();
            String reversed = ans.reverse().toString();

            if (temp.equals(reversed)) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
        input.close();
    }
}
