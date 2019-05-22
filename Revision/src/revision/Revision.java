package revision;
import java.util.*;
public class Revision{
	public static void main(String [] ar){
		/*Create a program that finds prime numbers between 
		*0 to 100 and adds them to a dynamic array
		*/
		double n;
		List <Integer> m = new ArrayList<>();//create a dynamic list
		for(int i = 0;i<100;i++){
			if (i==2){
				m.add(i);//add primes to dynamic array
				continue;
			}
			n = Math.pow(2,(i-1));
			if (n%i==1){
				m.add(i);
			}
		}
		System.out.println(m.toArray());
	}
}