package arrays;

import java.util.Scanner;

// Create a Java program that fills an array with 10 real numbers via keyboard input and displays them in reverse order.
public class Ex18_ReverseRealArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.println("====== Real Number Array - Reverse Display ======");

        // Preencher o array com números reais
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Enter real number %d: ", i + 1);
            numbers[i] = sc.nextDouble();
        }

        // Exibir os números em ordem inversa
        System.out.println("\nNumbers in reverse order:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.printf("Position %d: %.2f\n", i, numbers[i]);
        }

        sc.close();
    }
    
}
