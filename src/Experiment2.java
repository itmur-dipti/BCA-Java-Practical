import java.util.Scanner;

public class Experiment2 {

    public static void main(String[] args) {

        // Basic arithmetic operations
        int a = 20;
        int b = 4;

        System.out.println("\nArithmetic Operations:");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));

        // All operations in one line
        System.out.println("\nArithmetic Operations in One Line:");
        System.out.println(
                "Addition: " + (a + b)
                        + " | Subtraction: " + (a - b)
                        + " | Multiplication: " + (a * b)
                        + " | Division: " + (a / b)
        );

        // Taking input
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter 1st number: ");
        int firstDigit = sc.nextInt();

        System.out.print("Enter 2nd number: ");
        int secondDigit = sc.nextInt();

        // Displaying output
        System.out.println("\nArithmetic Operations:");

        System.out.println("Addition: " + (firstDigit + secondDigit));
        System.out.println("Subtraction: " + (firstDigit - secondDigit));
        System.out.println("Multiplication: " + (firstDigit * secondDigit));

        // Division by zero check
        if (secondDigit != 0) {
            System.out.println("Division: " + (firstDigit / secondDigit));
        } else {
            System.out.println("Division: Cannot divide by zero");
        }

        sc.close();
    }
}