package View;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;



public class MenuBarView {
    public MenuBar getMenuBar(Stage stage) {
        MenuBar menubar = new MenuBar();
        Menu cadastrar = new Menu("cadastrar");
        MenuItem cadastroFuncionario = new MenuItem("funcionario");

        cadastrar.getItems().addAll(cadastroFuncionario);
        menubar.getMenus().addAll(cadastrar);
        return menubar;
    }

}
