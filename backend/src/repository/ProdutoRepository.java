package repository;

import model.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoRepository {

    public List<Produto> produtos = new ArrayList<>();

    public void salvar(Produto produto) {
        produtos.add(produto);
    }

    public List <Produto> listarTodos() {
        return produtos;
    }

    public List<Produto> buscarPorId(Integer id) {
        return null;
    }


    //salvar(Produto produto)
    //listarTodos()
    //buscarPorId(Long id)
    //atualizar(Produto produto)
    //deletar(Long id)
}
