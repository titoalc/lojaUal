package View;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TelaCadastroFornecedor { public VBox getTelaCadastroFornecedor(Stage stage) {
    VBox raiz = new VBox(10);

    MenuBarView menuBarView = new MenuBarView();
    Label nomeFornecedor = new Label("Nome");
    TextField nome = new TextField();

    Label enderecoFornecedor = new Label("Endereço");
    TextField endereco = new TextField();

    Label cepFornecedor = new Label("CEP");
    TextField cep = new TextField();

    Label cidadeFornecedor = new Label("Cidade do fornecedor");
    TextField cidade = new TextField();

    Label estadoFornecedor = new Label("Estado do fornecedor");
    TextField estado = new TextField();

    Label telefoneFornecedor = new Label("Telefone do fornecedor");
    TextField telefone = new TextField();

    Label emailFornecedor = new Label("E-mail do fornecedor");
    TextField email = new TextField();

    Label nomeProduto = new Label("Nome do produto");
    TextField produto = new TextField();

    Label marcaFornecedor = new Label("Marca do fornecedor");
    TextField marca = new TextField();

    Label codidoFornecedor = new Label("Código do fornecedor");
    TextField codigo = new TextField();

    raiz.getChildren().addAll(nomeFornecedor, nome,enderecoFornecedor,endereco,cepFornecedor,cep,cidadeFornecedor,cidade,estadoFornecedor,estado,telefoneFornecedor,telefone,emailFornecedor,email,nomeProduto,produto,marcaFornecedor,marca,codidoFornecedor,codigo);
    return raiz;
}
}
