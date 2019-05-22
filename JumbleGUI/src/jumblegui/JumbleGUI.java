package jumblegui;

//@MurerwaApps

import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.*;

public class JumbleGUI extends Application{
    int score = 0;
    public void start(Stage pm){
        BorderPane bp = new BorderPane();
        
        GridPane gpCenter = new GridPane();
        HBox hbTop = new HBox();
        hbTop.setAlignment(Pos.CENTER);
        hbTop.setPadding(new Insets(20,0,0,0));
        HBox hb = new HBox();
        hb.setPadding(new Insets(20,10,20,10));
        gpCenter.setAlignment(Pos.CENTER);
        gpCenter.setHgap(10);
        gpCenter.setVgap(10);
        Label top = new Label("Use these letters to make words : panb");
        top.setAlignment(Pos.CENTER);
        
        Label scoreLabel = new Label();
        scoreLabel.setText("Score: ");
        scoreLabel.setAlignment(Pos.CENTER);
        
        TextField textEntry = new TextField();
        textEntry.setStyle("-fx-font:25 cooper_black");
        textEntry.setPrefSize(250,50);
        textEntry.setAlignment(Pos.CENTER);
        textEntry.setOnKeyPressed((KeyEvent) ->{
            if (KeyEvent.getCode().equals(KeyCode.ENTER)){
                score += checker(textEntry.getText());
                scoreLabel.setText("Score : " +score);
                textEntry.clear();
                KeyEvent.consume();
            }
        });
        
        
        Button finish = new Button("Finish");
        finish.setPrefSize(150,50);
        finish.setStyle("-fx-font:15 cooper_black");
        finish.setOnAction((ActionEvent) -> {
            //Some text
        });
        
        Button restart = new Button("Restart");
        restart.setPrefSize(150,50);
        restart.setStyle("-fx-font:15 cooper_black");
        restart.setOnAction((ActionEvent) -> {
            //Some text
        });
        
        Button exit = new Button("Close");
        exit.setPrefSize(150,50);
        exit.setStyle("-fx-font:15 cooper_black");
        exit.setOnAction((ActionEvent) -> {
            System.exit(0);
        });
        hbTop.getChildren().addAll(top);
        hb.getChildren().addAll(finish,restart,exit);
        bp.setTop(hbTop);
        gpCenter.add(textEntry,1,0);
        gpCenter.add(scoreLabel,1,1);
        gpCenter.add(hb,1,3);
        bp.setCenter(gpCenter);
        
        Scene scn = new Scene(bp,550,250);
        pm.setTitle("Jumble The Game");
        pm.setScene(scn);
        pm.show();
    }
    public int checker(String gotten){
        String [] panb = {"pan","nap","nab","ban"};
        List  <String> temp = new ArrayList();
        
        int scores = 0;
        for (int b = 0; b<panb.length;b++){
            temp.add(panb[b]);
        }
        boolean found = false;
        for (int i = 0; i<(temp.size());i++){
            if (gotten.equals(temp.get(i))){
                scores += 1;
                temp.remove(i);
                found = true;
            }
        }
        if (found == false){
            //
        }
        return scores;
    }
    public static void main (String [] args){
        Application.launch(args);
    }
}
