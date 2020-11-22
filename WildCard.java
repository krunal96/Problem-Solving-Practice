import java.util.*;

public class WildCard {
	
	public static boolean C(String wild, String in, int i, int j) {
		if (j == in.length() && i == wild.length()) return true;
        if (i == wild.length()) return false;
		if(wild.charAt(i) == '*') {
			return C(wild, in, i+1, j + 1) || C(wild, in, i, j + 1);
		}else {
			if(wild.charAt(i) == in.charAt(j) && i < wild.length() && j < in.length())
				return C(wild, in, i+1, j+1);
			return false;
		}
	}
	
	public static void main(String args[]) {
		Scanner sc_in = new Scanner(System.in);
	    String wild = sc_in.nextLine();
	    String in = sc_in.nextLine();
	    sc_in.close();
		
		System.out.println(C(wild,in,0,0));
	}
}
