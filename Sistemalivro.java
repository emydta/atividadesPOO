

public class Sistemalivro{

    public static void main(String[] args){

        Livro livro = new Livro();
        livro.setCodigo(1);
        livro.setTitulo("codigo da vinci");
        livro.setEditora("escritora xyz");
        livro.setNrPaginas(100);
        livro.setEdicao(3);
/*
        livro.Ler();
        livro.Cadastrar();
        livro.Localizar();*/

        //Livro biblioteca
        LivroBiblioteca livrobb = new LivroBiblioteca();
        livrobb.setCodigo(161108);
        livrobb.setTitulo("Morro dos Ventos uivantes");
        livrobb.setEditora("Emilly bronthé");
        livrobb.setNrPaginas(273);
        livrobb.setEdicao(1);
        livrobb.setLocalPrateleira("B24");
        livrobb.setCategoria("Romance e Suspense");
        livrobb.setPrazo(15);
        livrobb.setNomeQEmpr("Emilyn");

  /*      livrobb.Ler();
        livrobb.Cadastrar();
        livrobb.Localizar();
        livrobb.Alugar();
        livrobb.Devolver();
*/

        Livrolivraria livrolv = new Livrolivraria();
        livrolv.setCodigo(060625);
        livrolv.setTitulo("a garota no trem");
        livrolv.setEditora("paula Hawkins");
        livrolv.setNrPaginas(326);
        livrolv.setEdicao(1);
        livrolv.setLocalPrateleira("pratelrira AV3");
        livrolv.setCategoria("Mistério");
        livrolv.setPreco(80);
        livrolv.setNovoUsado("novo");

        /*livrolv.Ler();
        livrolv.Cadastrar();
        livrolv.Localizar();
        livrolv.Vender();*/

        String mensagem1 = "\nTítulo: "+livro.getTitulo()+
                           "\nCódigo: "+livro.getCodigo()+
                           "\nEditora: "+livro.getEditora()+
                           "\nNúmero de páginas: "+livro.getNrPaginas()+
                           "\nEdição: "+livro.getEdicao();
        System.out.println("~~~~~~~~Livro~~~~~~~~ "+mensagem1);
                           
        String mensagem2 = "\nTítulo: "+livrobb.getTitulo()+
                           "\nCódigo: "+livrobb.getCodigo()+
                           "\nEditora: "+livrobb.getEditora()+
                           "\nNúmero de páginas: "+livrobb.getNrPaginas()+
                           "\nEdição: "+livrobb.getEdicao()+
                            "\nPrateleira: "+livrobb.getLocalPrateleira()+
                            "\nCategoria: "+livrobb.getCategoria()+
                            "\nPrazo de entrega: "+livrobb.getPrazo()+
                            "\nNome quem emprestou: "+livrobb.getNomeQEmpr();
        System.out.println("~~~~~~~~~~Livro Biblioteca:~~~~~~~~~~ "+mensagem2);

         String mensagem3 = "\nTítulo: "+livrolv.getTitulo()+
                           "\nCódigo: "+livrolv.getCodigo()+
                           "\nEditora: "+livrolv.getEditora()+
                           "\nNúmero de páginas: "+livrolv.getNrPaginas()+
                           "\nEdição: "+livrolv.getEdicao()+
                            "\nPrateleira: "+livrolv.getLocalPrateleira()+
                            "\nCategoria: "+livrolv.getCategoria()+
                            "\nPreço: "+livrolv.getPreco()+
                            "\nNovo ou usado:"+livrolv.getNovoUsado();
        System.out.println("~~~~~~~~~~~~Livro Livraria:~~~~~~~~~~~~~~~~ "+mensagem3);


        /*System.out.println("codigo do livro livraria: "+livrolv.getCodigo());
        System.out.println("codigo do biblioteca: "+livrobb.getCodigo());
        System.out.println("codigo do livro: "+livro.getCodigo());*/
       


    }
}