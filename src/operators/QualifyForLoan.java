package operators;

import java.util.Scanner;

public class QualifyForLoan {
    public static void main(String[] args) {
        double salary, requiredSalary = 30000;
        int years, requiredYearsEmployed = 2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your current salary:");
        salary = scanner.nextDouble();
        System.out.println("Enter the duration in years at your current job:");
        years = scanner.nextInt();
        scanner.close();

        if (salary >= requiredSalary && years >= requiredYearsEmployed) {
            System.out.println("Congrats! You qualify for the loan");
        } else {
            System.out.println("Sorry, you do not qualify for the loan");
        }
    }
}
