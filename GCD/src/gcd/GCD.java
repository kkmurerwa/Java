package gcd;
import java.util.Scanner;//imports scanner class for keyboard input
public class GCD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x,y,c;
        System.out.println("Enter two integers to find their GCD\nEnter the first number");
        x = scan.nextInt();
        System.out.println("Enter the second number");
        y = scan.nextInt();
        if (x>y){
            if(x%y==0){
                System.out.println("The GCD of the numbers is " +y);
            }
            else{
                while(y!=0){
                    /*The loop below Employs Euclid's Formula to get GCD. For Example given two numbers
                    24 and 18 and you are told to find GCD, you divide 24 by 18. It gives 1 Rem 6.
                    Now you divide 18(your second number) by the remainder 6. If the answer is 0,
                    you use the remainder in the previous loop, in this case, 6.
                    */
                    c = x%y;
                    x = y;
                    y = c;
                }
                System.out.println("The GCD of the numbers is " +x);
            }
        }
    }
    
}
