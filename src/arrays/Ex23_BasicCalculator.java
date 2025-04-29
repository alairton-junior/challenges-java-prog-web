package arrays;

import java.util.Scanner;

public class Ex23_BasicCalculator {
    // Basic Calculator: Create a Java program that receives two numbers and an operation 
    // (addition, subtraction, multiplication, division) and displays the result.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, result = 0;
        char operation;

        System.out.println("====== Basic Calculator ======");

        // Entrada dos números
        System.out.print("Enter the first number: ");
        num1 = sc.nextDouble();

        System.out.print("Enter the second number: ");
        num2 = sc.nextDouble();

        // Entrada da operação
        System.out.print("Enter the operation (+, -, *, /): ");
        operation = sc.next().charAt(0);

        boolean validOperation = true;

        // Verificação e cálculo
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    validOperation = false;
                } else {
                    result = num1 / num2;
                }
                break;
            default:
                System.out.println("Invalid operation. Please use +, -, * or /.");
                validOperation = false;
        }

        // Exibir o resultado se operação foi válida
        if (validOperation) {
            System.out.printf("Result: %.2f %c %.2f = %.2f\n", num1, operation, num2, result);
        }

        sc.close();
    }
}
