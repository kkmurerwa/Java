package simpleapp;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class SimpleApp extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception{
        Button btn = new Button("CLOSE");
        Button bt1 = new Button("SAVE");
        btn.setPrefSize(80,150);
        bt1.setPrefSize(150,80);
        StackPane root = new StackPane();
        root.getChildren().addAll(btn,bt1);
        Scene scene = new Scene(root,400,350);
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
