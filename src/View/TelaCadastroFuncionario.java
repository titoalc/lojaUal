package View;

import javafx.scene.layout.VBox;

import javax.swing.*;
import java.awt.*;

public class TelaCadastroFuncionario {public VBox getTelaCadastrarFuncionario(Stage stage){
    VBox raiz = new VBox(10);

    MenuBarView menuBarView = new MenuBarView();
    Label nome = new Label("nome");
    TextField nomeFuncionario = new TextField();
    Label sobrenomeFuncionario = new Label("sobrenome");
    TextField sobrenome = new TextField();
    Label nascimento = new Label("data de nascimento");
    TextField dataNascimento = new TextField();
    Label rgFuncionario = new Label("RG");
    TextField rg = new TextField();
    Label cpfFuncionario = new Label("CPF");
    TextField cpf = new TextField();
    Label enderecoFuncionario = new Label("endereço");
    TextField endereco = new TextField();
    Label cepFuncionario = new Label("CEP");
    TextField cep = new TextField();
    Label telefoneFuncionario = new Label("telefone");
    TextField telefone = new TextField();
    Label cargoFuncionario = new Label("cargo");
    TextField cargo = new TextField();
    Label loginFuncionario = new Label("login");
    TextField login = new TextField();
    Label senhaFuncionario = new Label("senha");
    TextField senha = new TextField();

    raiz.getChildren().addAll(nome,nomeFuncionario,sobrenome,sobrenomeFuncionario,nascimento,dataNascimento,rgFuncionario,rg,cpfFuncionario,cpf,enderecoFuncionario,endereco,cepFuncionario,cep,telefoneFuncionario,telefone,cargoFuncionario,cargo,loginFuncionario,login,senhaFuncionario,senha,)
     return raiz;
    }
}
