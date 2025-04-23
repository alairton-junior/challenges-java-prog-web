package decision;

import java.util.Scanner;

/*10. Create a Java program that receives an integer via keyboard input and displays whether it is even or odd.*/
public class Ex10_EvenOrOdd {
    public static void main(String[] args) throws Exception {
        int num;

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Is the Number Even or Odd?  =====");
        System.out.println("Enter the number: ");
        num = scanner.nextInt();

        System.out.println("===== Result  =====");
        if(num % 2 != 0) {
            System.out.printf("The number %s is odd.", num);
        } else {
            System.out.printf("The number %s is even.", num);
        }

        scanner.close();
    }
}
