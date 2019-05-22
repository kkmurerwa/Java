package revision;

//author @MurerwaApps

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class Revision extends Application{
    public void start(Stage pm){
        anotherone();
    }
    public void anotherone(){
        Stage pm = new Stage();
        String h = "I am the second window";
        BorderPane bd =  new BorderPane();
        Button next = new Button("Next");
        next.setPrefSize(150,50);
        next.setOnAction((ActionEvent) ->{
            Second sc = new Second();
            sc.second(h);
            pm.close();
        });
        bd.setCenter(next);
        Scene scn = new Scene(bd,250,150);
        pm.setTitle("Revision Window");
        pm.setScene(scn);
        pm.show();
    }
    public static void main(String [] args){
        Application.launch(args);        
    }
}