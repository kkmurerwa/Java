package anotherone;

import javafx.application.*;
import javafx.scene.control.*;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.event.*;
import javafx.geometry.Pos;
import javafx.stage.*;
import javax.swing.JOptionPane;

public class AnotherOne extends Application{
    public void start(Stage primaryStage){
        primaryStage.setTitle("I am a title");
        Button btn1 = new Button("Button 1");
        //Setting an action for button 1
        btn1.setOnAction((ActionEvent event) -> {
                JOptionPane.showMessageDialog(null,"I am button 1");
    });
        Button btn2 = new Button("Button 2");
        btn2.setOnAction ((ActionEvent ev) -> {
            JOptionPane.showMessageDialog(null,"I am button 2");
        });
        Button btn3 = new Button("Button 3");
        Button btn4 = new Button("Button 4");
        Button btn5 = new Button("Button 5");
        Button btn6 = new Button("Button 6");
        Button btn7 = new Button("EXIT");
        btn7.setOnAction((ActionEvent uskdfavxghb) -> {
            primaryStage.close();
            second(primaryStage);
            
        });
        GridPane gp = new GridPane();
        gp.setAlignment(Pos.CENTER);
        gp.setHgap(5);
        gp.setVgap(5);
        gp.add(btn1,0,0);
        gp.add(btn2,1,0);
        gp.add(btn3,2,0);
        gp.add(btn4,0,1);
        gp.add(btn5,1,1);
        gp.add(btn6,2,1);
        gp.add(btn7,1,6);
        Scene scn = new Scene(gp,300,250);
        primaryStage.setScene(scn);
        primaryStage.show();       
    }
    public static void main(String [] h){
        Application.launch(h);
    }
    public void second(Stage primarySta){
        primarySta.setTitle("I am the second Frame");
        Button btn1 = new Button("Button 1");
        //Setting an action for button 1
        btn1.setOnAction((ActionEvent event) -> {
                JOptionPane.showMessageDialog(null,"I am button 1");
    });
        Button btn2 = new Button("Button 2");
        btn2.setOnAction ((ActionEvent ev) -> {
            JOptionPane.showMessageDialog(null,"I am button 2");
        });
        Button btn3 = new Button("Button 3");
        Button btn4 = new Button("Button 4");
        Button btn5 = new Button("Button 5");
        Button btn6 = new Button("Button 6");
        Button btn7 = new Button("EXIT");
        btn7.setOnAction((ActionEvent uskdfavxghb) -> {
            System.exit(0);
        });
        GridPane gp = new GridPane();
        gp.setAlignment(Pos.CENTER);
        gp.setHgap(5);
        gp.setVgap(5);
        gp.add(btn1,0,0);
        gp.add(btn2,1,0);
        gp.add(btn3,2,0);
        gp.add(btn4,0,1);
        gp.add(btn5,1,1);
        gp.add(btn6,2,1);
        gp.add(btn7,2,6);
        Scene scn = new Scene(gp,300,250);
        primarySta.setScene(scn);
        primarySta.show();       
    }
}