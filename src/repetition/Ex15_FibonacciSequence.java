package repetition;

import java.util.Scanner;

public class Ex15_FibonacciSequence {
    public static void main(String[] args) {
        System.out.println("====== Fibonacci Sequence ======");
        int first = 0;
        int second = 1;

        // Exibe os 10 primeiros termos
        for (int i = 0; i < 10; i++) {
            System.out.print(first);

            if (i < 9) {
                System.out.print(" - ");
            }

            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println();
    }
}
