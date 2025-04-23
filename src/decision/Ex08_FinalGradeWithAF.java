package decision;

import java.util.Scanner;

/* - Approved if **FA ≥ 7**
        - If **FA ≥ 4 and < 7**, the student takes an extra exam (AF).
        - Approved if **AF ≥ 4** and **(FA + AF) / 2 ≥ 5**
        - Otherwise, failed.
    - If AF is needed, ask for the grade and show the final result with or without AF.*/

public class Ex08_FinalGradeWithAF {
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
        }

        if (average >= 4) {
            double af;

            System.out.println("Aluno está de AF! \n");

            System.out.println("Digite a nota da AF do aluno: ");
            af = scanner.nextDouble();

            if(af >= 4 && (average+af)/2 >=5) {
                System.out.println("Aluno APROVADO! ");
            } else {
                System.out.println("Aluno REPROVADO!");
            }
        } else {
            System.out.println("Aluno REPROVADO!");
        }

        scanner.close();
    }
}
