package loginpage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.application.Application;
import javafx.stage.*;
import javafx.geometry.*;
import javafx.scene.paint.Color;

public class LoginPage extends Application{
    public void start (Stage pm){
        BorderPane bd = new BorderPane();
        HBox hb = new HBox();
        HBox hb2 = new HBox();
        String usnm [] = {"CI/0029","ED/0029","BA/0029"};
        String pass [] = {"1234","1235","1236"};
        Label lb1 = new Label("Enter Your Login Credentials");
        lb1.setStyle("-fx-font:20 cooper_black");
        Label lb2 = new Label("Name ");
        lb2.setStyle("-fx-font:15 cooper_black");
        Label lb3 = new Label("Password ");
        lb3.setStyle("-fx-font:15 cooper_black");
        TextField txf = new TextField();
        txf.setPrefSize(200,50);
        Label message1 =  new Label("Enter admission number as username");
        Label message = new Label("Your default password is 1234");
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
                if (txf.getText().equals(usnm[i])){
                        if (!pf.getText().equals(pass[i])){
                            message.setText("Your password is incorrect");
                            message.setTextFill(Color.rgb(210,39,30));
                        }
                        else{
                            message.setText("Your password is correct");
                            message.setTextFill(Color.rgb(21,117,84));
                            txf.clear();
                            pf.clear();
                            Second();
                            pm.close();
                        }
                }
            }
            message1.setText("Username Not Found");
            message1.setTextFill(Color.rgb(210,39,30));
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
}