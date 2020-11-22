import java.util.*;

public class MinPal {
	public static int c(String in, int i, int j) {
		// c[i, j] = 0 if i >= j
		if(i >= j) {
			return 0;
		}
		if(in.charAt(i) == in.charAt(j)) {
			return c(in, i+1, j-1);
		}else {
			return Math.min(c(in, i+1,j), c(in, i,j-1)) + 1;
		}
	}
	public static void main(String args[]) {
		Scanner sc_in = new Scanner(System.in);
	    String in= sc_in.nextLine();
	    sc_in.close();
	    System.out.println(c(in, 0, in.length()-1));
	}
}
