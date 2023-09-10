package exceptions;

public class ThrowingExceptions {
    public static double calculatePay(double hours, double payRate) throws NegativeInputException {
        if (hours > 40) {
            throw new IllegalArgumentException("Hours must be less than or equal to 40");
        }
        if (hours < 0 || payRate < 0) {
            throw new NegativeInputException();
        }
        return hours * payRate;
    }

    public static void main(String[] args) {
        try {
            System.out.println(calculatePay(-1, 0));
            System.out.println(calculatePay(41, 21));
        } catch (NegativeInputException | IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
