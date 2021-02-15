import java.util.Scanner;

public class asterisks {
    public static void main(String[] args) {

        // Initialize scanner
        Scanner input = new Scanner( System.in );

        /* Prompts the user for the number of asterisks and whether the user
        wants the output to be an ascending pattern or a descending pattern. */
        System.out.print( "\n\nEnter the number of desired asterisks: " );
        int numAsterisks = input.nextInt();
        System.out.print( "\nEnter a 1 for the output to be an ascending pattern\nor a 2 for a descending pattern: " );
        int userPattern = input.nextInt();

        // Outputs the pattern based on the user's decision
        if (userPattern == 1) {

            /* This for loop initializes the counter variable x with the value of 1. At the end of each
            iteration, the value will be incremented by 1. Once x is greater than or equal to 
            the variable numAsterisks, the program will exit the loop */

            // For loop to iterate through each non-negative integer of the variable numAsterisks
            for (int x = 1; x <= numAsterisks; x++) {

                /* in each iteration of the parent for loop, output variable y
                number of asterisks. The number of asterisks increases for each iteration. */
                for (int y = 1; y <= x; y++) {
                    System.out.print("*");
                }

                // Print a newline character so the next set of asterisks can be printed on a new line.
                System.out.println("\n");
            }
        } else {

            /* This for loop initializes variable x with the same value as numAsterisks. At the end of each iteration,
            x will be decreased by 1 until it's no longer greater than 0. */

            // For loop to iterate through each non-negative integer of the variable numAsterisks
            for (int x = numAsterisks; x > 0; x--) {

                /* in each iteration of the parent for loop, output variable y
                number of asterisks. The number of asterisks decreases for each iteration. */
                for (int y = x; y > 0; y--) {
                    System.out.print("*");
                }

                // Print a newline character so the next set of asterisks can be printed on a new line.
                System.out.println("\n");
            }
        }
    }
}