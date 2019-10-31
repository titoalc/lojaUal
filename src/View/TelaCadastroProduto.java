package View;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TelaCadastroProduto { public VBox getTelaCadastrarProduto(Stage stage) {
    VBox raiz = new VBox(10);

    MenuBarView menuBarView = new MenuBarView();
    Label nomeProduto = new Label("Nome");
    TextField nome = new TextField();

    Label marcaProduto = new Label("Marca");
    TextField marca = new TextField();

    Label precoDeVenda = new Label("Preço de venda");
    TextField precoVenda = new TextField();

    Label precoDeCusto = new Label("Preço de custo");
    TextField precoCusto = new TextField();

    Label fornecedorProduto = new Label("Fornecedor do produto");
    TextField fornecedor = new TextField();

    Label quantidadeDeProduto = new Label("Quantidade de produto");
    TextField quantidadeProduto = new TextField();

    Label categoriaProduto = new Label("Categoria do produto");
    TextField categoria = new TextField();

    Label codigoProduto = new Label("Código do produto");
    TextField codigo = new TextField();

    raiz.getChildren().addAll(nomeProduto, nome, marcaProduto, marca, precoDeVenda, precoVenda, precoDeCusto, precoCusto, fornecedorProduto, fornecedor, quantidadeDeProduto, quantidadeProduto, categoriaProduto, categoria, codigoProduto, codigo);
    return raiz;
   }
}
