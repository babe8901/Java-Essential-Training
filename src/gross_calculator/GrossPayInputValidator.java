package gross_calculator;

import java.util.Scanner;

public class GrossPayInputValidator {
    public static void main(String[] args) {
        int payRate = 15;
        int maxHours = 40;

        System.out.println("How many hours did the employee work this week?");
        Scanner scanner = new Scanner(System.in);
        int hoursWorked = scanner.nextInt();

        //Validate input
        while (hoursWorked > maxHours) {
            System.out.println("Invalid entry. Your hours must be between 1 and 40. Try again.");
            hoursWorked = scanner.nextInt();
        }
        scanner.close();

        int gross = payRate * hoursWorked;
        System.out.println("Gross pay: $" + gross);
    }
}
