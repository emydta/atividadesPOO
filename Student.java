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


    /*
    Métodos obrigatórios
• void atacar(): Exibe uma mensagem personalizada do ataque conforme a classe.
• void receberDano(int dano): Reduz a vida do personagem (mínimo 0).
• void usarHabilidadeEspecial(): Diferente para cada classe. Ex: Mago lança 
feitiço, Guerreiro usa golpe poderoso.
• void mostrarStatus(): Imprime todos os atributos atuais do personagem.
• void subirNivel(): Aumenta o nível e melhora os atributos (ex: +10 de vida, +1 de 
força, +10 de mana se aplicável).

    */ 
   