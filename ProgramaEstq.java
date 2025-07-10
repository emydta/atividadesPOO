import java.util.Scanner;

public class ProgramaEstq {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Produto produto1 = new Produto(); 
        System.out.println("Entre  com os dados do produto:");
        System.out.println("Nome: ");
        produto1.nome = scanner.nextLine();
        System.out.println("Preço: ");
        produto1.preco = scanner.nextDouble();
        System.out.println("Quantidade em estoque: ");
        produto1.quantidade = scanner.nextInt();

        System.out.println(produto1.mensagem());

        System.out.println("Entre com o numero de produtos pra adicionar no estoque: ");
        int estoque = scanner.nextInt();
        produto1.AddProduct(estoque);

        System.out.println(produto1.mensagem());

        System.out.println("Entre com o numero de produtos pra remover do estoque: ");
        estoque = scanner.nextInt();
        produto1.RemoveProduct(estoque);

        System.out.println(produto1.mensagem());


    }
}