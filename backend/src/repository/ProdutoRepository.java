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
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }

    public Produto buscarPorId(Long id) {
        for(Produto produto : produtos) {
            if(produto.getId().equals(id)) {
                return produto;
            }
        }
        return null;

    }



    public Produto atualizar(Long id, String nome, double preco, Integer estoque) {
        for (Produto produto : produtos) {
            if (id.equals(produto.getId())) {
                if (produto.getNome() != null) {
                    produto.setNome(nome);
                }
                if (produto.getPreco() >= 0) {
                    produto.setPreco(preco);
                }
                if (produto.getEstoqueQuantidade() != null) {
                    produto.setEstoqueQuantidade(estoque);
                }
                return produto;
            }
        }
        return null;
    }

    public Produto deletar(Long id) {
        for(Produto produto : produtos) {
            if(id.equals(produto.getId())) {
                produtos.remove(produto);
                return produto;
            }
        }
        return null;
    }
}
