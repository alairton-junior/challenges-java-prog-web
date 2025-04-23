package sequential;

import java.util.Scanner;

public class Ex05_CircleArea {
    public static void main(String[] args) throws Exception {

        System.out.println("======= Área do Círculo =======");
        Scanner scanner = new Scanner(System.in);
        Double r;

        System.out.println("Qual o raio do círculo (cm)?");
        r = scanner.nextDouble();

        Double area = Math.PI * (2 * r);

        System.out.printf("A área do círculo é igual a: %.2fcm", area);

        scanner.close();
    }
}
