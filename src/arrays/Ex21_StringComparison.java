package arrays;

import java.util.Scanner;

public class Ex21_StringComparison {
    // Create a Java program that receives 2 Strings via keyboard input and displays their content and length.
    // Also, check and display if the strings are equal in length and/or content.
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str1, str2;

            System.out.println("====== String Comparison ======");

            // Entrada das strings
            System.out.print("Enter the first string: ");
            str1 = sc.nextLine();

            System.out.print("Enter the second string: ");
            str2 = sc.nextLine();

            // Exibir conteúdo e comprimento
            System.out.printf("\nFirst string: \"%s\" (Length: %d)\n", str1, str1.length());
            System.out.printf("Second string: \"%s\" (Length: %d)\n", str2, str2.length());

            // Verificar se possuem mesmo comprimento
            if (str1.length() == str2.length()) {
                System.out.println("\nThe strings have the same length.");
            } else {
                System.out.println("\nThe strings have different lengths.");
            }

            // Verificar se o conteúdo é igual
            if (str1.equals(str2)) {
                System.out.println("The strings have the same content.");
            } else {
                System.out.println("The strings have different content.");
            }

            sc.close();
        }
}
