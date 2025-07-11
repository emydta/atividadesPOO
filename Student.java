public class Student{

    String nome;
    double grade1;
    double grade2;
    double grade3;

    double finalGrade(){
        return grade1 + grade2 + grade3;
    }

    double missingPoints(){
        return finalGrade() - 100;
    }
}