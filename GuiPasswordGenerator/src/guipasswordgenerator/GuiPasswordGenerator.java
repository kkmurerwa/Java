package guipasswordgenerator;
//generates a password and outputs it in a copiable format
import java.util.Random;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.*;
public class GuiPasswordGenerator extends Application{
    public void start(Stage pm){
        BorderPane bp = new BorderPane();
        GridPane gp = new GridPane();
        HBox hb = new HBox();
        hb.setAlignment(Pos.CENTER);
        gp.setAlignment(Pos.CENTER);
        TextField txf = new TextField();
        txf.setStyle("-fx-font:25 cooper_black");
        txf.setPrefSize(250,50);
        txf.setEditable(false);
        Button but =  new Button("Generate Password");
        but.setPrefSize(150,50);
        but.setOnAction((ActionEvent) -> {
            String n = generator();
            txf.setText(n);
    });
        gp.setHgap(10);
        but.setStyle("-fx-font:15 cooper_black");
        //gp.setVgap(10);
        bp.setCenter(gp);
        gp.add(txf,0,0);
        txf.setAlignment(Pos.CENTER);
        hb.setPadding(new Insets(-5,5,70,5));
        hb.getChildren().addAll(but);
        gp.setAlignment(Pos.CENTER);
        bp.setBottom(hb);
        Scene scn = new Scene(bp,450,250);
        pm.setTitle("Password Generator");
        pm.setScene(scn);
        pm.show();
    }
    public static void main (String [] args){
        Application.launch(args);
    }
    public String generator(){
        int n = 10;
        String lower = "abcdefghijlmnopqrstuvwxyz";
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String symbols = "!@#$%^&|>?*-+|";
        StringBuilder sb = new StringBuilder();
        String set = lower+upper+numbers+symbols;//concertenates the strings lower,upper and numbers
        char [] setChars = set.toCharArray();//converts the set to a char array
        for (int i = 0;i<n;i++){
            Random rand = new Random();
            int k = rand.nextInt(setChars.length);//generates a random number
            sb.append(set.charAt(k));//selects from the set using the random number selected and appends to the string builder
        }
        String pass = sb.toString();//parses the collection of characters to a string
        return pass;
    }
}
