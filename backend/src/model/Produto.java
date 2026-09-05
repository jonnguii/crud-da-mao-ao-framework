package model;

public class Produto {
    Long id;
    String nome;
    double preco;
    Integer estoqueQuantidade;

    public Produto(Long id, String nome, double preco, Integer estoqueQuantidade) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.estoqueQuantidade = estoqueQuantidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Integer getEstoqueQuantidade() {
        return estoqueQuantidade;
    }

    public void setEstoqueQuantidade(Integer estoqueQuantidade) {
        this.estoqueQuantidade = estoqueQuantidade;
    }


    @Override
    public String toString() {
        return "Id: " + id + "\n" +
                "Nome: " + nome + "\n" +
                "Preço: " + preco + "\n" +
                "Estoque: " + estoqueQuantidade;



    }
}
