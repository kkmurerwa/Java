package stranger;

import java.awt.*;//imports the java.awt library to allow functions like fonts and dimensions
import javax.swing.*;//imports javax.swing library

public class Stranger
{
    public static void main(String [] args)
    {
        /*The method below, main method, contains details for a frame(mainFrame),3 containers(top,middle,bottom)
        and various elements attached to the container such as labels, a logo and control buttons.
        The main method also handles actions on button-press and calls upon the relevant method to carry out preferred
        operations.*/
        JFrame mainFrame=new JFrame("KISUMU WATER COMPANY");
        //the statements below are used to build top panel
        JPanel top=new JPanel();//creates panes
        JLabel imgLabel;//=new JLabel(new ImageIcon("/kisumu3.png"));
        imgLabel=new JLabel(new ImageIcon("D:\\Gallery\\Design Tools\\kisumu3.png"));
        imgLabel.setVisible(true);
        imgLabel.setPreferredSize(new Dimension(400,280));//sets size for logo label
        top.add(imgLabel,BorderLayout.NORTH);//adds logo on the north of the pane
        top.setSize(200,400);//sets size of top panel
        //the statements below are used to build middle panel
        JPanel middle=new JPanel();//creates middle panel
        JButton met=new JButton("METERED");//creates button for metered clients
        JButton unmet=new JButton("UNMETERED");//creates button for unmetered clients
        JLabel label1=new JLabel("SELECT THE TYPE OF CLIENT");//creates label to prompt user input
        label1.setFont(new Font("Cooper Black",Font.BOLD,20));//sets font type and size for the label
        middle.add(label1,BorderLayout.NORTH);//adds the label to panel
        JButton industry=new JButton("INDUSTRY");//creates button for industry clients
        industry.setPreferredSize(new Dimension(150,50));//sets button size
        met.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Metered();
            }//sets action to be performed if a button is pressed
        });
        unmet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnMetered();
            }//sets action to be performed if a button is pressed
        });
        industry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Industry();
            }//sets action to be performed if a button is pressed
        });
        middle.add(met);//adds button to panel
        met.setPreferredSize(new Dimension(150,50));//sets size of button
        middle.add(unmet);//adds button to panel
        unmet.setPreferredSize(new Dimension(150,50));//sets button size
        middle.add(industry,BorderLayout.SOUTH);//sets button location in panel
        //the statements below are used to build bottom panel
        JPanel bottom=new JPanel();
        JButton close=new JButton("EXIT");
        close.setPreferredSize(new Dimension(400,50));
        bottom.add(close,BorderLayout.SOUTH);
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit();//Sets an action listener that calls on Close button if pressed
            }
        });
        close.setBackground(Color.cyan);
        mainFrame.add(middle,BorderLayout.CENTER);//adds panel to frame
        mainFrame.add(bottom,BorderLayout.SOUTH);//adds panes to frame
        mainFrame.add(top,BorderLayout.NORTH);//adds panel to frame
        mainFrame.setSize(450,550);//sets frame size
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exits if close button is pressed
        mainFrame.setLocationRelativeTo(null);//sets frame at middle of screen
        mainFrame.setVisible(true);//makes frame visible
    }//end of main method
    public static void Exit()
    {
        System.exit(0);//exits if exit button is pressed
    }//end of method exit
    public static void Metered()
            /*called if button Metered is pressed
            The method then calcates the fees payable and outputs it*/
    {
        int Units=Input();
        double fee;
        double discount;
        if (Units>=150)//calculates fee for units exceeding 149
        {
            fee=33*149+(Units-149)*30;
            if (Units>100)
                discount=0.08*(fee-100*33);
            else
                discount=0;
        }//end of if statement
        else//calculates fee for units not exceeding 149
        {
            fee=Units*33;
            if (Units>100)
                discount=0.08*(fee-100*33);//initializes variable discount
            else
                discount=0;//initializes variable discount
        }
        discount+=0.1*fee;//adds new discount to previous discount value
        Output1((fee-discount));
        int paymethod=Card();//asks user for payment option by calling mathod
        switch (paymethod)
        {
            case 0:
                discount+=0.05*fee;
                fee-=discount;
                Output(fee,500);//calls output method and passes output values
                break;
            case 1:
                fee-=discount;
                Output(fee,500);//calls output method and passes output values
                break;
            default:
                System.exit(0);
        }
    }//end of method metered
    public static void UnMetered()
            /*The method below is called when button UnMetered is pressed.
            It calculates and outputs fee payable*/
    {
        int Units=Input();
        double fee;
        double discount;
        if (Units>=150)
        {
            fee=33*149+(Units-149)*30;
            if (Units>100)
                discount=0.08*(fee-100*33);
            else
                discount=0;
        }//end of if statement
        else
        {
            fee=Units*33;
            if (Units>100)
                discount=0.08*(fee-100*33);
            else
                discount=0;
        }
        Output1((fee-discount));
        int paymethod=Card();
        switch (paymethod)
        {
            case 0:
                discount+=0.05*fee;
                fee-=discount;
                Output(fee,0);//calls output method and passes output values
                break;
            case 1:
                fee-=discount;
                Output(fee,0);//calls output method and passes output values
                break;
            default:
                System.exit(0);
        }
    }//end of method unmetered
    public static void Industry()
            /*This method is called if Industry button is pressed
            It calculates and outputs fees payable*/
    {
        int Units=2500;
        double discount, fee;
        fee=149*33+(Units-149)*30;
        discount=0.09*2500;
        discount+=0.08*(2500-100*33);
        Output1((fee-discount));
        int paymethod=Card();
        switch (paymethod)
        {
            case 0:
                discount+=0.05*fee;
                fee-=discount;
                Output(fee,500);
                break;
            case 1:
                fee-=discount;
                Output(fee,500);
                break;
            default:
                System.exit(0);
        }//end of switch
    }//end of method industry
    public static void Output(double fee,int metfee)//calls output method and passes output values
            /*Called for to output bill and meter fees*/
    {
        JOptionPane.showMessageDialog(null,"WATER BILL PAYABLE : " +fee 
                +"\nMETER RENT : " +metfee +"\nTOTAL AMOUNT PAYABLE : " +(fee+metfee));
    }//end of method output
    public static void Output1(double fee)
            /*Called for to output bill before user can select paymen method*/
    {
        JOptionPane.showMessageDialog(null,"YOUR CURRENT WATER BILL IS : " +fee 
                +"\nClick OK to continue");
    }//end of method output
    public static int Input()
            /*Called upon to ask for user input then passes it on to the calling program*/
    {
        int units;
        String UNITS=JOptionPane.showInputDialog("Enter the number of units consumed");
        /*Try and catch as used below is used to validate input data. 
        *The data input in this case must be of integer value*/
        try{int test=Integer.parseInt(UNITS);}
        catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null,"The input is not integer","Error",JOptionPane.ERROR_MESSAGE);
            UNITS=JOptionPane.showInputDialog("Enter the number of units consumed");
            try{int test=Integer.parseInt(UNITS);}
            catch (NumberFormatException f)
            {
            JOptionPane.showMessageDialog(null,"The input is not integer","Error",JOptionPane.ERROR_MESSAGE);
            UNITS=JOptionPane.showInputDialog("Enter the number of units consumed");
                try{int test=Integer.parseInt(UNITS);}
                catch (NumberFormatException g)
                {
                    JOptionPane.showMessageDialog(null,"YOU HAVE EXHAUSTED THE NUMBER OF TIMES TO ENTER AN INTEGER"
                    + "\nSYSTEM WILL NOW EXIT","Error",JOptionPane.ERROR_MESSAGE);
                    Exit();
                }//end of third try and catch
            }//end of second try and catch
        }//end of first try and catch
        units=Integer.parseInt(UNITS);
        return units;
    }//end of method input
    public static int Card()
            /*Called upon to ask user for payment method to be used
            It then returns the option to the calling program*/
    {
        Object [] options={"VISA CARD","CASH"};//creates object to be called upon by JOptionPane
        int response=JOptionPane.showOptionDialog(null,"Select Your Payment Method\n"
                + "You will get 5% discount for using a Visa card",
                "PAYMENT WINDOW",JOptionPane.DEFAULT_OPTION,JOptionPane.OK_CANCEL_OPTION,null,options,options[0]);
        return response;
    }//end of method card
}//end of main class

