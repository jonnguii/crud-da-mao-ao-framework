package view;

import service.ProdutoService;

import java.util.Scanner;

public class ProdutoMenu {
    final Scanner scn = new Scanner(System.in);
    private final ProdutoService prodServ;

    public ProdutoMenu(ProdutoService prodServ) {
        this.prodServ = prodServ;
    }

    public void produtoMenu() {
        int opcao = 0;

        do {
            opcao = options();
            switch (opcao) {
                case (1): cadastrarProdutoAux();
                    break;
                case (2): editarProdutoAux();
                    break;
                case (3): listarProdutoAux();
                    break;
                case (4): buscarProdutoAux();
                    break;
                case (5): excluirProdutoAux();
                    break;
                case (0): System.out.println("Finalizando o programa. Até mais...");
                    break;
                default:
                    System.out.println("Insira uma opção válida!");
            }
        } while (opcao != 0);
        scn.close();
    }

    public int options() {
        System.out.println("================================");
        System.out.println("BEM-VINDO AO SISTEMA DE PRODUTOS");
        System.out.println("================================");
        System.out.println("ESCOLHA UMA OPÇÃO DO MENU ");
        System.out.println("--------------------------------");
        System.out.println("(1) - CADASTRAR PRODUTO");
        System.out.println("(2) - EDITAR PRODUTO");
        System.out.println("(3) - LISTAR PRODUTOS");
        System.out.println("(4) - PESQUISAR PRODUTO");
        System.out.println("(5) - EXCLUIR PRODUTO");
        System.out.println("(0) - SAIR DO MENU");
        System.out.println("--------------------------------");
        System.out.print("INFORME SUA OPÇÃO: ");


        return scn.nextInt();
    }

    public void cadastrarProdutoAux() {
        System.out.println("==== Cadastro de Produto ====");
        System.out.print("Id: ");
        Long id = scn.nextLong();

        System.out.print("Nome: ");
        String nome = scn.next();

        System.out.print("Preco: ");
        double preco = scn.nextDouble();

        System.out.print("Quantidade: ");
        Integer quantidade = scn.nextInt();

        try {
            prodServ.cadastrarProduto(id, nome, preco, quantidade);
            System.out.println("Produto cadastrado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar produto: " + e.getMessage());
        }

    }

    public void editarProdutoAux() {
        System.out.println("==== Edição de Produto ====");
        System.out.print("Id do produto a ser editado: ");
        Long id = scn.nextLong();

        System.out.print("Novo Nome: ");
        String nome = scn.next();

        System.out.print("Novo Preço: ");
        double preco = scn.nextDouble();

        System.out.print("Nova Quantidade: ");
        Integer quantidade = scn.nextInt();

        try {
            prodServ.editarProduto(id, nome, preco, quantidade);
            System.out.println("Produto editado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao editar produto: " + e.getMessage());
        }
    }

    public void listarProdutoAux() {
        System.out.println("==== Lista de Produtos ====");
        prodServ.listarProdutos();
    }

    public void buscarProdutoAux() {
        System.out.println("==== Pesquisa de Produto ====");
        System.out.print("Informe o Id do produto: ");
        Long id = scn.nextLong();

        try {
            prodServ.buscarProduto(id);
        } catch (Exception e) {
            System.out.println("Erro ao buscar produto: " + e.getMessage());
        }
    }

    public void excluirProdutoAux() {
        System.out.println("==== Exclusão de Produto ====");
        System.out.print("Informe o Id do produto a ser excluído: ");
        Long id = scn.nextLong();

        try {
            prodServ.excluirProduto(id);
            System.out.println("Produto excluído com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao excluir produto: " + e.getMessage());
        }
    }
}