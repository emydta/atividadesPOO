public class Livrolivraria  extends Livro{

    String localPrateleira;
    String categoria;
    int preco;
    String novoUsado;

    public String getNovoUsado(){
        return novoUsado;
    }

    public void setNovoUsado(String nvUsado){
        novoUsado = nvUsado;
    }
    
    public String getLocalPrateleira(){
        return localPrateleira;
    }

    public void setLocalPrateleira(String lPrateleira){
        localPrateleira = lPrateleira;
    }
    
    public String getCategoria(){
        return categoria;
    }

    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    
    public int getPreco(){
        return preco;
    }

    public void setPreco(int preco){
        this.preco = preco;
    }

    public void Vender(){
        System.out.println("Estou vendendo...");
    }
}