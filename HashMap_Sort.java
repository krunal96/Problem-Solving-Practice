
	import java.util.*; 
	import java.lang.*; 
	import java.util.Collections;
import java.util.Map.Entry;
	  
public class HashMap_Sort{
	
	public static void main(String args[]) {
		   Scanner sc = new Scanner(System.in);
		  String input = sc.nextLine();
    		HashMap<Character, Integer> hm = new HashMap<>();
    		
    		for(int  i = 0; i < input.length(); i++) {
    			
    			hm.put(input.charAt(i), hm.getOrDefault(input.charAt(i), 0) + 1 );
    			
    		}
    		
    		//System.out.println(hm);
    		
    		StringBuffer sb = new StringBuffer();
    		List<Map.Entry<Character, Integer>> hmapList = new ArrayList<Map.Entry<Character, Integer>>(hm.entrySet());
    		
    		Collections.sort(hmapList, new Comparator<Map.Entry<Character, Integer>>(){

				@Override
				public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
					// TODO Auto-generated method stub
					return o2.getValue() - o1.getValue();
				}
    				
    		});
    		
    		
    		System.out.println(hmapList);
    		for(int i = 0; i < hmapList.size(); i++) {
    			for(int  j = 0 ; j < hmapList.get(i).getValue(); j++) {
    				
    				sb.append(hmapList.get(i).getKey());
    			}
    			
    			//System.out.println(sb.toString());
    			
    			
    		}
    			
    		System.out.println(sb.toString());	
    			
    			
    		}
    		
    		
		
		
		
		
	}

	


