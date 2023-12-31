package text_processing;

import java.util.Scanner;

public class PasswordValidator {
    private static final String currentUsername = "johndoe";
    private static final String currentPassword = "ABC_1234";
    public static void main(String[] args) {
        printPasswordRules();
        Scanner scanner = new Scanner(System.in);
        boolean valid;

        do {
            System.out.println("Enter your new password:");
            var proposedPassword = scanner.nextLine();
            valid = changePassword(proposedPassword);
        } while (!valid);
        System.out.println("The proposed password is valid");
        scanner.close();
    }

    public static void printPasswordRules() {
        System.out.println("Your new password must meet the following requirements:");
        System.out.println("* at least 8 characters long");
        System.out.println("* contains an uppercase letter");
        System.out.println("* contains a special character");
        System.out.println("* not contains the username");
        System.out.println("* not the same as the old password");
        System.out.println();
    }

    public static boolean changePassword(String newPassword) {
        boolean valid = true;
        String errorMessage = "";

        if (newPassword.length() < 8) {
            valid = false;
            errorMessage += "\nYour password must be least 8 characters.";
        }

        if (newPassword.equals(newPassword.toLowerCase())) {
            valid = false;
            errorMessage += "\nYour password must include an uppercase letter.";
        }

        if (newPassword.matches("[a-zA-Z0-9]*")) {
            valid = false;
            errorMessage += "\nYour password must include a special character (e.g. %,$[:).";
        }

        if (newPassword.toUpperCase().contains(currentUsername.toUpperCase())) {
            valid = false;
            errorMessage += "\nYour password cannot contain your username.";
        }

        if (newPassword.equals(currentPassword)) {
            valid = false;
            errorMessage += "\nYour password must be different from your current password.";
        }

        if (!valid) {
            System.out.println(errorMessage);
        }
        return valid;
    }
}
