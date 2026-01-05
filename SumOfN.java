import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input N from user
        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();

        int sum = 0;

        // Loop to calculate sum of first N numbers
        for (int i = 1; i <= N; i++) {
            sum += i;
        }

        // Output the result
        System.out.println("The sum of the first " + N + " natural numbers is: " + sum);

        sc.close();
    }
}
