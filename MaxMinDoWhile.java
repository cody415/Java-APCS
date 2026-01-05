import java.util.Scanner;

public class MaxMinDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        int max, min;
        char choice;

        // First input to initialize max and min
        System.out.print("Enter a number: ");
        number = sc.nextInt();
        max = number;
        min = number;

        do {
            // Ask for another number
            System.out.print("Enter another number: ");
            number = sc.nextInt();

            // Update max and min
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }

            // Ask if user wants to continue
            System.out.print("Do you want to enter more numbers? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        // Display results
        System.out.println("\nMaximum number entered: " + max);
        System.out.println("Minimum number entered: " + min);

        sc.close();
    }
}
