import service.ProdutoService;
import view.ProdutoMenu;

public class Main {
    public static void main(String[] args) {

        ProdutoService prodService = new ProdutoService();
        ProdutoMenu prodView = new ProdutoMenu(prodService);

        prodView.produtoMenu();


    }
}