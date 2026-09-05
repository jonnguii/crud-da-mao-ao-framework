package service;

import exceptions.NomeVazioException;
import exceptions.PrecoNegativoException;
import exceptions.ProdutoNaoEncontradoException;
import exceptions.QuantidadeInvalidaException;
import model.Produto;
import repository.ProdutoRepository;

public class ProdutoService {
    ProdutoRepository prodRepository = new ProdutoRepository();

    public void cadastrarProduto(Long id, String nome, double preco, Integer quantidade) {
       if(prodRepository.buscarPorId(id) != null) {
           throw new ProdutoNaoEncontradoException("Esse produto já foi cadastrado");
       }
        if (nome.isEmpty()) {
            throw new NomeVazioException("Informe um nome para o produto");
        }
        if (preco < 0) {
            throw new PrecoNegativoException("Preço do produto '" + nome + "' não pode ser negativo!");
        }
        if (quantidade <= 0) {
            throw new QuantidadeInvalidaException("A quantidade do produto '" + nome + "' é inválida");
        }
        Produto produto = new Produto(id, nome, preco, quantidade);
        prodRepository.salvar(produto);
    }

    public void listarProdutos() {
        if (prodRepository.produtos.isEmpty()) {
            System.out.println("Não há registro de produtos no sistema");
        }
        prodRepository.listarTodos();
    }

    public void buscarProduto(Long id) {
        if (prodRepository.buscarPorId(id) == null) {
            throw new ProdutoNaoEncontradoException("Produto com id '" + id + "' não encontrado");
        }
        System.out.println(prodRepository.buscarPorId(id));
    }


    public void editarProduto(Long id, String nome, double preco, Integer quantidade) {
        if(preco < 0) {
            throw new PrecoNegativoException("Preço do produto '" + nome + "' não pode ser negativo!");
        }
        if (prodRepository.atualizar(id, nome, preco, quantidade) == null) {
            throw new ProdutoNaoEncontradoException("Produto com id '" + id + "' não encontrado");
        }
        prodRepository.atualizar(id, nome, preco, quantidade);
    }


    public void excluirProduto(Long id) {
        if (prodRepository.deletar(id) == null) {
            throw new ProdutoNaoEncontradoException("Produto com id '" + id + "' não encontrado");
        }
        prodRepository.deletar(id);

    }

}
