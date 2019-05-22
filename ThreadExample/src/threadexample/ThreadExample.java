package threadexample;


class Hi extends Thread{
    public void run(){
        for (int i = 1;i<=5;i++){
            System.out.println("Hi");
            try { Thread.sleep(1000);} catch(Exception e){}
        }
    }
}
class Hello implements Runnable{
    public void run(){
        for (int i = 1;i<=5;i++){
            System.out.println("Hello");
            try { Thread.sleep(1000);} catch(Exception e){}
        }
    }
}
public class ThreadExample{
    public static void main(String [] args){
        Hi obj1 = new Hi();
		obj1.start();
        Hello obj2 = new Hello();
        Thread t2 = new Thread(obj2);
        try { Thread.sleep(10);} catch(Exception e){}
        t2.start();
    }
}