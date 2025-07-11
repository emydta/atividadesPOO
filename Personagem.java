public class Personagem {

    String nome;
    String classe = "guerreiro";
    int nivel = 1;
    int vida;
    int magia;
    //varia de acordo com a classe
    int forca;

    public void atacar (){
        switch(classe){
            case 'guerreiro':
                System.out.println("ataque, guerreiro!");
                break;
            case 'arqueiro':
                System.out.println("atque, arqueiro!");
                break; 
                
        }
    }   
    
}