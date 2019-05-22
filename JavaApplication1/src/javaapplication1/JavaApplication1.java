package javaapplication1;

//@MurerwaApps

public class JavaApplication1{
    public static void main(String [] args){
        Second sc = new Second();
        Third tr  = new Third();
        sc.second();
        sc.second("Kenneth");
        tr.second();
        tr.second("Murerwa");
        char  arrChar [][] = new char [10][5];
        arrChar [0][0] = 'c';
    }
}
class Second{
    public void second(){
        System.out.println("I have no fucking name");
    }
    public void second(String name){
        System.out.println("My name is " +name);
    }
}
class Third extends Second{
    
}