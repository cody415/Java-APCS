import java.util.Scanner;

public class RotatedNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Convert number to string for easy rotation
        String str = Integer.toString(num);

        // Rotate: move last digit to the front
        String rotated = str.charAt(str.length() - 1) + str.substring(0, str.length() - 1);

        // Display result
        System.out.println("Original number: " + num);
        System.out.println("Rotated number: " + rotated);

        sc.close();
    }
}
