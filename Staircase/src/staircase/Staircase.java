package staircase;
import java.util.Scanner;

public class Staircase{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int n,count=0;
        System.out.println("Enter the number of stairs in the staircase");
        n =  scan.nextInt();
        for (int j=0;j<n;j++){
            for (int k=0;k<n-count-1;k++){
                System.out.print(" ");
            }
            for  (int l=0;l<=j;l++){
                System.out.print("#");
            }
            System.out.println("");
            count++;
        }
    }
} 