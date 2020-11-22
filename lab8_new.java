import java.util.Scanner;
import java.util.*;

public class lab8_new {

	   public static void main(String[] args) 
	    { 
		   
	    	   StringBuilder sb = new StringBuilder();
	    	  sb.append("mytarget");
	    	  
	    	  String[] s1 = {"kdzmy","myta","etmy","ytarg"};
	    	  String[] s2 = {"ym","r","ta","yta","xltm","etc"};
	    	  String[] s3 = {"getap","rg","e","tarz"};
	    	  
	    	  ArrayList<String> al2 = new ArrayList<String>();
	    	  
	    	for(int  i = 0; i < sb.length(); i++) 
	    	{  
	    	  String input = sb.toString();	    	  
	    	  String s =Character.toString(sb.charAt(0));
	    	  sb.deleteCharAt(0);	    	 
	    	  String remaining = sb.toString();
	    	  String output  = remaining+s;
	    	  al2.add(output);
	          sb = new StringBuilder(output);
	    	} 
	    	
	    	System.out.println(al2);
	    	ArrayList<String> al3 = new ArrayList<String>();
	    	
	    	for(int  i = 0; i < s1.length; i++) {
	    		for(int  j = 0; j < s2.length; j++) {
	    			for(int  k = 0; k < s3.length; k++) 
	    			{
	    				String temp =  s1[i]+s2[j]+s3[k];
	    				al3.add(temp);
	    				String temp2 = s2[j]+s1[i]+s3[k];
	    				al3.add(temp2);
	    				String temp3 = s3[k]+s2[j]+s1[i];
	    				al3.add(temp3);
	    				String temp4 = s1[i]+s3[k]+s2[j];
	    				al3.add(temp4);
	    				String temp5 = s2[j]+s3[k]+s1[i];
	    				al3.add(temp5);
	    				String temp6 = s3[k]+s1[i]+s2[j];
	    				al3.add(temp6);
	    						
	    				}
	    			}
	    		}
	    	ArrayList<String> output = new ArrayList<String>();
	    	System.out.println(al3);
	    	
	    	for(int  i = 0; i < al3.size(); i++)
	    	{
	    		for(int  j = 0; j < al2.size(); j++) 
	    		{
	    			if(al3.get(i).contains(al2.get(j))) 
	    			{
	    				output.add(al3.get(i));
	    			}
	    			else 
	    			{
	    			continue;	
	    			}
	    		}
	    	}
	    	
	    	System.out.println(output);
	    	
	    	//Print permutations
	    	
	    	
	    	
	    	
	    	
	    	
	    	}
	   	   
	    	   
	    }
