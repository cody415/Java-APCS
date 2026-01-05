import java.util.Scanner;

public class PrimeCheckNested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask how many numbers to check
        System.out.print("Enter how many numbers you want to check: ");
        int count = sc.nextInt();

        // Outer loop: runs for each input number
        for (int i = 1; i <= count; i++) {
            System.out.print("Enter number " + i + ": ");
            int n = sc.nextInt();

            boolean isPrime = true;

            // Inner loop: check divisibility
            if (n <= 1) {
                isPrime = false; // 0 and 1 are not prime
            } else {
                for (int j = 2; j <= n / 2; j++) {
                    if (n % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            // Print result
            if (isPrime) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }

        sc.close();
    }
}
