import java.util.*;
import java.util.Scanner;

public class lab5 {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		String s  = sc1.nextLine();
		String t  = sc1.nextLine();
		//char[] sc = s.toCharArray();
		//char[] tc = t.toCharArray();
		
		
		if(s == null || s.length() < t.length() || s.length() == 0){
	        System.out.println("");
	    }
	    HashMap<Character,Integer> map = new HashMap<Character,Integer>();
	    for(char c : t.toCharArray()){
	        if(map.containsKey(c)){
	            map.put(c,map.get(c)+1);
	        }else{
	            map.put(c,1);
	        }
	    }
	    
	    
	    int j = 0;
	    int minLeft = 0;
	    int minLen = s.length()+1;
	    int count = 0;
	    for(int i = 0; i < s.length(); i++){
	        if(map.containsKey(s.charAt(i))){
	            map.put(s.charAt(i),map.get(s.charAt(i))-1);
	            if(map.get(s.charAt(i)) >= 0)
	            {
	                count ++;
	            }
	            while(count == t.length()){
	                if(i-j+1 < minLen){
	                    minLeft = j;
	                    minLen = i-j+1;
	                }
	                if(map.containsKey(s.charAt(j))){
	                    map.put(s.charAt(j),map.get(s.charAt(j))+1);
	                    if(map.get(s.charAt(j)) > 0){
	                        count --;
	                    }
	                }
	                j ++ ;
	            }
	        }
	    }
	    if(minLen>s.length())  
	    {  
	    	System.out.println("");  
	    }  
	    System.out.println(s.substring(minLeft,minLeft+minLen));
	    
	}
	
		
	}
	
	
	

