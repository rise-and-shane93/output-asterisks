import java.util.Scanner;

public class asterisks {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );

        System.out.print( "\n\nEnter the number of desired asterisks: " );
        int numAsterisks = input.nextInt();
        System.out.print( "\nNow enter a 1 or a 2 to represent if you want\nthe program to output the first or second pattern: " );
        int userPattern = input.nextInt();

        System.out.println(numAsterisks);
        System.out.println(userPattern);
    }
}