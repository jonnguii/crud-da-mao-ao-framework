package repository;

import model.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoRepository {

    public List<Produto> produtos = new ArrayList<>();

    public void salvar(Produto produto) {
        produtos.add(produto);
    }

    public void listarTodos() {
        for(Produto produto : produtos) {
            System.out.println(produto);
        }
    }

    public void buscarPorId(Integer id) {
        for (Produto produto : produtos) {
            if (produto.getId().equals(id)) {
                System.out.println(produto);
            }
        }
        System.out.println("Não há produtos na lista");
    }

    public void atualizar(String nome, double preco, Integer estoque) {
        for (Produto produto : produtos) {
            if (produto.getNome() != null) {
                produto.setNome(nome);
            }
            if (produto.getPreco() >= 0) {
                produto.setPreco(preco);
            }
            if (produto.getEstoque() != null) {
                produto.setEstoque(estoque);
            }

        }
    }

    public void deletar(Integer id) {
        for (Produto produto : produtos) {
            if (produto != null) {
                produtos.remove(id);
            }
        }

    }
}
