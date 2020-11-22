

import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class validpar {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int inputnum = Integer.parseInt(sc.nextLine());
		ArrayList<String> al3 = new ArrayList<String>();

		for (int k = 0; k < inputnum; k++) {

			String test = sc.nextLine();
			Stack<Character> stack = new Stack<Character>();
		    for (int i = 0; i < test.length(); i++) {
		      if (test.charAt(i) == '(' || test.charAt(i) == '[' || test.charAt(i) == '{') {
		        stack.push(test.charAt(i));
		      }else if (test.charAt(i) == ')') {
		        if (!stack.empty()) {
		          if (stack.peek() == '(') {
		            stack.pop();
		          }else {
		          stack.push(test.charAt(i));
		        }
		        } else {
		          stack.push(test.charAt(i));
		        }
		      }else if (test.charAt(i) == ']') {
		        if (!stack.empty()) {
		          if (stack.peek() == '[') {
		            stack.pop();
		          }else {
		          stack.push(test.charAt(i));
		        }
		          
		        } else {
		          stack.push(test.charAt(i));
		        }
		      }else if (test.charAt(i) == '}') {
		        if (!stack.empty()) {
		          if (stack.peek() == '{') {
		            stack.pop();
		          }else {
		          stack.push(test.charAt(i));
		        }
		        } else {
		          stack.push(test.charAt(i));
		        }
		      }
		      
		    }
		    if (stack.size() == 0) {
		      al3.add("TRUE");
		    } else {
		    	al3.add("FALSE");
		    }

		}
		
        for(String ssss : al3) {
        	System.out.println(ssss);
        }
		
	}

}

/*
 * 
 * 4 ((){}[()]) (){}[()]) ()[()] ((){}()])
 */
