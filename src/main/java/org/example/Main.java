package org.example;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        GridPane grid = new GridPane();

        grid.add(new Button("Botón 1"), 0, 0);
        grid.add(new Button("Botón 2"), 1, 0);
        grid.add(new Button("Botón 3"), 2, 0);
        grid.add(new Button("Botón 4"), 0, 1);
        grid.add(new Button("Botón 5"), 1, 1);
        grid.add(new Button("Botón 6"), 2, 1);

        stage.setScene(new Scene(grid, 300, 200));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
