package overloadingfunction;
import java.util.Scanner;
public class OverloadingFunction {
    public double letaArea(double length, double width){
        return length*width;
    }
    public double letaArea(double length){
        return length*length;
    }
    public double letaArea(int length){
        return length*5;
    }
    public double letaArea(){
        final double pi=3.142;
        Scanner scan = new Scanner(System.in);
        int radius = 5;
        return radius*pi;
    }
    public void chora(){
        System.out.println("******************************");
    }
      
}


