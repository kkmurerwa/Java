package trafficlights;
//@Author MurerewaApps
import java.util.logging.*;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class TrafficLights extends Application {
    
    @Override
    public void start(Stage primaryStage) {
                Group root = new Group();

       Rectangle rec =new Rectangle(0,0,180,360);
       rec.setStroke(Color.BLACK);
       rec.setFill(Color.BLACK);
           
       Circle red =new Circle(95,70,50);
       red.setStroke(Color.RED);
       red.setFill(Color.RED);
      
        
       Circle yellow =new Circle(95,180,50);
       yellow.setStroke(Color.YELLOW);
       yellow.setFill(Color.BLACK);
       
       Circle green =new Circle(95,290,50);
       green.setStroke(Color.GREEN);
       green.setFill(Color.BLACK);
       Scene scene = new Scene(root, 180, 360);
       
            Thread t=new Thread(){
                
                public void run(){
                    try{
                        while(true){
                            
                        red.setFill(Color.RED);  
                        Thread.sleep(2000);
                        red.setFill(Color.BLACK);
                        
                        yellow.setFill(Color.YELLOW);          
                        Thread.sleep(2000);
                        yellow.setFill(Color.BLACK);
                         
                        green.setFill(Color.GREEN);          
                        Thread.sleep(2000);
                        green.setFill(Color.BLACK);
                        
                        
                        
                    }
                }   catch (InterruptedException ex) {
                        Logger.getLogger(TrafficLights.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
         
            };
            
            t.start();
               
               
               
 root.getChildren().addAll(rec,red,yellow,green);
        
        primaryStage.setTitle("Traffic Ligts");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
   
    
}
