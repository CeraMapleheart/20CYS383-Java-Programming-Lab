import java.util.Scanner;

// Usage example
public class CalculatorExample {
    public static void main(String[] args) {
        // Create an instance of the calculator
        Calculator calculator = new BasicCalculator();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result1 = calculator.add(num1, num2);
        System.out.println("Result of addition: " + result1);

        double result2 = calculator.subtract(num1, num2);
        System.out.println("Result of subtraction: " + result2);

        double result3 = calculator.multiply(num1, num2);
        System.out.println("Result of multiplication: " + result3);

        try {
            double result4 = calculator.divide(num1, num2);
            System.out.println("Result of division: " + result4);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
