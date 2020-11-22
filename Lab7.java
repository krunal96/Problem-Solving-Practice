import java.util.Scanner;
import java.util.*;

public class Lab7 {
public static void main(String args[]) 
{
    Scanner sc = new Scanner(System.in);
    int  input  = Integer.parseInt(sc.nextLine());
    ArrayList<ArrayList<String>> al2 = new ArrayList<ArrayList<String>>();
    
    for(int i = 0; i < input ; i++) {
    	String[] ss = sc.nextLine().split(",");
    	ArrayList<String> al = new ArrayList<String>();
    	for(String s : ss) {
    		al.add(s);
    	}
    	
    	al2.add(al);
    }
    System.out.println(al2);
 
    if(al2.size() == 2)
  {
       for(int i = 0; i < al2.get(0).size() ;i++) 
       {
    	   for(int j = 0; j < al2.get(1).size(); j++) 
    	   {
    		   
    	   }
       }
    
    }
    
    
    
    
    
    
    
    
    
    
    else if(al2.size() == 3) {
    	
    }
    else if(al2.size() == 4) {
    	
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

}
