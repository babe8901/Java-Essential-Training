package decision_structures;

import java.util.Scanner;

public class AddingTwoNumbers {
    public static void main(String[] args) {
        float firstNumber, secondNumber, result;
        char operation;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        firstNumber = scanner.nextFloat();
        System.out.println("Enter the second number:");
        secondNumber = scanner.nextFloat();
        System.out.println("Enter the operation[+,-,*,/,%]:");
        operation = scanner.next().charAt(0);
        scanner.close();

        result = switch(operation) {
            case '+' -> {
                System.out.println("Adding...");
                yield firstNumber + secondNumber;
            }
            case '-' -> {
                System.out.println("Adding...");
                yield firstNumber - secondNumber;
            }
            case '*' -> {
                System.out.println("Adding...");
                yield firstNumber * secondNumber;
            }
            case '/' -> {
                System.out.println("Adding...");
                yield firstNumber / secondNumber;
            }
            case '%' -> {
                System.out.println("Adding...");
                yield firstNumber % secondNumber;
            }
            default -> {
                System.out.println("Invalid Operation");
                yield 0;
            }
        };
        System.out.println("The result is " + result);
    }
}
