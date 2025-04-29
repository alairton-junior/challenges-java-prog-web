package repetition;

import java.util.Scanner;

// Create a Java program that reads a positive integer and calculates its factorial. Display the result.

public class Ex16_FactorialCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.println("====== Factorial Calculator ======");

        do {
            System.out.print("Enter a positive integer: ");
            number = sc.nextInt();

            if (number < 0) {
                System.out.println("ATTENTION! The number must be positive. Try again.");
            }

        } while (number < 0);

        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.printf("The factorial of %d is: %d\n", number, factorial);

        sc.close();
    }
}
