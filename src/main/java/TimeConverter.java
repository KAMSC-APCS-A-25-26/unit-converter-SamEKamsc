import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("Choose time to total seconds");
            System.out.print("Enter hours: ");
            int h = sc.nextInt();
            System.out.print("Enter minutes: ");
            int m = sc.nextInt();
            System.out.print("Enter seconds: ");
            int s = sc.nextInt();
            System.out.println();
            System.out.println("Time Conversion:");
            System.out.println("Input: " + h + " hours, " + m + " minutes, " + s + " seconds");
            System.out.println("Total: " + (h*3600 + m*60 + s) + " seconds\n");
            System.out.println("Calculations:");
            System.out.println(h + " hours × 3600 = " + h*3600 + " seconds");
            System.out.println(m + " minutes × 60 = " + m*60 + " seconds");
            System.out.println(s + " seconds = " + s + " seconds");
            System.out.println("Total: " + (h*3600 + m*60 + s) +  " seconds\n");
            System.out.print("Do you want to convert another time? (y/n):  ");
            String cont = sc.nextLine();
            if (cont.equals("n")) {
                System.out.println("Goodbye!");
                running = false;
            }
        }
        // TODO: Implement time converter
        // Requirements:
        // - Prompt for hours, minutes, and seconds
        // - Display conversion results and calculation breakdown
        // - Ask user if they want to convert another time (y/n)
        // - Loop until user chooses to exit
    }
}