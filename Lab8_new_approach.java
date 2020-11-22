import java.util.Scanner;

public class Lab8_new_approach {

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();
		String s2 = scan.nextLine();
		String s3 = scan.nextLine();
		int memo[][] = new int[s1.length() + 1][s2.length() + 1];

		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < s2.length(); j++) {
				memo[i][j] = 0;
			}
		}

		if (s3.length() != s1.length() + s2.length())
			System.out.println("No");
			
		// Initializing the matrix memo
		memo[0][0] = 1;
		for (int i = 1; i <= s1.length(); i++) {
			if (s3.charAt(i - 1) == s1.charAt(i - 1))
				memo[i][0] = 1;
			else
				break;
		}
		for (int j = 1; j <= s2.length(); j++) {
			if (s3.charAt(j - 1) == s2.charAt(j - 1))
				memo[0][j] = 1;
			else
				break;
		}

		for (int i = 1; i <= s1.length(); i++) {
			for (int j = 1; j <= s2.length(); j++) {
				if (s3.charAt(i + j - 1) == s1.charAt(i - 1)) {
					if (memo[i - 1][j] == 1)
						memo[i][j] = 1;
				}
				if (s3.charAt(i + j - 1) == s2.charAt(j - 1)) {
					if (memo[i][j - 1] == 1)
						memo[i][j] = 1;
				}
			}
		}
		
		if(memo[s1.length()][s2.length()] == 1) {
			System.out.println("Yes");
		}
		
		else {
			System.out.println("No");
		}

		
		
		
		
	}

}
