
import java.util.*; 
  
public class PutIfAbsent { 
  
    // Main method 
    public static void main(String[] args) 
    { 
  
        // create a HashMap and add some values 
//        HashMap<String, Integer> map 
//            = new HashMap<>(); 
//        map.put("a", 10000); 
//        map.put("b", 55000); 
//        map.put("c", 44300); 
//        map.put("e", 53200); 
//  
//        // print original map 
//        System.out.println("HashMap:\n "
//                           + map.toString()); 
//  
//        // put a new value which is not mapped 
//        // before in map 
//        map.putIfAbsent("e", 77633); 
//  
//        // print newly mapped map 
//        System.out.println("New HashMap:\n "
//                           + map); 
//        
        
        
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        String st = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String str = s.replaceAll("[^a-z]","");
        System.out.println(s);
        System.out.println(st);
        System.out.println(str);
        
        
} 
}