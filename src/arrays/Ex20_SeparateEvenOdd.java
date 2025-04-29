package arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Ex20_SeparateEvenOdd {
    // Create a Java program that receives 20 integers via keyboard input and stores them in an array.
    // Store the even numbers in a "even" array and the odd numbers in an "odd" array. Display all three arrays.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] allNumbers = new int[20];
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        System.out.println("====== Separate Even and Odd Numbers ======");

        // Ler 20 números e separar pares/ímpares
        for (int i = 0; i < allNumbers.length; i++) {
            System.out.printf("Enter integer number %d: ", i + 1);
            allNumbers[i] = sc.nextInt();

            if (allNumbers[i] % 2 == 0) {
                evenNumbers.add(allNumbers[i]);
            } else {
                oddNumbers.add(allNumbers[i]);
            }
        }

        // Exibir todos os arrays
        System.out.println("\nAll numbers entered:");
        for (int i = 0; i < allNumbers.length; i++) {
            System.out.printf("%d ", allNumbers[i]);
        }

        System.out.println("\n\nEven numbers:");
        for (int num : evenNumbers) {
            System.out.printf("%d ", num);
        }

        System.out.println("\n\nOdd numbers:");
        for (int num : oddNumbers) {
            System.out.printf("%d ", num);
        }

        System.out.println(); // quebra de linha final
        sc.close();
    }
    
}
