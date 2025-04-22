import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        Double m;

        System.out.println("Digite um valor em metros (m):");
        m = scanner.nextDouble();

        Double cm = m * 10;

        System.out.printf("Conversão: %.2f (m) em centímetros é %.2f (cm)", m, cm);

        scanner.close();
    }
}
