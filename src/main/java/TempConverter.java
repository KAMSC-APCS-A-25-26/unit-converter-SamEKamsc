import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        while (running) {
            // TODO: Implement temperature converter
            // Requirements:
            // - Menu with options: 1. Convert Fahrenheit to Celsius, 2. Convert Celsius to Fahrenheit, 3. Exit
            // - Loop until user chooses to exit
            // - Use formulas: C = (F - 32) * 5/9 and F = C * 9/5 + 32
            // - Display conversion results
            // - Handle invalid menu choices
            System.out.println("Choose Conversion Direction:");
            System.out.println("1. Convert Fahrenheit to Celsius");
            System.out.println("2. Convert Celsius to Fahrenheit");
            System.out.println("3. Exit\n");
            System.out.print("Enter your choice:  ");
            int choice = sc.nextInt();
            System.out.println();
            switch (choice) {
                case 1:
                    System.out.print("Enter temperature in Fahrenheit:  ");
                    double fah = sc.nextDouble();
                    System.out.println("\n");
                    System.out.println("Conversion Results:");
                    System.out.println("Fahrenheit" + fah);
                    System.out.println("Celsius: " + ((fah-32) * 5/9) + "\n");
                    break;
                case 2:
                    System.out.print("Enter temperature in Celsius:  ");
                    double cel = sc.nextDouble();
                    System.out.println("\n");
                    System.out.println("Conversion Results:");
                    System.out.println("Celsius: " + cel);
                    System.out.println("Fahrenheit: " + (cel * 9/5 + 32) + "\n");
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    running = false;
                    break;
            }
        }
        // TODO: Implement temperature converter
        // Requirements:
        // - Menu with options: 1. Convert Fahrenheit to Celsius, 2. Convert Celsius to Fahrenheit, 3. Exit
        // - Loop until user chooses to exit
        // - Use formulas: C = (F - 32) * 5/9 and F = C * 9/5 + 32
        // - Display conversion results
        // - Handle invalid menu choices
    }
}