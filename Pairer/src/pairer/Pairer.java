package pairer;
import java.util.ArrayList;
import java.util.Scanner;
//This program asks the user to input a number and returns the sum asked for by the user
public class Pairer{
    public static void main (String [] args){
        int sum,targ,len,num;
        Scanner scan = new Scanner(System.in);
        ArrayList <Integer> arl =  new ArrayList<Integer>();//creates an arraylist to store found values
        System.out.println("Enter the length of the array");
        len = scan.nextInt();
        int emptyArray [] = new int [len];//creates a blank array using the constant input by the user
        for (int i = 0;i<len;i++){
            System.out.println("Enter element " +(i+1) +" of the array");//asks the user for element by element of the array
            emptyArray[i] = scan.nextInt();//adds input to the array
        }
        System.out.println("Enter the sum you intend to get");
        targ = scan.nextInt();
        for (int j = 0;j<len;j++){
            for (int k = 0;k<len;k++){
                sum = emptyArray[j]+emptyArray[k];
                if (sum == targ){
                    arl.add(emptyArray[j]);//adds the numbers found to a dynamic array
                    arl.add(emptyArray[k]);
                }
            }
        }
        if (arl.isEmpty()){//outputs on instances when the arrayList contains no values
            System.out.println("No match");
            System.exit(0);
        }
        else{//outputs when the arrayList contains values
            System.out.println("The numbers that add up to " +targ +" are :");
            for (int i = 0;i<arl.size()/2;i++){
            num = arl.get(i);//retreives the number from the arraylist
            System.out.print(num);
            if (i%2 != 0){
                System.out.println("");
            }
            else{
                System.out.print(",");
            }
        }
        }
    }
}