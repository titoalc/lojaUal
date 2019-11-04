package sample;

import View.MenuBarView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
    VBox raiz = new VBox();
        MenuBarView menuBarView = new MenuBarView();
        raiz.getChildren().addAll(menuBarView.getMenuBar(primaryStage));

        primaryStage.setTitle("pagina inicial");
        primaryStage.setScene(new Scene(raiz, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

}
