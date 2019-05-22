package calculator;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.application.Application;
import javafx.stage.*;
import javafx.event.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import java.util.ArrayList;
import java.util.List;

public class Calculator extends Application{
    TextArea txt = new TextArea();
    int firstnum = 0;
    int secnum,thirdnum,result;
    String pr,pr1="";
    char sign = ' ';
    List m = new ArrayList<Integer>();
    @Override
    public void start(Stage stag){
        BorderPane bd = new BorderPane();
        HBox hb = new HBox();
        hb.setAlignment(Pos.CENTER);
        GridPane gp = new GridPane();
        gp.setAlignment(Pos.CENTER);
        gp.setHgap(10);
        gp.setVgap(10);
        txt.setPrefSize(290,100);
        txt.setStyle("-fx-font:24 arial");
        txt.setEditable(false);
        hb.setPadding(new Insets(10,5,5,5));
        hb.getChildren().addAll(txt);
        bd.setTop(hb);
        bd.setCenter(gp);
        Button b1 = new Button("1");
        b1.setPrefSize(70,70);
        b1.setStyle("-fx-font:22 cooper_black");
        b1.setOnAction((ActionEvent v) -> {
            firstnum = firstnum*10+1;
            pr = pr1+Integer.toString(firstnum);
            txt.setText(pr);
        });
        Button b2 = new Button("2");
        b2.setPrefSize(70,70);
        b2.setStyle("-fx-font:22 cooper_black");
        b2.setOnAction((ActionEvent v) -> {
            firstnum = firstnum*10+2;
            pr = pr1+Integer.toString(firstnum);
            txt.setText(pr);
        });
        Button b3 = new Button("3");
        b3.setPrefSize(70,70);
        b3.setStyle("-fx-font:22 cooper_black");
        b3.setOnAction((ActionEvent v) -> {
            firstnum = firstnum*10+3;
            pr = pr1+Integer.toString(firstnum);
            txt.setText(pr);
        });
        Button b4 = new Button("4");
        b4.setPrefSize(70,70);
        b4.setStyle("-fx-font:22 cooper_black");
        b4.setOnAction((ActionEvent v) -> {
            firstnum = firstnum*10+4;
            pr = pr1+Integer.toString(firstnum);
            txt.setText(pr);
        });
        Button b5 = new Button("5");
        b5.setPrefSize(70,70);
        b5.setStyle("-fx-font:22 cooper_black");
        b5.setOnAction((ActionEvent v) -> {
            firstnum = firstnum*10+5;
            pr = pr1+Integer.toString(firstnum);
            txt.setText(pr);
        });
        Button b6 = new Button("6");
        b6.setPrefSize(70,70);
        b6.setStyle("-fx-font:22 cooper_black");
        b6.setOnAction((ActionEvent v) -> {
            firstnum = firstnum*10+6;
            pr = pr1+Integer.toString(firstnum);
            txt.setText(pr);
        });
        Button b7 = new Button("7");
        b7.setPrefSize(70,70);
        b7.setStyle("-fx-font:22 cooper_black");
        b7.setOnAction((ActionEvent v) -> {
            firstnum = firstnum*10+7;
            pr = pr1+Integer.toString(firstnum);
            txt.setText(pr);
        });
        Button b8 = new Button("8");
        b8.setPrefSize(70,70);
        b8.setStyle("-fx-font:22 cooper_black");
        b8.setOnAction((ActionEvent v) -> {
            firstnum = firstnum*10+8;
            pr = pr1+Integer.toString(firstnum);
            txt.setText(pr);
        });
        Button b9 = new Button("9");
        b9.setPrefSize(70,70);
        b9.setStyle("-fx-font:22 cooper_black");
        b9.setOnAction((ActionEvent v) -> {
            firstnum = firstnum*10+9;
            pr = pr1+Integer.toString(firstnum);
            txt.setText(pr);
        });
        Button b10 = new Button("+");
        b10.setPrefSize(70,70);
        b10.setStyle("-fx-font:22 cooper_black");
        b10.setOnAction((ActionEvent v) -> {
            secnum = firstnum;
            firstnum = 0;
            sign = '+';
            pr1 = Integer.toString(secnum)+"+";
            txt.setText(pr1);
        });
        Button b11 = new Button("-");
        b11.setPrefSize(70,70);
        b11.setStyle("-fx-font:22 cooper_black");
        b11.setOnAction((ActionEvent v) -> {
            secnum = firstnum;
            firstnum = 0;
            sign = '-';
            pr1 = Integer.toString(secnum)+"-";
            txt.setText(pr1);
        });
        Button b12 = new Button("x");
        b12.setPrefSize(70,70);
        b12.setStyle("-fx-font:22 cooper_black");
        b12.setOnAction((ActionEvent v) -> {
            secnum = firstnum;
            firstnum = 0;
            sign = 'x';
            pr1 = Integer.toString(secnum)+"x";
            txt.setText(pr1);
        });
        Button b13 = new Button("/");
        b13.setPrefSize(70,70);
        b13.setStyle("-fx-font:22 cooper_black");
        b13.setOnAction((ActionEvent v) -> {
            secnum = firstnum;
            firstnum = 0;
            sign = '/';
            pr1 = Integer.toString(secnum)+"/";
            txt.setText(pr1);
        });
        Button b14 = new Button("=");
        b14.setPrefSize(70,70);
        b14.setStyle("-fx-font:22 cooper_black");
        b14.setOnAction((ActionEvent v) -> {
            thirdnum = firstnum;
            if (sign == '+'){
                result = secnum+thirdnum;
                txt.setText(Integer.toString(result));
                secnum = 0;
                thirdnum = 0;
                firstnum = 0;
                pr = "";
                pr1 = "";
            }
            else if (sign == '-'){
                result = secnum-thirdnum;
                txt.setText(Integer.toString(result));
                secnum = 0;
                thirdnum = 0;
                firstnum = 0;
                pr = "";
                pr1 = "";
            }
            else if (sign == 'x'){
                result = secnum*thirdnum;
                txt.setText(Integer.toString(result));
                secnum = 0;
                thirdnum = 0;
                firstnum = 0;
                pr = "";
                pr1 = "";
            }
            else {
                result = secnum/thirdnum;
                txt.setText(Integer.toString(result));
                secnum = 0;
                thirdnum = 0;
                firstnum = 0;
                pr = "";
                pr1 = "";
            }
        });
        Button b15 = new Button("0");
        b15.setPrefSize(70,70);
        b15.setStyle("-fx-font:22 cooper_black");
        b15.setOnAction((ActionEvent v) -> {
            firstnum = firstnum*10+0;
            pr = pr1+Integer.toString(firstnum);
            txt.setText(pr);
        });
        Button b16 = new Button("DEL");
        b16.setPrefSize(70,70);
        b16.setStyle("-fx-font:22 cooper_black");
        b16.setOnAction((ActionEvent v) -> {
            firstnum = firstnum/10;
            pr = pr1+Integer.toString(firstnum);
            txt.setText(pr);
        });
        gp.setHgap(10);
        gp.setVgap(10);
        gp.add(b1, 0, 1);
        gp.add(b2,1,1);
        gp.add(b3,2,1);
        gp.add(b16,3,1);
        gp.add(b10,3,2);
        gp.add(b4,0,2);
        gp.add(b5,1,2);
        gp.add(b6,2,2);
        gp.add(b11,3,3);
        gp.add(b7,0,3);
        gp.add(b8,1,3);
        gp.add(b9,2,3);
        gp.add(b12,3,4);
        gp.add(b13,0,4);
        gp.add(b14,2,4);
        gp.add(b15,1,4);
        Scene scn = new Scene(bd,320,450);
        stag.setTitle("Calculator");
        stag.setScene(scn);
        stag.setResizable(false);
        stag.show();
    }
    public static void main(String [] ar){
        Application.launch(ar);
    }
}