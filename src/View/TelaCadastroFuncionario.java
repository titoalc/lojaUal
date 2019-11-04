package View;


import Model.Funcionario;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class TelaCadastroFuncionario {public VBox getTelaCadastrarFuncionario(Stage stage) {
    VBox raiz = new VBox(2);

    MenuBarView menuBarView = new MenuBarView();
    MenuBar menuBar =  menuBarView.getMenuBar(stage);
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
    Button btnCadastrar = new Button("cadastrar funcionario");
    Label cadastroComSucesso = new Label("");

    btnCadastrar.setOnAction(actionEvent -> {
        Funcionario funcionario = new Funcionario(nomeFuncionario.getText(),sobrenome.getText(),dataNascimento.getText(),Double.valueOf(rg.getText()),Double.valueOf(cpf.getText()),endereco.getText(),Double.valueOf(cep.getText()),Double.valueOf(telefone.getText()),cargo.getText(),login.getText(),senha.getText());
        cadastroComSucesso.setText("cadastrado com sucesso! ");
        System.out.println(funcionario);
    });




    raiz.getChildren().addAll(menuBar,nome,nomeFuncionario,sobrenomeFuncionario,sobrenome,nascimento,dataNascimento,rgFuncionario,rg,cpfFuncionario,cpf,enderecoFuncionario,endereco,cepFuncionario,cep,telefoneFuncionario,telefone,cargoFuncionario,cargo,loginFuncionario,login,senhaFuncionario,senha,btnCadastrar,cadastroComSucesso);
     return raiz;
    }
}