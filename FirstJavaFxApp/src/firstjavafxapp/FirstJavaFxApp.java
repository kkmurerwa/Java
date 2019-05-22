package firstjavafxapp;

import java.awt.BorderLayout;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class FirstJavaFxApp extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button bt = new Button("Tialala");
        HBox hb = new HBox();
        bt.setPrefSize(50,50);
        bt.setOnAction(new EventHandler<ActionEvent>(){
            public void handle (ActionEvent eve){
                System.out.println("Tialalalalalalaalalalal");
            }
    });
        Button btn = new Button("Tibim");
        btn.setPrefSize(50,50);
        btn.setOnAction(new EventHandler<ActionEvent>(){
            public void handle (ActionEvent eve){
                System.out.println("Tibiiiiiiiiiiiiiiim");
            }
    });
        StackPane root = new StackPane();
        root.getChildren().addAll(bt,btn);
        root.getChildren().add(hb);
        Scene scen = new Scene(root,450,300);
        primaryStage.setTitle("I am a scene");
        primaryStage.setScene(scen);
        primaryStage.show();
        primaryStage.setResizable(false);
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
