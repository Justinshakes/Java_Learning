import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            showMenu();
            int operation = getValidMenuInput(scanner);
            if (operation == 5) {
                break;
            }

            double result = 0;
            System.out.print("Enter the first number: ");
            double num1 = getValidDoubleInput(scanner);
            System.out.print("Enter the second number: ");
            double num2 = getValidDoubleInput(scanner);

            switch (operation) {
                case 1 -> result = addition(num1, num2);
                case 2 -> result = subtraction(num1, num2);
                case 3 -> {
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero!");
                        continue; // Skip to the next iteration of the loop
                    }
                    result = division(num1, num2);
                }
                case 4 -> result = multiplication(num1, num2);
                default -> {
                    System.out.println("Invalid operation. Please select a valid option.");
                    continue; // Skip to the next iteration of the loop
                }
            }
            System.out.println("Result = " + result);
        }
        scanner.close();
    }

    public static void showMenu() {
        System.out.println("Calculator Menu:");
        System.out.println("[1] Addition");
        System.out.println("[2] Subtraction");
        System.out.println("[3] Division");
        System.out.println("[4] Multiplication");
        System.out.println("[5] Quit");
        System.out.print("Enter the operation number: ");
    }

    public static double addition(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    public static double division(double num1, double num2) {
        return num1 / num2;
    }

    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    public static double getValidDoubleInput(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number: ");
            scanner.next(); // Consume the invalid input
        }
        return scanner.nextDouble();
    }

    public static int getValidMenuInput(Scanner scanner) {
        int input;
        while (true) {
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid number: ");
                scanner.next(); // Consume the invalid input
                continue;
            }
            input = scanner.nextInt();
            if (input < 1 || input > 5) {
                System.out.println("Invalid input. Please enter a number between 1 and 5: ");
                continue;
            }
            break; // Input is valid, exit the loop
        }
        return input;
    }

}
