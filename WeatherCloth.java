import java.util.Scanner;

public class WeatherCloth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Boolean input for weather
        System.out.print("Is it raining? (true/false): ");
        boolean isRaining = sc.nextBoolean();

        System.out.print("Is it cold? (true/false): ");
        boolean isCold = sc.nextBoolean();

        // Nested if-else to predict cloth
        if (isRaining) {
            if (isCold) {
                System.out.println("Prediction: Wear a raincoat with warm clothes.");
            } else {
                System.out.println("Prediction: Carry an umbrella and wear light clothes.");
            }
        } else {
            if (isCold) {
                System.out.println("Prediction: Wear a jacket or sweater.");
            } else {
                System.out.println("Prediction: Wear casual light clothes.");
            }
        }

        sc.close();
    }
}
