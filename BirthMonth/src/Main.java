import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their birth month
        System.out.print ("Enter your birth month as a number: " );
        int month = scanner.nextInt();

        // Check if the month is in the valid range
        if (month >= 1 && month <= 12) {
            System.out.println ("You entered: " + month );
        } else {
            System.out.println( "Invalid number. Please enter a value between 1 and 12.");
        }
    }
}