package polymorphism;

public class SavingsAccount extends PolyMorphism{
    public void process(){
        Printer("Select the process you want to perform", "Deposit","Withdraw","Check Balance");
        int sel = Input();
        if (sel==1){
            Printer("Enter the amount to deposit");
            int dep = Input();
            Printer("You have made a deposit of " +dep +"Ksh");
        }
    }
    public void FixedDeposit(){
        Input();
        
}
    @Override
    public int Input(){
        System.out.println("Select a process");
        
       int l = scan.nextInt();
       return l; 
    }
}
