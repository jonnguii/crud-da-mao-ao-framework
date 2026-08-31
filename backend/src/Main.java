import model.Produto;
import repository.ProdutoRepository;
import service.ProdutoService;

public class Main {
    public static void main(String[] args) {

        ProdutoRepository produtoRepository = new ProdutoRepository();
        ProdutoService produtoService = new ProdutoService();


        Produto prod = produtoService.cadastrarProduto(1L, "teste", 10, 1);
        Produto prod2 = produtoService.cadastrarProduto(2L, "teste2", 20, 5);
        produtoService.buscarProduto(2L);
        produtoService.editarProduto(2L, "mudar", 15, 2);
        produtoService.listarProdutos();



    }
}