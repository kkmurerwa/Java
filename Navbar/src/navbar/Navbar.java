package navbar;

import javafx.scene.Scene;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.*;
import javafx.event.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class Navbar extends Application{
    public void start(Stage pr){
        BorderPane bd = new BorderPane();
        HBox hb = new HBox();
        hb.setAlignment(Pos.CENTER_LEFT);
        hb.setPadding(new Insets(10,0,0,0));//padding is left,top,bottom,right
        hb.setStyle("-fx-background-color: #ffffff;");
        bd.setTop(hb);
        Button file = new Button("File");
        file.setPrefSize(25,0);
        file.setPadding(new Insets(1,1,1,1));
        file.setStyle("-fx-font: 245 -forte");
        file.setStyle("-fx-background-color: #ffffff");
        file.setOnAction((ActionEvent) -> {
            //set what to do
        });
        hb.getChildren().addAll(file);
        Scene sc = new Scene(bd,600,400);
        pr.setTitle("Hospital System");
        pr.setScene(sc);
        pr.show();
    }
    public static void main(String [] ar){
        Application.launch(ar);
    }
}