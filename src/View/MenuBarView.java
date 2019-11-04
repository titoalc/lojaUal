package View;

import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;



public class MenuBarView {
    public static MenuBar getMenuBar(Stage stage) {
        MenuBar menubar = new MenuBar();

        Menu cadastrar = new Menu("cadastrar");

        MenuItem cadastroFuncionario = new MenuItem("funcionario");
        MenuItem cadastroCliente = new MenuItem("cliente");
        MenuItem cadastroFornecedor = new MenuItem("fornecedor");
        MenuItem cadastroProduto = new MenuItem("produto");

        cadastrar.getItems().addAll(cadastroFuncionario,cadastroCliente,cadastroFornecedor,cadastroProduto);
        menubar.getMenus().addAll(cadastrar);

        cadastroFuncionario.setOnAction(Event -> {
            stage.setTitle("funcionarios");
            TelaCadastroFuncionario telaCadastroFuncionarios = new TelaCadastroFuncionario();
            stage.setScene(new Scene(telaCadastroFuncionarios.getTelaCadastrarFuncionario(stage),500,275));
            stage.show();
        });

        return menubar;
    }

}
