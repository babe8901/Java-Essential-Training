package games;

import java.util.Scanner;

public class ChangeForADollarGame {
    public static void main(String[] args) {
        double penny = 0.01, nickel = 0.05, dime = 0.2, quarter = 0.25, dollar = 1;
        int numOfPennies, numOfNickels, numOfDimes, numOfQuarters;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to 'Change for a Dollar'! Your goal is to enter enough change to make exactly $1.00");

        System.out.println("Enter your number of pennies:");
        numOfPennies = scanner.nextInt();
        System.out.println("Enter your number of nickels:");
        numOfNickels = scanner.nextInt();
        System.out.println("Enter your number of dimes:");
        numOfDimes = scanner.nextInt();
        System.out.println("Enter your number of quarters:");
        numOfQuarters = scanner.nextInt();
        scanner.close();

        double total = numOfPennies * penny + numOfNickels * nickel + numOfDimes * dime + numOfQuarters * quarter;

        if (total < dollar) {
            double amountShort = dollar - total;
            System.out.println("Sorry, you lose! You were short " + String.format("%.2f", amountShort) + "of $1.00");
        } else if (total > dollar) {
            double amountOver = total - dollar;
            System.out.println("Sorry, you lose! You were over " + String.format("%.2f", amountOver) + "of $1.00");
        } else {
            System.out.println("Yay! That's exactly $1.00! You win!");
        }
    }
}
