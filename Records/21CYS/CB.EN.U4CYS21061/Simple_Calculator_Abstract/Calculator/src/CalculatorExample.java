import java.util.Scanner;
// Usage example
public class CalculatorExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select an operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Exiting the calculator...");
                break;
            }

            System.out.println("Enter two numbers:");

            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();
            double result = 0;

            switch (choice) {
                case 1:
                    Calculator additionCalculator = new AdditionCalculator();
                    result = additionCalculator.calculate(num1, num2);
                    break;
                case 2:
                    Calculator subtractionCalculator = new SubtractionCalculator();
                    result = subtractionCalculator.calculate(num1, num2);
                    break;
                case 3:
                    Calculator multiplicationCalculator = new MultiplicationCalculator();
                    result = multiplicationCalculator.calculate(num1, num2);
                    break;
                case 4:
                    Calculator divisionCalculator = new DivisionCalculator();
                    try {
                        result = divisionCalculator.calculate(num1, num2);
                    } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage());
                        continue;
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;
            }

            Calculator.displayResult(result);
        }

        scanner.close();
    }
}