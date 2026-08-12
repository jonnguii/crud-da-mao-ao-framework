import model.Produto;
import repository.ProdutoRepository;

public class Main {
    public static void main(String[] args) {

        ProdutoRepository produtoRepository = new ProdutoRepository();
        Produto produto1 = new Produto(1, "teste", 10, 1);

        produtoRepository.salvar(produto1);
        System.out.println(produtoRepository.produtos.size());
        produtoRepository.buscarPorId(1);
        produtoRepository.deletar(1);
        produtoRepository.buscarPorId(1);
        System.out.println(produtoRepository.produtos.size());

//        System.out.println(produtoRepository.listarTodos());

    }
}