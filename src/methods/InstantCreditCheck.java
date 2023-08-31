package methods;

import java.util.Scanner;

public class InstantCreditCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary:");
        double actualSalary = scanner.nextDouble();

        System.out.println("Enter your credit score:");
        int actualCreditScore = scanner.nextInt();
        scanner.close();

        isUserQualified(actualCreditScore, actualSalary);
    }

    public static void isUserQualified(int creditScore, double salary) {
        double requiredSalary = 25000;
        int requiredCreditScore = 700;

        if (salary >= requiredSalary && creditScore >= requiredCreditScore) {
            System.out.println("Congrats! You've been approved!");
        } else {
            System.out.println("Sorry, you've been declined.");
        }
    }
}
