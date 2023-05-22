import java.util.Scanner;
// Define the calculator abstract class
abstract class Calculator {
    abstract double calculate(double num1, double num2);

    static void displayResult(double result) {
        System.out.println("Result: " + result);
        System.out.println();
    }
}



