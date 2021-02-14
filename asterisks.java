import java.util.Scanner;

public class asterisks {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );

        System.out.print( "\n\nEnter the number of desired asterisks: " );
        int numAsterisks = input.nextInt();
        System.out.print( "\nNow enter a 1 or a 2 to represent if you want\nthe program to output the first or second pattern: " );
        int userPattern = input.nextInt();

        if (userPattern == 1) {
            for (int x = 1; x <= numAsterisks; x++) {
                for (int y = 1; y <= x; y++) {
                    System.out.print("*");
                }
                System.out.println("\n");
            }
        } else {
            for (int x = numAsterisks; x > 0; x--) {
                for (int y = x; y > 0; y--) {
                    System.out.print("*");
                }
                System.out.println("\n");
            }
        }
    }
}