import java.util.Scanner;
import java.util.*;
public class UniqueWordCount {
	
public static void main(String args[]) {	
Scanner sc = new Scanner(System.in);
String input = sc.nextLine();
String[] s = null;
    if(input.length() == 0) 
    {
	System.out.println("0");
    }
	else 
	{
		 String temp = input.replaceAll("\\s+", "");
		 System.out.println(temp);
		 s = temp.split(" ");
		 
	}
    
    HashSet<String> hs  = new HashSet<String>();
    for(String ss : s) {
    	
    	hs.add(ss.toLowerCase());
    }
    
    System.out.println(hs.size());

}	
	
}
