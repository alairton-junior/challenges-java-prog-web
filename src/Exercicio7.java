import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) throws Exception {

        System.out.println("======= Média Aritmética das Notas =======");
        
        Scanner scanner = new Scanner(System.in);
        int counter;
        double sum = 0;

        System.out.println("Digite a quantidade de notas: ");
        counter = scanner.nextInt();

        for (int i = 1 ; i <= counter ; i++) {
            System.out.printf("Digite a %s° nota: \n", i);
            double nota = scanner.nextDouble();
            sum += nota;
        }

        double average = sum / counter;

        System.out.printf("A média das notas é %.2f \n", average);

        if (average >= 7) {
            System.out.println("Aluno APROVADO!");
        } else {
            System.out.println("Aluno REPROVADO!");
        }


       

        scanner.close();
    }
}
