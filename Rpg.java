import java.util.Scanner;

public class Rpg{

    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    Personagem personagem = new Personagem();

    System.out.print("Herói criado: ");
    personagem.nome = scanner.nextLine();
    System.out.print("classe: ");
    personagem.classe = scanner.nextLine();

    personagem.atacar();



    


    }
}