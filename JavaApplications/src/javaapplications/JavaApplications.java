package javaapplications;
import javax.swing.*;
import java.awt.*;

public class JavaApplications {
    private JFrame f;//creates a frame using the swing.Jframe class
    private JPanel p;//creates a panel
    private JButton b1;//creates button
    private JLabel lab;//creates a label
    
    
    public void gui(){
        f = new JFrame("Creativity tuts");
        f.setVisible(true);
        f.setSize(600,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        
        p = new JPanel();
        p.setBackground(Color.BLUE);
        
        b1 = new JButton("Test");
        lab = new JLabel("This is a test Label");
        
        p.add(b1);
        p.add(lab);
        
        f.add(p,BorderLayout.SOUTH);
    }
    public static void main(String[] args) {
        JavaApplications obj = new JavaApplications();
        obj.gui();
    }
    
}
