package arrays;

import java.util.Scanner;

public class Ex17_IntegerArrayInput {
    // Create a Java program that fills an array with 5 integers via keyboard input and displays them.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("====== Array Input and Display ======");

        // Preencher o array
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Enter number %d: ", i + 1);
            numbers[i] = sc.nextInt();
        }

        // Exibir o conteúdo do array
        System.out.println("You entered the following numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Position %d: %d\n", i, numbers[i]);
        }

        sc.close();
    }
}
