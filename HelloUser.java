import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking different datatype inputs
        System.out.print("Enter an integer: ");
        int intValue = sc.nextInt();

        System.out.print("Enter a float: ");
        float floatValue = sc.nextFloat();

        System.out.print("Enter a double: ");
        double doubleValue = sc.nextDouble();

        System.out.print("Enter a character: ");
        char charValue = sc.next().charAt(0);

        System.out.print("Enter a boolean (true/false): ");
        boolean boolValue = sc.nextBoolean();

        System.out.print("Enter a string: ");
        sc.nextLine(); // consume leftover newline
        String stringValue = sc.nextLine();

        // Displaying the inputs
        System.out.println("\n--- You Entered ---");
        System.out.println("Integer: " + intValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Character: " + charValue);
        System.out.println("Boolean: " + boolValue);
        System.out.println("String: " + stringValue);

        sc.close();
    }
}
