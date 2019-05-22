
import java.awt.Button;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author ropallan
 */
public class trafficCJ extends Application {
    
    @Override
    public void start(Stage primaryStage) {
                Group root = new Group();

       Rectangle rec =new Rectangle(300,50,180,500);
           rec.setStroke(Color.BLACK);
           rec.setFill(Color.BLACK);
           
           Rectangle reec =new Rectangle(350,550,80,160);
           reec.setStroke(Color.DARKBLUE);
           reec.setFill(Color.DARKBLUE);
           
       Circle cir =new Circle(391,150,60);
       cir.setStroke(Color.RED);
       cir.setStroke(Color.RED);
        
        Circle ciir =new Circle(391,300,60);
       ciir.setStroke(Color.ORANGE);
       ciir.setFill(Color.BLUE);
       
        Circle ciiir =new Circle(391,450,60);
       ciiir.setStroke(Color.RED);
       ciiir.setFill(Color.BLUE);
       Scene scene = new Scene(root, 550, 750);
       
            Thread t=new Thread(){
                
                public void run(){
                    try{
                        while(true){
                            
                        cir.setFill(Color.RED);          
                        Thread.sleep(700);
                        cir.setFill(Color.BLUE);
                        
                         ciir.setFill(Color.ORANGE);          
                        Thread.sleep(700);
                        ciir.setFill(Color.BLUE);
                         
                         ciiir.setFill(Color.GREEN);          
                        Thread.sleep(700);
                        ciiir.setFill(Color.BLUE);
                        
                        
                        
                    }
                }   catch (InterruptedException ex) {
                        Logger.getLogger(trafficCJ.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
         
            };
            
            t.start();
               
               
               
 root.getChildren().addAll(rec,reec,cir,ciir,ciiir);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
   
    
}
