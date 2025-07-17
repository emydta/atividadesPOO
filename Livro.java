public class Livro{

    private int codigo; 
    private String titulo;
    private String autor;
    private String editora;//
    private int nrPaginas;
    private int edicao;

    public int getEdicao(){
        return edicao;
    }

    public void setEdicao(int edicao){
        this.edicao = edicao;
    }
   
    public int getNrPaginas(){
        return nrPaginas;
    }

    public void setNrPaginas(int nrPaginas){
        this.nrPaginas = nrPaginas;
    }

    
    public void setEditora(String editora){
        this.editora = editora;
    }
    
    public String getEditora(){
        return editora;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    public String getAutor(){
        return autor;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public int getCodigo(){
        return codigo;
    }

    public void setCodigo(int valor){
        codigo = valor;
    }

    public void Ler() {
        System.out.println("estou lendo...");
    }

    public void Cadastrar(){
        System.out.println("estou cadastrando");  
    }  

    public void Localizar(){
        System.out.println("estou localizando");
    }
}