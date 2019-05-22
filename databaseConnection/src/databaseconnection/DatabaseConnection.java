package databaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javax.swing.JOptionPane;

public class DatabaseConnection extends Application{
    String window;
    String usnm;
    String passw;
    public static Connection conn;
    public static Statement state;
    @Override
    public void start (Stage pm){
        BorderPane bd = new BorderPane();
        HBox hb = new HBox();
        HBox hb2 = new HBox();
        
        
        
        Label lb1 = new Label("Enter Your Login Credentials");
        lb1.setStyle("-fx-font:20 cooper_black");
        Label lb2 = new Label("Username ");
        lb2.setStyle("-fx-font:15 cooper_black");
        Label lb3 = new Label("Password ");
        lb3.setStyle("-fx-font:15 cooper_black");
        TextField txf = new TextField();
        txf.setPrefSize(300,50);
        txf.setStyle("-fx-border-radius: 150px");
        Label message1 =  new Label("Enter admission number as username e.g ci/00000/010");
        Label message = new Label("Your default password is your national id number");
        txf.setStyle("-fx-font:18 cooper_black");
        txf.setPromptText("Enter Username");
        PasswordField pf = new PasswordField();
        pf.setPrefSize(300,50);
        pf.setPromptText("Enter password");
        pf.setStyle("-fx-font:18 cooper_black");
        Button submit = new Button("SUBMIT");
        submit.setPrefSize(150,30);
        submit.setStyle("-fx-font:18 cooper_black");
        submit.setOnAction((ActionEvent) -> {
            usnm = txf.getText();   
            passw = pf.getText();
            try{
                Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/javaminiproject?zeroDateTimeBehavior=convertToNull","root","toor");
                state = conn.createStatement();
                String sql;
                sql = "SELECT admno,password FROM stud_details";
                ResultSet rs = state.executeQuery(sql);
                //STEP 5: Extract data from result set
                while(rs.next()){
                    //Retrieve by column name
                    String passWord = rs.getString("password");
                    String userName = rs.getString("admno");
                    System.out.println(userName +"\n" +passWord);
                    if (usnm.equals(userName)){
                        if(passw.equals(passWord)){
                            txf.clear();
                            pf.clear();
                            JOptionPane.showMessageDialog(null,"Password is correct");
                            pm.close();
                        }
                        else{
                            alert("Your password is incorrect!");
                            break;
                        }
                    }
                    else{
                        continue;
                    }
                    
                    
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e+" error connecting to database");
            }
        
        });
        GridPane gp = new GridPane();
        hb.setAlignment(Pos.CENTER);
        gp.setAlignment(Pos.CENTER);
        hb2.setAlignment(Pos.CENTER);
        gp.setVgap(10);
        gp.setHgap(10);
        hb.setPadding(new Insets(5,5,5,5));
        hb.getChildren().addAll(lb1);
        hb2.setPadding(new Insets(5,5,50,5));
        hb2.getChildren().addAll(submit);
        gp.add(lb2, 0, 0);
        gp.add(txf,1,0);
        gp.add(message1,1,1);
        gp.add(lb3,0,2);
        gp.add(pf,1,2);
        gp.add(message,1,3);
        bd.setTop(hb);
        bd.setCenter(gp);
        bd.setBottom(hb2);
        Scene scn = new Scene(bd,600,300);
        lb3.requestFocus();
        pm.setTitle("Login");
        pm.setScene(scn);
        pm.show();
    }
    
    public static void main(String [] args){
        Application.launch(args);
    }
    
    public void alert(String n){//used to output alerts and warnings
        Stage bh = new Stage();
        Label lb = new Label();
        lb.setText(n+"!");
        lb.setTextFill(Color.RED);
        BorderPane bd = new BorderPane();
        bd.setCenter(lb);
        Scene scn =  new Scene(bd,250,150);
        bh.setScene(scn);
        bh.setTitle("Alert");
        bh.setResizable(false);
        bh.show();
    }
}