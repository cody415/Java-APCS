import java.util.Scanner;

public class greaterThan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // If-Else condition
        if (number > 10) {
            System.out.println("Yes I'm Greater");
        } else {
            System.out.println("Sorry I feel bad");
        }

        sc.close();
    }
}
