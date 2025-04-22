import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) throws Exception {

        System.out.println("======= Preço dos Produtos =======");
        Scanner scanner = new Scanner(System.in);
        Double a, b, c;

        System.out.print("Qual o preço do produto A? R$");
        a = scanner.nextDouble();

        System.out.print("Qual o preço do produto B? R$");
        b = scanner.nextDouble();

        System.out.print("Qual o preço do produto C? R$");
        c = scanner.nextDouble();

        if(a <= b && a <= c) {
            System.out.println("Você deve comprar o produto A");
        } else if (b <= a && b <= c) {
            System.out.println("Você deve comprar o produto B");
        } else {
            System.out.println("Você deve comprar o produto C");
        }

        scanner.close();
    }
}
