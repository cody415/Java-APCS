public class tenTen {
    public static void main(String[] args) {
        // Descending order using for loop
        System.out.println("First 10 natural numbers in descending order (for loop):");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n");

        // Ascending order using while loop
        System.out.println("First 10 natural numbers in ascending order (while loop):");
        int j = 1;
        while (j <= 10) {
            System.out.print(j + " ");
            j++;
        }
    }
}
