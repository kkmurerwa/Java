package jumble;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//@MurerwaApps

public class Jumble{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        String [] panb = {"pan","nap","nab","ban"};
        System.out.println("Use the following letters to make words\n panb"
         +"\nType close to exit");
        List  <String> temp = new ArrayList();
        
        int scores = 0;
        for (int b = 0; b<panb.length;b++){
            temp.add(panb[b]);
        }
        for(int a = 0; a<10;a++){
            String n = scan.next();
            boolean found = false;
            if (n.equals("close")){
                System.exit(0);
            }
            for (int i = 0; i<(temp.size());i++){
                if (n.equals(temp.get(i))){
                    scores += 1;
                    System.out.println("Congrats. Your new Score is " +scores);
                    temp.remove(i);
                    found = true;
                    System.out.println(temp);
                }
            }
            if (found == false){
                System.out.println("Word not found");
            }
        }
    }
}