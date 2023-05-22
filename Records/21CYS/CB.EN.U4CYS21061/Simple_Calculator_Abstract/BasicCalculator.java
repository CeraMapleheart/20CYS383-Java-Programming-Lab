class AdditionCalculator extends Calculator {
    @Override
    double calculate(double num1, double num2) {
        return num1 + num2;
    }
}

class SubtractionCalculator extends Calculator {
    @Override
    double calculate(double num1, double num2) {
        return num1 - num2;
    }
}

class MultiplicationCalculator extends Calculator {
    @Override
    double calculate(double num1, double num2) {
        return num1 * num2;
    }
}

class DivisionCalculator extends Calculator {
    @Override
    double calculate(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return num1 / num2;
    }
}
