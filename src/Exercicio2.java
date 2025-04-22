import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("Digite um número:");
        n = scanner.nextInt();

        System.out.printf("O número informado foi: \n %s", n);

        scanner.close();
    }
}
