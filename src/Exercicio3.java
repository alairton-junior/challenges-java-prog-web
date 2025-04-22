import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        Double a, b, c;

        System.out.println("Digite a 1° nota:");
        a = scanner.nextDouble();

        System.out.println("Digite a 2° nota:");
        b = scanner.nextDouble();

        System.out.println("Digite a 3° nota:");
        c = scanner.nextDouble();

        Double media = (a+b+c)/3;

        System.out.printf("A média das notas é: \n %s", media);

        scanner.close();
    }
}
