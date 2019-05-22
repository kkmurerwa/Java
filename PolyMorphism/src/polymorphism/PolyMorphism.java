package polymorphism;
import java.util.Scanner;

public class PolyMorphism{
    public Scanner scan = new Scanner(System.in);
    
    public void Printer(String command,String a,String b,String c){
        System.out.println(command +"\n1." +a +"\n2." +b +"\n3."+c);
    }
    public void Printer(String command,String a,String b){
        System.out.println(command +"\n1." +a +"\n2." +b);
    }
    public void Printer(String command,int a){
        System.out.println(command +"\n1." +a);
    }
    public void Printer(String command){
        System.out.println(command);
    }
    public int Input(){
        int sel;
        sel = scan.nextInt();
        return sel;
    }
}