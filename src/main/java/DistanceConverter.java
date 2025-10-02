import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("Choose Conversion Direction:");
            System.out.println("1. Convert Miles to Kilometers");
            System.out.println("2. Kilometers to Miles");
            System.out.println("3. Exit\n");
            System.out.print("Enter your choice (1, 2, or 3): ");
            int choice = sc.nextInt();
            System.out.println();
            switch (choice) {
                case 1:
                    System.out.print("Enter distance in miles: ");
                    double miles = sc.nextDouble();
                    System.out.println("\n");
                    System.out.println("Conversion Results:");
                    System.out.println("Miles: " + miles);
                    System.out.printf("Kilometers: %.5f\n\n", miles*1.60935);
                    break;
                case 2:
                    System.out.print("Enter distance in kilometers: ");
                    double km = sc.nextDouble();
                    System.out.println("\n");
                    System.out.println("Conversion Results:");
                    System.out.println("Kilometers: " + km);
                    System.out.printf("Miles: %.5f\n\n", km/1.60935);
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Please enter valid option.");
                    break;
            }
        }
    }
}