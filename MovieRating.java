import java.util.Scanner;

public class MovieRating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input rating count from user
        System.out.print("Enter the rating count (0 - 100): ");
        int ratingCount = sc.nextInt();

        // Judge rating based on rating count
        if (ratingCount > 90) {
            System.out.println("Movie Rating: ⭐⭐⭐⭐⭐ (Excellent)");
        } else if (ratingCount > 75) {
            System.out.println("Movie Rating: ⭐⭐⭐⭐ (Very Good)");
        } else if (ratingCount > 50) {
            System.out.println("Movie Rating: ⭐⭐⭐ (Good)");
        } else if (ratingCount > 30) {
            System.out.println("Movie Rating: ⭐⭐ (Average)");
        } else {
            System.out.println("Movie Rating: ⭐ (Poor)");
        }

        sc.close();
    }
}
