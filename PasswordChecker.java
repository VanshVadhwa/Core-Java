import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Accept username and password input
        String password = input.nextLine();
        
        if (password.length() < 6) {
            System.out.println("Too short!");
        } 
        else if (!password.matches(".*\\d.*")) {
            System.out.println("No digit!");
        } 
        else {
            System.out.println("Correct");
        }
        
        input.close();
    }
}
