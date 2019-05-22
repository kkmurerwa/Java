package bankingsystem;

import javax.swing.*;
import java.awt.*;
import java.io.*;

public class BankingSystem extends JFrame{
    public void BankingSystem(){
        setSize(600,400);
        setTitle("Umoja Banking System");
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
    }
    public static void main(String [] args){
        BankingSystem obj = new BankingSystem();
        obj.BankingSystem();
        JPanel pan = new JPanel();
        pan.setLocation(0,0);
        pan.setSize(600,50);
        JLabel lab1 = new JLabel("Select Your Account Type");
        lab1.setFont(new Font("",Font.BOLD,20));
        pan.add(lab1,BorderLayout.CENTER);
        obj.add(pan);
        JPanel pan2 = new JPanel();
        JPanel pan3 = new JPanel();
        JButton b1 = new JButton("Savings Account");
        b1.setPreferredSize(new Dimension(200,50));
        JButton b2 = new JButton("FIXED DEPOSIT");
        b2.setPreferredSize(new Dimension(200,50));
        pan2.setLocation(0,50);
        pan2.setSize(600,100);
        pan3.setLocation(0,50);
        pan3.setSize(600,100);
        pan2.add(b1,BorderLayout.CENTER);
        pan3.add(b2,BorderLayout.CENTER);
        obj.add(pan2);
        obj.add(pan3);
    }
    public void window1(){
        BankingSystem obj = new BankingSystem();
        obj.BankingSystem();
        JPanel pan = new JPanel();
        pan.setLocation(0,0);
        pan.setSize(600,100);
        pan.setBackground(Color.red);
        obj.add(pan);
    }
    public void window2(){
        BankingSystem obj = new BankingSystem();
        obj.BankingSystem();
        JPanel pan = new JPanel();
        pan.setLocation(0,0);
        pan.setSize(600,100);
        pan.setBackground(Color.blue);
        obj.add(pan);
    }
}