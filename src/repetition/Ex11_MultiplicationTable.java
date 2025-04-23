package repetition;

/*11. Create a Java program that displays the multiplication table of an integer from 0 to 10.
Use a `for` loop and allow only valid numbers (0 to 10).*/

import java.util.Scanner;

public class Ex11_MultiplicationTable {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("====== Multiplication Table ======");

        do {
            System.out.println("Enter a number: (0 to 10)");
            num = scanner.nextInt();

            if(num > 10) {
                System.out.println("ATTENTION! The number entered is greater than 10. Try Again");
            }
            if(num < 0) {
                System.out.println("ATTENTION! The number entered is less than 0. Try Again");
            }
        } while(num < 0 || num > 10);

        System.out.println("====== Table Multiplication of " + num + " ======");

        for (int i = 0; i <= 10; i++) {
            System.out.printf("%s x %s = %s \n", num, i, num*i);
        }

        scanner.close();
    }
}
