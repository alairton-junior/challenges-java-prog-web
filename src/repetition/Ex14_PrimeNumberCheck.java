package repetition;

import java.util.Scanner;

//Create a Java program that receives 10 integers greater than 1 and checks if each number is prime.
// Display a message indicating whether each number is prime or not./**/
public class Ex14_PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[10];
        int counter = 0;
        System.out.println("------prime number check-------");

        while (counter <= arr.length - 1) {
            System.out.println("Number " + (counter + 1) + " : ");
            arr[counter] = sc.nextInt();
            boolean ehPrimo = true;

            if (arr[counter] <= 1) {
                ehPrimo = false;
            } else {
                for (int j = 2; j <= Math.sqrt(arr[counter]); j++) {
                    if (arr[counter] % j == 0) {
                        ehPrimo = false;
                        break;
                    }
                }

                if (ehPrimo) {
                    System.out.println(arr[counter] + " é um número primo.");
                } else {
                    System.out.println(arr[counter] + " não é um número primo.");
                }
            }

            counter++;
        }
    }
}
