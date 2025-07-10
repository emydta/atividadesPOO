public class Produto{

    public String nome;
    public double preco;
    public int quantidade;


    public String mensagem(){

        String mensagem = "produto: "+nome+", R$"+preco+" , "+quantidade+" unidades, Total: "+(preco*quantidade);
        return mensagem;
    }

    public double TotalEstq(){
        return preco * quantidade;
    }

    public void AddProduct(int qtde){
        quantidade += qtde;
    }

    public void RemoveProduct(int qtde){
        quantidade -= qtde;
    }
}