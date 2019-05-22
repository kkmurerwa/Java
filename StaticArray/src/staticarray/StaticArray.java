package staticarray;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;



public class StaticArray {
     public void metered(){
         DecimalFormat df=new DecimalFormat("###.00");//Formats double to two decimal places
         double units,charges=0,principal,discou,discount,total,Total;
         int meter=500; 
        
         String Name;
         Name=JOptionPane.showInputDialog("Enter the name of the client");//prompts the name of the client
         units = IntegerInput("Enter the number of units consumed");//calls integerinput method
         if(units<150)
             charges=units*33;
         else{
             charges=(units*30);
     }
        
         principal=charges;
         discou=(double) (principal*0.1);
         total=principal-discou;
         if(units>100){
             Total=(double) (total-(total*0.08)+meter);
         discount=discou+(total*0.08);
         }
         else{
             Total=total;
             discount=discou;
         }
         
         Object[]paying={"Visa","Manual"};
         double ttlAmt=0;
      
        int payment = JOptionPane.showOptionDialog(null,"Choose Payment Method","option",JOptionPane.
                 YES_NO_OPTION,JOptionPane.PLAIN_MESSAGE,null,paying,"Visa");//prompts the client to choose the method of payment
         switch(payment){
             case 0:
                 ttlAmt=Total*0.95;//discount for use of electrical method
                 break;
             case 1:
                 ttlAmt=Total;
                 break;
         }   
       
         
         JOptionPane.showMessageDialog(null,"Kisumu Water Company\nName: "+Name+"\n*Units consumed: "+units+"\nMeter rent: "+meter+
                 "\nDiscount given: "+df.format(discount)+"\nTotal amount:"+df.format(ttlAmt));
    }
   
        
    public void unmetered(){//method for the unmetered clients
        DecimalFormat df=new DecimalFormat("###.00");//Formats double to two decimal places
         double charges=0,principal,discount = 0,Total;
         int units;
         
         String Name;
         Name=JOptionPane.showInputDialog("Enter the name of the client");//prompts the name of the client
         units = IntegerInput("Enter the number of units consumed");
         
         if(units<150)
             charges=units*33;
         else{
             charges=(units*30);
         }
         
         if(units>100){
             discount=(double) (charges*0.08);
             Total = charges-(charges*0.08);
         }
         else
             Total=charges;
          Object[]paying={"Visa","Manual"};
         double ttlAmt=0;
      
        int payment = JOptionPane.showOptionDialog(null,"Choose Payment Method","option",JOptionPane.
                 YES_NO_OPTION,JOptionPane.PLAIN_MESSAGE,null,paying,"Visa");//prompts the client to choose the method of payment
         switch(payment){
             case 0:
                 ttlAmt=Total*0.95;//discount for use of electrical method
                 break;
             case 1:
                 ttlAmt=Total;
                 break;
         }
         
         JOptionPane.showMessageDialog(null,"Kisumu Water Company\nName: "+Name+"\nUnits consumed: "+units+
                 "\nDiscount given: "+df.format(discount)+"\nTotal amount: "+df.format(ttlAmt));
       //this is the final output of the method unmetered
    }
    public static double industry(){//method for the unmetered clients
        DecimalFormat df=new DecimalFormat("###.00");//Formats double to two decimal places
        int meterRent=500;//the amount for the meter rent
        double fixedCons = 2500*30;// monthly subscription for industries
        double total,discount1,discount2,totalD;
        
         String Name;
         Name=JOptionPane.showInputDialog("Enter the name of the client");//prompts the name of the client
         
        total=fixedCons;
        discount1 = total*0.08;
        discount2=(total-discount1+meterRent)*0.09;//discount given for consumption of units above 100 
        totalD=discount1+discount2;//total amount of discounts
        total=total-discount1-discount2+meterRent;
        
         Object[]paying={"Visa","Manual"};
         double ttlAmt=0;
      
        int payment = JOptionPane.showOptionDialog(null,"Choose Payment Method","option",JOptionPane.
                 YES_NO_OPTION,JOptionPane.PLAIN_MESSAGE,null,paying,"visa");
         switch(payment){
             case 0:
                 ttlAmt=total*0.95;
                 break;
             case 1:
                 ttlAmt=total;
                 break;
         }
        JOptionPane.showMessageDialog(null,"Kisumu Water Company\nName: "+Name+
                 "\nDiscount given:\t\t"+df.format(totalD)+"\nTotal amount: "+df.format(total));
        
        return 0; 
    }
   
    public static void main(String[] args) {
        StaticArray obj = new StaticArray();
        obj.caller();
    }
    public void caller(){
        /*I created this method so as to be able to call it from anywhere. I used it to call the 
        *home screen when a user enters a non-integer input in the units used field.
        */
        Object[]options={"Metered","Unmetered","Industry"};
        int choice=JOptionPane.showOptionDialog(null,"Choose your client type","options",JOptionPane.
                YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,null,options,"Metered");
        switch(choice){
            case 0:
                metered();
               break;
            case 1:
                unmetered();
                break;
            case 2:
                industry();
                break;
        }
    }
    public int IntegerInput(String n){
        /*The method below is used to ask the user for integer input, check if its an integer then returns a value
        *to the calling method
        */
        int in;
        String inp = JOptionPane.showInputDialog(n);
        /*Try and catch as used below is used to validate input data. 
        *The data input in this case must be of integer value*/
        try{int test=Integer.parseInt(inp);}
        catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null,"The input is not integer","Error",JOptionPane.ERROR_MESSAGE);
            inp=JOptionPane.showInputDialog("Enter the number of units consumed");
            try{int test=Integer.parseInt(inp);}
            catch (NumberFormatException f)
            {
            JOptionPane.showMessageDialog(null,"The input is not integer","Error",JOptionPane.ERROR_MESSAGE);
            inp=JOptionPane.showInputDialog("Enter the number of units consumed");
                try{int test=Integer.parseInt(inp);}
                catch (NumberFormatException g)
                {
                    JOptionPane.showMessageDialog(null,"YOU HAVE EXHAUSTED THE NUMBER OF TIMES TO ENTER AN INTEGER"
                    +"\n\nYou are being redirected to the home page","Error",JOptionPane.ERROR_MESSAGE);
                    caller();//calls the starting window
                }//end of third try and catch
            }//end of second try and catch
        }//end of first try and catch
        in = Integer.parseInt(inp);
        return in;
    }
}
        
