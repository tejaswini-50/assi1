public class DivisionCalculator {
    public static void main(String[] args) {
        int numerator = 50;
        int denominator = 0; 
        try {
            double result = divideNumbers(numerator, denominator);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }
    }

    public static double divideNumbers(int numerator, int denominator) throws ArithmeticException {
        if (denominator == 0) {
            throw new ArithmeticException("Denominator cannot be zero.");
        }
        return (double) numerator / denominator;
    }
}
