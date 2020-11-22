import java.util.Scanner;
import java.util.*;

public class Patternmatching_isomorphic {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String[] ss = sc.nextLine().split(" ");
		ArrayList<String> al = new ArrayList<String>();
		for (String sss : ss) {
			al.add(sss);
		}

		String p = sc.nextLine();
        ArrayList<String> result = new ArrayList<String>();
		for (int i = 0; i < al.size(); i++) {
			HashMap<Character, Character> hmap = new HashMap<Character, Character>();
			String temp = al.get(i);
			int count  = 0;
			for (int j = 0; j < temp.length(); j++) 
			{
				if (hmap.containsKey(temp.charAt(j))) {
                       if(hmap.get(temp.charAt(j)) == p.charAt(j) ) 
                       {
                    	   continue;
                       }
                       else 
                       {
                    	count++; 
                    	break;
                       }
				}

				else {
					if (!hmap.containsValue(p.charAt(j))) {
						hmap.put(temp.charAt(j), p.charAt(j));
						continue;
					}

					else {
						count++;
						break;
					}
				}
				
				
			}
			
			if(count == 0) 
			{
				result.add(al.get(i));
			}
		}
		
		System.out.println(result);

	}

}
