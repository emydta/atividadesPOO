import java.util.Scanner;

public class CalculoMedia{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Student aluno = new Student();

        System.out.println("aluno(a): ");
        aluno.nome = scanner.nextLine();
        
        System.out.println("nota 1: ");
        aluno.grade1 = scanner.nextDouble();

        System.out.println("nota 2: ");
        aluno.grade2 = scanner.nextDouble();

        System.out.println("nota 3: ");
        aluno.grade3 = scanner.nextDouble();

        System.out.println("Nota final: "+aluno.finalGrade());

        if(aluno.finalGrade() >= 60 && aluno.finalGrade() <= 100){
            System.out.println("Pass");
        }else{
            System.out.println("Failed, missing points: "+aluno.missingPoints());
        }


        


    }
}