package overloadingfunction;

public class RunnerClass {
    public static void main(String[] args) {
        OverloadingFunction ovf = new OverloadingFunction();
        SecondClass sc = new SecondClass();
        double l,w;
        ovf.chora();
        System.out.println("the area of the rectangle is: \t" 
                +ovf.letaArea(40.54,76.67));
        System.out.println("the area of the square is: \t"
                +ovf.letaArea(93.25));
        System.out.println("the area of a circle is: \t"
                +ovf.letaArea());
        System.out.println("This is the end of method overloading. "
                + "\nThe next part contains inheritance");
        ovf.chora();
        sc.ujinga();
    }
    
}
