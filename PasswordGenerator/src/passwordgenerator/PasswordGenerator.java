package passwordgenerator;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;//Import JOPtionPane
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;//Import all layouts with one import statement
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author Kenneth Murerwa
 */
public class PasswordGenerator extends Application {
    public String passString = null;
    @Override
    public void start(Stage primaryStage) {
        
        //Create the main layout manager
        BorderPane root = new BorderPane();
        
        //Create secondary layour managers
        VBox vb = new VBox();
        HBox hbForButtons = new HBox();
        HBox hbForTextField = new HBox();
        HBox hbForExitButton = new HBox();
        
        
        //Set Properties for the layout managers
        root.setPadding(new Insets (80, 40, 30, 40));
        
        vb.setSpacing(20);
        
        hbForTextField.setAlignment(Pos.CENTER);
        
        
        hbForExitButton.setAlignment(Pos.CENTER);
        
        
        hbForButtons.setAlignment(Pos.CENTER);
        hbForButtons.setSpacing(20);
        
        
        //Create the textbox to show the password and set properties
        TextField generatedPassword = new TextField();
        generatedPassword.setAlignment(Pos.CENTER);//Align text to center
        generatedPassword.setPrefWidth(420);
        generatedPassword.setPrefHeight(40);
        generatedPassword.setFont(Font.font(18));
        generatedPassword.setPromptText("Generated password shows here");
        generatedPassword.setEditable(false);//Disables editing of the textfield
        
        
        //Create buttons to be used
        Button generatePassword = new Button("Generate");
        Button clearPassword = new Button ("Clear");
        Button copyToClipBoard = new Button("Copy to Clipboard");
        Button exit = new Button("Exit");
        
        //Set characteristics for buttons created
        generatePassword.setPrefHeight(40);
        generatePassword.setFont(Font.font(20));  
        generatePassword.setOnAction((ActionEvent event)-> {
            passString = passwordgeneratormethod();
            generatedPassword.setText(passString);
        });
        
        clearPassword.setPrefHeight(40);
        clearPassword.setFont(Font.font(20));
        clearPassword.setOnAction((ActionEvent event)-> {
            generatedPassword.setText("");
            passString = null;
            generatedPassword.setPromptText("Generated password shows here");
        });
        
        
        copyToClipBoard.setPrefHeight(40);
        copyToClipBoard.setFont(Font.font(20));
        copyToClipBoard.setOnAction((ActionEvent event)-> {
            //Copy the generated password to clipboard
            StringSelection stringSelection = new StringSelection(passString);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, null);
            Alert alert = new Alert(AlertType.INFORMATION);
            
            alert.setHeaderText(null);
            if (passString != null){  
                alert.setTitle("Success");
                alert.setContentText("Text copied to clipboard!");
            }
            else {
                alert.setTitle("Failed");
                alert.setContentText("No password generated yet!");
            }
            alert.showAndWait();
        });
        
        exit.setPrefHeight(40);
        exit.setPrefWidth(300);
        exit.setFont(Font.font(20));
        exit.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.exit(0);
            }
        });
        
        
        //Add items to its parent component
        hbForTextField.getChildren().addAll(generatedPassword);
        hbForButtons.getChildren().addAll(generatePassword, clearPassword, copyToClipBoard);
        hbForExitButton.getChildren().add(exit);
        vb.getChildren().addAll(hbForTextField, hbForButtons, hbForExitButton);
        root.setCenter(vb);
        
        
        //Create Scene
        Scene scene = new Scene(root, 550, 300);
        
        
        //Set focus to Generate button
        generatePassword.requestFocus();
        
        primaryStage.setTitle("Password Generator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public String passwordgeneratormethod (){
        String passwordString;
        int stringLength = 10    ;
        ArrayList <Character> selectionSource = new ArrayList<Character>();
        ArrayList <Character> arrayOfRandomCharacters = new ArrayList<Character>();
        String caps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String small = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "1234567890";
        
        //Append items in each string to arraylist
        for (char i:caps.toCharArray()){
            selectionSource.add(i);
        }
        
        for (char i:small.toCharArray()){
            selectionSource.add(i);
        }
        
        for (char i:numbers.toCharArray()){
            selectionSource.add(i);
        }
        // System.out.println(selectionSource);
        for(int i = 0; i<stringLength; i++){
            Random rand = new Random();
            // Obtain a number between [0 - 9].
            int n = rand.nextInt(selectionSource.size());
            arrayOfRandomCharacters.add(selectionSource.get(n));
        }
        StringBuilder sb = new StringBuilder();
        for (char i: arrayOfRandomCharacters){ 
            sb.append(i);
        }
        return sb.toString();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
