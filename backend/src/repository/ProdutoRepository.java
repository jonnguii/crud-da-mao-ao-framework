package repository;

import model.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoRepository {

    public List<Produto> produtos = new ArrayList<>();

    public void salvar(Produto produto) {
        produtos.add(produto);
    }

    public List<Produto> listarTodos() {
        return produtos;
    }

    public void buscarPorId(Integer id) {
        for (Produto produto : produtos) {
            if (produto.getId().equals(id)) {
                System.out.println(produto);
            }
        }
    }

    public boolean deletar(Integer id) {
        return produtos.remove(id);
    }


    //salvar(Produto produto)
    //listarTodos()
    //buscarPorId(Long id)
    //atualizar(Produto produto)
    //deletar(Long id)
}
