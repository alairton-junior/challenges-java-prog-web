package decision;

import java.util.Scanner;

/*9. Create a Java program that receives three numbers via keyboard input and displays the largest one.*/
public class Ex09_LargestOfThreeNumbers {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        double n1, n2, n3;

        System.out.println("Enter the first number: ");
        n1 = scanner.nextDouble();

        System.out.println("Enter the second number: ");
        n2 = scanner.nextDouble();

        System.out.println("Enter the three number: ");
        n3 = scanner.nextDouble();

        if (n1 > n2 && n1 > n3) {
            System.out.printf("The largest number is %.2f", n1);
        } else if (n2 > n1 && n2 > n3) {
            System.out.printf("The largest number is %.2f", n2);
        } else {
            System.out.printf("The largest number is %.2f", n3);
        }

        scanner.close();
    }
}
