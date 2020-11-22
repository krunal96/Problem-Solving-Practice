import java.io.*;
import java.util.*;

public class Lab3 {
  public static void main(String[] args) {
    Scanner sc_in = new Scanner(System.in);
    int lines= sc_in.nextInt();
    String input="";
    sc_in.nextLine();
    for(int i=0; i<lines;i++)
    {
      input += " " + sc_in.nextLine();
    }
    int ngram = sc_in.nextInt();
    if(ngram< 1 || ngram> 3)
      return;
    StringTokenizer s = new StringTokenizer(input," .,\n\r\t");
    HashMap<String, Integer> huni = new HashMap<>();
    System.out.println(input);
    switch(ngram)
    {
      case 1:
        while(s.hasMoreTokens()){
          String tk = s.nextToken();
          for(int i = 0; i< tk.length(); i++){
            if(huni.containsKey(Character.toString(tk.charAt(i)))){
              int val = huni.get(Character.toString(tk.charAt(i)));
              huni.put(Character.toString(tk.charAt(i)), val + 1);
            }else{
              huni.put(Character.toString(tk.charAt(i)), 1);
            }
          }
        }
        
        Iterator it = huni.entrySet().iterator();
        int max = 0;
        String maxs = "";
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            
            // System.out.println(pair.getKey() + " = " + pair.getValue());
            // it.remove(); // avoids a ConcurrentModificationException
            if(max < (int)pair.getValue()){
              max = (int)pair.getValue();
              maxs = (String)pair.getKey();
            }
            if(max == (int)pair.getValue()){
              if(maxs.compareTo((String)pair.getKey()) > 0){
                max = (int)pair.getValue();
                maxs = (String)pair.getKey();
              }
            }
        }
        System.out.print("Unigram "+maxs);
        break;
      case 2:
        while(s.hasMoreTokens()){
          String tk = s.nextToken();
          for(int i = 0; i< tk.length() - 1; i++){
            if(huni.containsKey(tk.substring(i, i+2))){
              int val = huni.get(tk.substring(i, i+2));
              huni.put(tk.substring(i, i+2), val + 1);
            }else{
              huni.put(tk.substring(i, i+2), 1);
            }
          }
        }
        
        Iterator it2 = huni.entrySet().iterator();
        int max2 = 0;
        String maxs2 = "";
        while (it2.hasNext()) {
            Map.Entry pair = (Map.Entry)it2.next();
            // System.out.println(pair.getKey() + " = " + pair.getValue());
            // it.remove(); // avoids a ConcurrentModificationException
            if(max2 < (int)pair.getValue()){
              max2 = (int)pair.getValue();
              maxs2 = (String)pair.getKey();
            }
            if(max2 == (int)pair.getValue()){
              if(maxs2.compareTo((String)pair.getKey()) > 0){
                max2 = (int)pair.getValue();
                maxs2 = (String)pair.getKey();
              }
            }
        }
        System.out.print("Bigram "+maxs2);
        break;
      case 3:
          while(s.hasMoreTokens()){
            String tk = s.nextToken();
            for(int i = 0; i< tk.length() - 2; i++){
              if(huni.containsKey(tk.substring(i, i+3))){
                int val = huni.get(tk.substring(i, i+3));
                huni.put(tk.substring(i, i+3), val + 1);
              }else{
                huni.put(tk.substring(i, i+3), 1);
              }
            }
          }
          
          Iterator it3 = huni.entrySet().iterator();
          int max3 = 0;
          String maxs3 = "";
          while (it3.hasNext()) {
              Map.Entry pair = (Map.Entry)it3.next();
              // System.out.println(pair.getKey() + " = " + pair.getValue());
              // it.remove(); // avoids a ConcurrentModificationException
              if(max3 < (int)pair.getValue()){
                max3 = (int)pair.getValue();
                maxs3 = (String)pair.getKey();
              }
              if(max3 == (int)pair.getValue()){
                if(maxs3.compareTo((String)pair.getKey()) > 0){
                  max3 = (int)pair.getValue();
                  maxs3 = (String)pair.getKey();
                }
              }
          }
          System.out.print("Trigram "+maxs3);
          break;
    }
  }
}