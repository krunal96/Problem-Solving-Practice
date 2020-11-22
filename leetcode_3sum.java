import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner; 

public class leetcode_3sum { 
	
       public static void main(String[] args) 
    { 
       Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();
       String ss[] = s.split(", ");
       ArrayList<Integer> al = new ArrayList<Integer>();
       for(String sss : ss) {
    	   al.add(Integer.parseInt(sss));
       }
       System.out.println(al);
       ArrayList<ArrayList<Integer>> al2 = new ArrayList<ArrayList<Integer>>();
       
       
       
       int n = al.size();
       int op = (int)Math.pow(2, n);
      
       
       for( int  counter = 1; counter < op; counter++) 
       {
    	  ArrayList<Integer> temp = new ArrayList<Integer>();
    	  for(int  j = 0; j < n; j++) 
    	  {
	   		  if (BigInteger.valueOf(counter).testBit(j))
	   		  {
	   			  temp.add(al.get(j));   		 
	  		  }
          }
    	  
    	  al2.add(temp);	   
       }
       
       
       
       System.out.println(al2);
       HashSet<Integer> sumal2 = new HashSet<Integer>();
       
       for(int  i = 0; i < al2.size() ; i++)
       {
    	   int sum = 0;
    	   for(int j = 0; j <al2.get(i).size(); j++) 
    	   {
    		   sum = sum + al2.get(i).get(j);
    	   }
    	   
    	   sumal2.add(sum);
       }
       
       
       System.out.println(sumal2);
//       ArrayList<Integer> sumal = new ArrayList<Integer>(sumal2);
//       Collections.sort(sumal);
//       int count  = 0;
//       
//       for(int i = 0, j = 0; i < Collections.max(sumal) && j <  sumal.size(); i++, j++) 
//       {
//    	 
//             
//    	   if(i+1 == sumal.get(j)) 
//    	   {
//    	    count++;
//    		continue;  
//    		
//    	   }
//    	   else 
//    	   {
//    		   System.out.println(i+1);
//    		   break;
//    	   }
//    	   
//       }
//       
//       if(count == sumal.size()) 
//       {
//    	   System.out.println(sumal.size()+1);
//       }
//       
    }
}
       

