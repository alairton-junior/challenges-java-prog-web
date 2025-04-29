package arrays;

import java.util.Scanner;

public class Ex22_ReverseNumber {
    // Number Reversal: Create a Java program that shows the reverse of an integer entered via keyboard.
    // Example: 127 -> 721
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, reversed = 0;

        System.out.println("====== Number Reversal ======");
        System.out.print("Enter an integer number: ");
        number = sc.nextInt();

        int original = number; // armazenar original para exibir depois

        // Inverter o número
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        System.out.printf("The reverse of %d is: %d\n", original, reversed);

        sc.close();
    }
}
