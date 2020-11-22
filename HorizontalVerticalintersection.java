import java.util.ArrayList;
import java.util.Scanner;
public class HorizontalVerticalintersection {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String[] s = s1.split(" ");
		
		int totalv = Integer.parseInt(s[0]);
		int totalh = Integer.parseInt(s[1]);
		
		 
		ArrayList<ArrayList<Integer>> horlist2 = new ArrayList<ArrayList<Integer>>(); 
		
		ArrayList<ArrayList<Integer>> vertlist2 = new ArrayList<ArrayList<Integer>>(); 
		for(int  i = 0; i < totalv; i++) 
		{  
			ArrayList<Integer> vertlist = new ArrayList<Integer>();
			String[] tempv = sc.nextLine().split(" ");
			for(String ss : tempv) {
				vertlist.add(Integer.parseInt(ss));
			}
			
			vertlist2.add(vertlist);
		}
		
		for(int  i = 0; i < totalh; i++) 
		{
			ArrayList<Integer> horlist = new ArrayList<Integer>();
			String[] temph = sc.nextLine().split(" ");
			for(String ss : temph) {
				horlist.add(Integer.parseInt(ss));
			}
			
			horlist2.add(horlist);
		}
		int count = 0;
		
		for(int i = 0 ; i < vertlist2.size() ; i++) 
		{
			ArrayList<Integer> v =vertlist2.get(i);
			
			for(int  j = 0; j < horlist2.size(); j++) 
			{
				ArrayList<Integer> h =horlist2.get(j);
				
				if((h.get(0) >= v.get(1) || h.get(0) >= v.get(2)) && ( v.get(0) >= h.get(1) || v.get(0) >= h.get(2))) 
				{
					//System.out.println("here");
					count++;
				}
							
			}
		}
		System.out.println(count);
		
		
	}

}
