import java.util.Arrays;
import java.util.Scanner;

public class StringMan1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Integer input = Integer.parseInt(sc.nextLine());
		String[] s = new String[input];
		for (int i = 0; i < input; i++) {
			s[i] = sc.nextLine();
		}
		// int sl = s.length;
		// System.out.println(sl);
		sc.close();
		// System.out.println("Given string array is : " + Arrays.toString(s));
		// int k = 1;
		// for (int j = 0; j < s.length; j++) {
		// for( ; k < s.length; k++ )
		// {
		// if(s[j].charAt(0) ==s[k].charAt(0)) {
		// System.out.println(s[j] + "-" + s[k]);
		// k++;
		// }
		//
		// else {k++;}
		// }k = 0;
		// }

		int j = 0;
		// int l = 1;
		for (int k = 1; k <= s.length;) {
			for (int l = 1; l <= s.length - 1;) {
				if (s[j].charAt(0) == s[l].charAt(0)) {
					System.out.println(s[j] + "-" + s[l]);
				}
				l++;
			}
			if(k == s.length)
				break;
			String ss = s[k];
			s[k] = s[j];
			s[j] = ss;
			k++;
			// System.out.println(k);
			// System.out.println(s[0]);
		}
		j = 0;
		// l = 1;

		// int cnt = 0;
		// for(int i = 0; i < s.length - 1; i++) {
		// for(int j = i + 1; j < s.length; j++) {
		// if(s[i].charAt(0) == s[j].charAt(0)) {
		// cnt++;
		// System.out.println(s[i] + "-" + s[j]);
		// System.out.println(s[j] + "-" + s[i]);
		// }
		// }
		// }
		// System.out.println(cnt*2);

	}
}
