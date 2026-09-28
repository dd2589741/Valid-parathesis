import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result;
        char operator;

        System.out.println("=== Simple Java Calculator ===");

        // Get the first number
        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();

        // Get the operator
        System.out.print("Enter an operator (+, -, *, /): ");
        operator = scanner.next().charAt(0);

        // Get the second number
        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();

        // Perform computation based on operator
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.printf("Result: %.2f + %.2f = %.2f%n", num1, num2, result);
                break;

            case '-':
                result = num1 - num2;
                System.out.printf("Result: %.2f - %.2f = %.2f%n", num1, num2, result);
                break;

            case '*':
                result = num1 * num2;
                System.out.printf("Result: %.2f * %.2f = %.2f%n", num1, num2, result);
                break;

            case '/':
                // Handle division by zero error
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    result = num1 / num2;
                    System.out.printf("Result: %.2f / %.2f = %.2f%n", num1, num2, result);
                }
                break;

            default:
                System.out.println("Error: Invalid operator entered.");
                break;
        }

        scanner.close();
    }
}

