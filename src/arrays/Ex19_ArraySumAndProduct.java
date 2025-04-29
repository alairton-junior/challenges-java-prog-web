package arrays;

import java.util.Scanner;

public class Ex19_ArraySumAndProduct {
    // Create a Java program that fills an array with 5 integers, and then displays the sum, the product, and the numbers themselves.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0;
        int product = 1;

        System.out.println("====== Array - Sum, Product and Values ======");

        // Preencher o array
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Enter integer number %d: ", i + 1);
            numbers[i] = sc.nextInt();

            // Atualizar soma e produto
            sum += numbers[i];
            product *= numbers[i];
        }

        // Exibir os números
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Position %d: %d\n", i, numbers[i]);
        }

        // Exibir soma e produto
        System.out.printf("\nSum of the numbers: %d\n", sum);
        System.out.printf("Product of the numbers: %d\n", product);

        sc.close();
    }
}
