package dictionary;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.application.Application;
import javafx.stage.*;
import javafx.geometry.*;
import javafx.scene.paint.*;


public class Dictionary extends Application {
    public void start(Stage prim){
        BorderPane bp = new BorderPane();
        VBox vb = new VBox();
        vb.setAlignment(Pos.CENTER);
        TextField txt = new TextField();
        txt.setPrefSize(70,50);
        vb.getChildren().addAll(txt);
        bp.setCenter(vb);
        Scene scn = new Scene(bp,450,250);
        prim.setTitle("Dictionary");
        prim.setScene(scn);
        prim.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
