public class Sistemalivro{

    public static void main(String[] args){

        Livro livro = new Livro();
        livro.codigo = 1;
        livro.titulo = "codigo da vinci";
        livro.editora = "escritora xyz";
        livro.nrPaginas = 100;
        livro.edicao = 3;

        livro.Ler();
        livro.Cadastrar();
        livro.Localizar();

        //Livro biblioteca
        LivroBiblioteca livrobb = new LivroBiblioteca();
        livrobb.codigo = 11;
        livrobb.titulo = "gusebumps";
        livrobb.editora = "escritora abc";
        livrobb.nrPaginas = 876;
        livrobb.edicao = 4;
        livrobb.localPrateleira= "pratelrira azul";
        livrobb.categoria = "ANIMAL";
        livrobb.prazo = 10;
        livrobb.nomeQEmpr = "emy";

        livrobb.Ler();
        livrobb.Cadastrar();
        livrobb.Localizar();
        livrolv.Alugar();
        livrolv.Devolver();


        Livrolivraria livrolv = new Livrolivraria();
        livrolv.codigo = 15;
        livrolv.titulo = "a garota no trem";
        livrolv.editora = "paula Hawkins";
        livrolv.nrPaginas = 326;
        livrolv.edicao = 1;
        livrolv.localPrateleira= "pratelrira azul";
        livrolv.categoria = "ANIMAL";
        livrolv.preco = 80;
        livrolv.novoUsado = "novo";

        livrolv.Ler();
        livrolv.Cadastrar();
        livrolv.Localizar();
        livrolv.Vender();

    }
}