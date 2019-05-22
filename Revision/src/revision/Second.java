package revision;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.layout.*;

public class Second extends Revision{
    public void second(String h){
        Stage sec = new Stage();
        Revision rv = new Revision();
        BorderPane bf = new BorderPane();
        Scene scn = new Scene(bf,450,500);
        GridPane gp = new GridPane();
        gp.setAlignment(Pos.CENTER);
        Label lb = new Label();
        lb.setText("I am the second window in the second method");
        gp.getChildren().addAll(lb);
        bf.setCenter(gp);
        sec.show();
        sec.setScene(scn);
        sec.setTitle(h);
    }
}
