import java.util.*;

public class lab8 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		String str3 = sc.nextLine();
		// System.out.println("The given string is: " + str3);
		// System.out.println("The interleaving strings are " + str1 + " and " + str2);
		
		int j1 = 0, j2 = 0, s = 0;
		if (str1.length() + str2.length() != str3.length()) 
		{
			System.out.print("No");
			return;
			
			
		}
		while (s < str3.length()) 
	{
			if (j2 < str2.length() && str2.charAt(j2) == str3.charAt(s)) 
			{
				j2++;
				s++;
				//System.out.println("*");
			} 
			else if (j1 < str1.length() && str1.charAt(j1) == str3.charAt(s))
			{
				j1++;
				s++;
				//System.out.println("@");
			} 
			else 
			{
				System.out.print("No");
				return;

			}
			
	}

		if (j1 == str1.length() && j2 == str2.length() && s == str3.length()) 
		{
			System.out.print("Yes");
			return;
		}
		else 
		{
		System.out.print("No");
		}
	}
}
