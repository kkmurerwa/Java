package solution;
import java.util.Scanner;
public class Solution{
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        int a,b,n,q,sum,j;
        q = in.nextInt();
        for (int k = 0;k<q;k++){
            sum = 0;
            j = 1;
            a = in.nextInt();
            b = in.nextInt();
            n = in.nextInt();
            for (int i = 1;i<=n;i++){
                sum += j*b;
                System.out.print(sum+a);
                System.out.print(" ");
                j*=2;
            }
            System.out.println();
        }
    }
}