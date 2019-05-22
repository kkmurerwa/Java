package loginpage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.application.Application;
import javafx.stage.*;
import javafx.geometry.*;
import javafx.scene.paint.*;

public class LoginPage extends Application{
    @Override
    public void start (Stage pm){
        BorderPane bd = new BorderPane();
        HBox hb = new HBox();
        HBox hb2 = new HBox();
        String usnm [] = {"CI/00029/016","ED/00029/016","BA/00029/016"};
        String usnm2[] = {"ci/00029/016","ed/00029/016","ba/00029/016"};
        String pass [] = {"1234","1235","1236"};
        Label lb1 = new Label("Enter Your Login Credentials");
        lb1.setStyle("-fx-font:20 cooper_black");
        Label lb2 = new Label("Name ");
        lb2.setStyle("-fx-font:15 cooper_black");
        Label lb3 = new Label("Password ");
        lb3.setStyle("-fx-font:15 cooper_black");
        TextField txf = new TextField();
        txf.setPrefSize(200,50);
        txf.setStyle("-fx-border-radius: 150px");
        Label message1 =  new Label("Enter admission number as username");
        Label message = new Label("Your default password is ****");
        txf.setStyle("-fx-font:18 cooper_black");
        txf.setPromptText("Enter username");
        PasswordField pf = new PasswordField();
        pf.setPrefSize(200,50);
        pf.setPromptText("Enter password");
        pf.setStyle("-fx-font:18 cooper_black");
        Button submit = new Button("SUBMIT");
        submit.setPrefSize(150,30);
        submit.setStyle("-fx-font:18 cooper_black");
        submit.setOnAction((ActionEvent) -> {
            for (int i = 0; i <= 2;i++){
               if (txf.getText().equals(usnm[i]) || txf.getText().equals(usnm2[i])){
                   if (pf.getText().equals(pass[i])){
                       txf.clear();
                       pf.clear();
                       Second();
                       pm.close();
                   }
                   else{
                       alert("Your password is incorrect!");
                       break;
                   }
                   break;
               }
               else{
                   if (i == 2){
                       alert("Username not found!");
                       break;
                   }
               }
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
        Scene scn = new Scene(bd,400,300);
        pm.setTitle("Login");
        pm.setScene(scn);
        pm.show();
    }
    public static void main(String [] args){
        Application.launch(args);
    }
    
    public void Second(){
        Stage bh = new Stage();
        Label lb = new Label();
        lb.setText("Congratulations! You have been logged in!");
        lb.setTextFill(Color.GREEN);
        BorderPane bd = new BorderPane();
        bd.setCenter(lb);
        Scene scn =  new Scene(bd,350,250);
        bh.setScene(scn);
        bh.setTitle("Success");
        bh.show();
    }
    public void alert(String n){
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