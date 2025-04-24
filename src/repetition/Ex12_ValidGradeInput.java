package repetition;

import java.util.Scanner;

//Create a Java program that asks for a grade from 0 to 10. If the input is invalid, display a message and keep asking until a valid grade is entered.

public class Ex12_ValidGradeInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.println("====== Valid Grade Input ======");

        do {
            System.out.println("Enter a grade: (0 to 10)");
            num = sc.nextInt();

            if(num > 10) {
                System.out.println("ATTENTION! The number entered is greater than 10. Try Again");
            }
            if(num < 0) {
                System.out.println("ATTENTION! The number entered is less than 0. Try Again");
            }
        } while(num < 0 || num > 10);

        System.out.println("Grade " + num + " is valid! Congratulations!");

        sc.close();
    }
}
