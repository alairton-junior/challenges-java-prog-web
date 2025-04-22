import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) throws Exception {

        System.out.println("======= Média Aritmética das Notas =======");
        
        Scanner scanner = new Scanner(System.in);
        double n1, n2;

        System.out.println("Digite a 1° nota: ");
        n1 = scanner.nextDouble();

        System.out.println("Digite a 2° nota: ");
        n2 = scanner.nextDouble();

        double average = (n1+n2)/2;

        System.out.printf("A média das notas é %.2f", average);
       
        if (average >= 7) {
            System.out.println("Aluno APROVADO!");
        } else if  {
            System.out.println("Aluno REPROVADO!");
        }


       

        scanner.close();
    }
}
