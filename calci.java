public class calci {
    public static void main(String[] args) {
        // --- Data Types ---
        // Primitive data types
        byte b = 10;          // 8-bit integer
        short s = 1000;       // 16-bit integer
        int i = 50000;        // 32-bit integer
        long l = 1000000000L; // 64-bit integer
        float f = 3.14f;      // 32-bit floating point
        double d = 99.99;     // 64-bit floating point
        char c = 'A';         // 16-bit Unicode character
        boolean flag = true;  // true/false

        // Display data types
        System.out.println("Data Types in Java:");
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + flag);

        // --- Operators ---
        int x = 10, y = 5;

        System.out.println("\nOperators in Java:");

        // Arithmetic Operators
        System.out.println("Addition: " + (x + y));
        System.out.println("Subtraction: " + (x - y));
        System.out.println("Multiplication: " + (x * y));
        System.out.println("Division: " + (x / y));
        System.out.println("Modulus: " + (x % y));

        // Relational Operators
        System.out.println("x > y: " + (x > y));
        System.out.println("x < y: " + (x < y));
        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));

        // Logical Operators
        boolean cond1 = true, cond2 = false;
        System.out.println("cond1 && cond2: " + (cond1 && cond2));
        System.out.println("cond1 || cond2: " + (cond1 || cond2));
        System.out.println("!cond1: " + (!cond1));

        // Assignment Operators
        int z = 20;
        z += 5; // z = z + 5
        System.out.println("Assignment (z += 5): " + z);

        // Unary Operators
        int num = 10;
        System.out.println("Unary plus: " + (+num));
        System.out.println("Unary minus: " + (-num));
        System.out.println("Increment: " + (++num));
        System.out.println("Decrement: " + (--num));

        // Bitwise Operators
        int a = 6, b2 = 3; // binary: 6 = 110, 3 = 011
        System.out.println("Bitwise AND: " + (a & b2));
        System.out.println("Bitwise OR: " + (a | b2));
        System.out.println("Bitwise XOR: " + (a ^ b2));
        System.out.println("Bitwise NOT (~a): " + (~a));
        System.out.println("Left Shift (a << 1): " + (a << 1));
        System.out.println("Right Shift (a >> 1): " + (a >> 1));
    }
}
