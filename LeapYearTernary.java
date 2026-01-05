import java.util.Scanner;

public class LeapYearTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input year from user
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Leap year check using ternary operator
        String result = (year % 400 == 0) ? "Leap Year"
                     : (year % 100 == 0) ? "Not a Leap Year"
                     : (year % 4 == 0)   ? "Leap Year"
                     : "Not a Leap Year";

        // Display result
        System.out.println(year + " is " + result);

        sc.close();
    }
}
