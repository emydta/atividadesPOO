public class LivroBiblioteca extends Livro{

    private String localPrateleira;
    private String categoria;
    private int prazo;
    private String nomeQEmpr;

    public String getNomeQEmpr(){
        return nomeQEmpr;
    }

    public void setNomeQEmpr(String nome){
        this.nomeQEmpr = nomeQEmpr;
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
    
    public int getPrazo(){
        return prazo;
    }

    public void setPrazo(int prazo){
        this.prazo = prazo;
    }
    
    public void Alugar(){
        System.out.println("estou alugando... ");
    }
    public void Devolver(){
        System.out.println("estou devolvendo...");
    }
}