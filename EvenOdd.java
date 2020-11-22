import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;


public class EvenOdd {

	public static void main(String args[]) {
		
	Scanner sc = new Scanner(System.in);
	String s  = sc.nextLine();
	HashMap<Character,Integer> hm = new HashMap<>();
	HashSet<Integer> hs = new HashSet<>();
	int count=0;

	
	for (int i = 0; i < s.length(); i++) 
		hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i)+1, 1));
//        hm.put(s.charAt(i),  
//        hm.get(s.charAt(i)) == null ? 1 :  
//        hm.get(s.charAt(i)) + 1); 
//	
	for(HashMap.Entry<Character,Integer> entry : hm.entrySet() ) {
		hs.add(entry.getValue());
		}
	
	
	for(Integer a:hs) {
		if(a%2==0) {count=count+1;}//even=true;}
		//else {even=false;}
		
	}
	//System.out.println(al);
	//System.out.println(count);
	
	if(count==hs.size()) {System.out.println("Even");}
	else if(count>=1 && count!=hs.size()) {System.out.println("Nothing");}
	else {System.out.println("Odd");}
		//System.out.println(hm);
		//System.out.println(hs);
	}
	
	
}
