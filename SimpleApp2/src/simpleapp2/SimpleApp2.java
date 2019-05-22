package simpleapp2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class SimpleApp2 extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button btn = new Button("GUI in Fx");
        Button bt1 = new Button("SAVE");
        Button bt2 = new Button("CLOSE");
        TextArea txt = new TextArea();
        TextField txf = new TextField();
        Scene scene1,scene2;
        //set size of components
        btn.setPrefSize(100,50);
        btn.setOnAction((ActionEvent event) -> {
                System.out.println("I am a button");
            
    });
        bt1.setPrefSize(100,50);
        bt1.setOnAction(new EventHandler<ActionEvent>(){
            public void handle (ActionEvent event){
                System.out.println("I am another button");
            }
    });
        bt2.setPrefSize(100,50);
        bt2.setOnAction(new EventHandler<ActionEvent>(){
            public void handle (ActionEvent event){
                System.out.println("I am yet another button");
            }
    });
        txt.setPrefSize(100,50);
        //add components to vbox
        VBox vbox = new VBox(20,btn,bt1,bt2,txf,txt);
        scene1 = new Scene(vbox,500,150);
        primaryStage.setTitle("I am a Java FX window");
        primaryStage.setScene(scene1);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
    
}
