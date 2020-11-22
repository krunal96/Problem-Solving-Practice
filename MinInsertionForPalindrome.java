import java.util.*;
public class MinInsertionForPalindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		StringBuilder left = new StringBuilder();
		StringBuilder right = new StringBuilder();

		int l = 0;
		int r = s.length() - 1;
		for (; l < r;) {
			char lc = s.charAt(l);
			char rc = s.charAt(r);
			if (lc != rc) {
				if (lc < rc) {
					right.append(lc);
					left.append(lc);
					l++;
				} else {
					left.append(rc);
					right.append(rc);
					r--;
				}
			} else {
				left.append(lc);
				right.append(rc);
				l++;
				r--;
			}
		}
		if (l == r) {
			left.append(s.charAt(r));
		}
		
		
		String palindrome = left.append(right.reverse()).toString();;
		System.out.println("s = " + s);
		System.out.println("palindrome = " + palindrome);
		System.out.println("difference = " + (palindrome.length() - s.length()));

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
