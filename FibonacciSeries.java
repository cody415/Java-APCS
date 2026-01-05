import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input N from user
        System.out.print("Enter the number of terms (N): ");
        int N = sc.nextInt();

        int first = 0, second = 1;

        System.out.println("Fibonacci series till " + N + " terms:");

        // Loop to generate Fibonacci series
        for
