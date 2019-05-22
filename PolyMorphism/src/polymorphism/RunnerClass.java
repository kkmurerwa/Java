package polymorphism;

public class RunnerClass extends SavingsAccount {
    public static void main (String [] args){
        PolyMorphism pm =  new PolyMorphism();
        SavingsAccount sa = new SavingsAccount();
        String com = "Select Your Account Type";
        pm.Printer(com,"SAVINGS ACCOUNT", "FIXED DEPOSIT ACCOUNT", "CURRENT ACCOUNT");
        int sel = pm.Input();
        if (sel==1){
            sa.process();
        }
        else if (sel==2){
            sa.FixedDeposit();
        }
    }
}
