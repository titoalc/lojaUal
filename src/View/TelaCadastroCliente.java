package View;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class TelaCadastroCliente {
    public VBox getTelaCadastroCliente(Stage stage) {
        VBox raiz = new VBox(10);
        MenuBarView menuBarView = new MenuBarView();

        Label nomeCliente = new Label("Nome: ");
        TextField nome = new TextField();

        Label sobreNome = new Label("Sobrenome: ");
        TextField Sobrenome = new TextField();

        Label dataNascimento = new Label("Data de Nascimento: ");
        TextField datanascimento = new TextField();

        Label rg = new Label("RG: ");
        TextField RG = new TextField();

        Label cpf = new Label("CPF: ");
        TextField CPF = new TextField();

        Label endereco = new Label("Endereço: ");
        TextField Endereco = new TextField();

        Label cep = new Label("CEP: ");
        TextField CEP = new TextField();

        raiz.getChildren().addAll(nome,nomeCliente,Sobrenome,sobreNome,datanascimento,dataNascimento,RG,rg,CPF,cpf,Endereco,endereco,CEP,cep);
        return raiz;
    }


}
