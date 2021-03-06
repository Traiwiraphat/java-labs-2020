
/**
 * This program is to find a(n) which a(n) = a(n-1) + 2 and a(1) = 3.
 * The value of n must be greater or equal to 1.
 * Input: The value of n.
 * Output: The value of a(n).
 * 
 * Author: Chattipoom Sirimul
 * ID: 623040132-7
 * Sec: 1
 * Date: December 25, 2019
 */

import java.util.Scanner;

public class Recursive {
    public static void main(String[] args) {
        int n = 0;
        String userInput;
        Scanner userScanner = new Scanner(System.in);

        // Get a valid input
        while (true) {
            // Get an input
            System.out.print("Enter value of n: ");
            userInput = userScanner.nextLine();

            // Check if input is an integer
            try {
                n = Integer.parseInt(userInput);
            } catch (NumberFormatException ex) {
                System.out.println("Invalid Input: Please enter an integer only.");
                continue;
            }

            // Make sure that input is greater or equal to 1.
            if (n < 1) {
                System.out.println("Invalid Input: Value of n must be greater or equal 1.");
                continue;
            }

            break;
        }

        // Display the result
        System.out.printf("a(%d) = %d", n, rec(n));

        // Close the scanner
        userScanner.close();
    }

    // Get a(n) // Easy-to-understand version
    private static int rec(int n) {
        if (n <= 1)
            return 3;
        else
            return rec(n - 1) + 2;
    }
}
