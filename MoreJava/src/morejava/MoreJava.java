package morejava;
import java.awt.*;
import javax.swing.*;

public class MoreJava  extends JFrame {
    private JPanel pan;
    private JButton bt;
    
    public void Gui(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,400);
        setLocationRelativeTo(null);
        setVisible(true);
        
        pan = new JPanel();
        pan.setBackground(Color.red);
        
        bt = new JButton("New Window");
        
        pan.add(bt,BorderLayout.CENTER);
        add(pan);
}
    public static void main(String [] args){
        MoreJava obj = new MoreJava();
        obj.Gui();
    }
}