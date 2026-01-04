public class MindRiddler {
    public static void main(String[] args) {
        // --- Unary Operators ---
        int x = 10;
        System.out.println("Unary Operators:");
        System.out.println("Original x = " + x);
        System.out.println("Unary plus (+x): " + (+x));
        System.out.println("Unary minus (-x): " + (-x));
        System.out.println("Pre-increment (++x): " + (++x)); // increases before use
        System.out.println("Post-increment (x++): " + (x++)); // increases after use
        System.out.println("After post-increment, x = " + x);
        System.out.println("Pre-decrement (--x): " + (--x));
        System.out.println("Post-decrement (x--): " + (x--));
        System.out.println("After post-decrement, x = " + x);
        System.out.println("Logical NOT (!true): " + (!true));

        // --- Binary Operators ---
        int a = 5, b = 3;
        System.out.println("\nBinary Operators:");
        // Arithmetic
        System.out.println("Addition (a + b): " + (a + b));
        System.out.println("Subtraction (a - b): " + (a - b));
        System.out.println("Multiplication (a * b): " + (a * b));
        System.out.println("Division (a / b): " + (a / b));
        System.out.println("Modulus (a % b): " + (a % b));

        // Relational
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

        // Logical
        boolean cond1 = true, cond2 = false;
        System.out.println("cond1 && cond2: " + (cond1 && cond2));
        System.out.println("cond1 || cond2: " + (cond1 || cond2));

        // Bitwise
        System.out.println("Bitwise AND (a & b): " + (a & b));
        System.out.println("Bitwise OR (a | b): " + (a | b));
        System.out.println("Bitwise XOR (a ^ b): " + (a ^ b));
        System.out.println("Left Shift (a << 1): " + (a << 1));
        System.out.println("Right Shift (a >> 1): " + (a >> 1));
    }
}
