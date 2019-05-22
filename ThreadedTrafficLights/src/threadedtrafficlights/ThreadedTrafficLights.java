package threadedtrafficlights;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.paint.*;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class ThreadedTrafficLights extends Application{
    public void start(Stage pmStage){
        Group root = new Group();
        Circle red =new Circle(190,120,50);//x coordinates, y coordinates, radius
        Circle sec =new Circle(240,120,50);//x coordinates, y coordinates, radius
        Polygon poly = new Polygon();
        poly.getPoints().addAll(new Double[]{
           216.0,236.0,285.8,142.0,144.5,142.0 
        });
        Label i = new Label();
        i.setLayoutX(160);
        i.setLayoutY(280);
        i.setText("I Love You");
        i.setStyle("-fx-font:26 cooper_black");
        Thread t=new Thread(){
                
                public void run(){
                    try{
                        while(true){
                            
                        red.setFill(Color.RED); 
                        sec.setFill(Color.RED);
                        poly.setFill(Color.RED);
                        
                        Thread.sleep(2000);
                        red.setFill(Color.AQUA);
                        sec.setFill(Color.AQUA);
                        poly.setFill(Color.AQUA);
                        Thread.sleep(2000);
                        red.setFill(Color.PURPLE);
                        sec.setFill(Color.PURPLE);
                        poly.setFill(Color.PURPLE);
                        Thread.sleep(2000);
                        red.setFill(Color.PINK);
                        sec.setFill(Color.PINK);
                        poly.setFill(Color.PINK);
                        Thread.sleep(2000);
                        red.setFill(Color.BLACK);
                        sec.setFill(Color.BLACK);
                        poly.setFill(Color.BLACK);
                        Thread.sleep(2000);
                        red.setFill(Color.BROWN);
                        sec.setFill(Color.BROWN);
                        poly.setFill(Color.BROWN);
                        Thread.sleep(2000);
                        red.setFill(Color.CHARTREUSE);
                        sec.setFill(Color.CHARTREUSE);
                        poly.setFill(Color.CHARTREUSE);
                        Thread.sleep(2000);
                        red.setFill(Color.CORAL);
                        sec.setFill(Color.CORAL);
                        poly.setFill(Color.CORAL);
                        Thread.sleep(2000);
                        red.setFill(Color.DARKORANGE);
                        sec.setFill(Color.DARKORANGE);
                        poly.setFill(Color.DARKORANGE);
                        
                        
                    }
                }   catch (InterruptedException ex) {
                        Logger.getLogger(ThreadedTrafficLights.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
         
            };
            t.start();
               
               
               
            root.getChildren().addAll(red,sec,poly,i);
            Scene scene = new Scene(root, 430, 360);
            pmStage.setTitle("I Love You");
            pmStage.setScene(scene);
            pmStage.setResizable(false);
            pmStage.setOnCloseRequest((ActionEvent) ->{
                t.suspend();
            });
            pmStage.show();
    }
    public static void main(String [] args){
        Application.launch(args);
    }
}
