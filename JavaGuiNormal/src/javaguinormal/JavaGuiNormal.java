package javaguinormal;
import javax.swing.*;
public class JavaGuiNormal {

    public static void main(String[] args) {
       JFrame theGUI = new JFrame(); 
       theGUI.setTitle("Our First GUI");//adding title of the gui
       theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//ASIGNING CLOSE OPERATOR
       theGUI.setSize(300,200);//sets size of the gui window
       theGUI.setVisible(true);//makes gui visible
       theGUI.setLocationRelativeTo(null);
       theGUI.setResizable(false);
    }
    
}
