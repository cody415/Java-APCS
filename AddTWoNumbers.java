import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        // Perform addition
        int sum = num1 + num2;

        // Display result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        sc.close();
    }
}
