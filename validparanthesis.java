import java.util.ArrayList;
import java.util.Scanner;

public class validparanthesis {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int inputnum = Integer.parseInt(sc.nextLine());	
		
		
		for(int k = 0; k < inputnum; k++) {	
		
		String input = sc.nextLine();
		String temp = input.replaceAll("\\s+", "");
		
		StringBuilder sb = new StringBuilder();
		// System.out.println("First input" +temp);

		String s[] = temp.split("");
		ArrayList<String> al = new ArrayList<String>();
		for (String ss : s) {
			al.add(ss);
		}

		String tempstring = "{}[]()";

		for (int i = 0; i < al.size(); i++) {
			// System.out.println(al.get(i));
			if (tempstring.contains(al.get(i))) {
				sb.append(al.get(i));
			} else {
				continue;

			}

		}
		int count = 0;

		for (int i = 0; i < sb.length();) {
			String n = "{[(";
			String m = "]})";
			int samen = 0;
			int samem = 0;
			for(int j = 0; j < sb.length(); j++) {
				if(n.contains(Character.toString(sb.charAt(j)))) {
					samen++;
				}
			}
			for(int j = 0; j < sb.length(); j++) {
				if(m.contains(Character.toString(sb.charAt(j)))) {
					samem++;
				}
			}
			if(samen == sb.length() || samem == sb.length()) {
				count++;
				break;
			}else if (m.contains(Character.toString(sb.charAt(0)))) {
				count++;
				break;
			} 
			else if (n.contains(Character.toString(sb.charAt(i)))) {
				//System.out.println("2");
				i++;
				continue;
			} else {
				//System.out.println("Elseee");
				String temp1 = Character.toString(sb.charAt(i));
				String temp2 = Character.toString(sb.charAt(i - 1));
				if ((temp1.equals("}") && temp2.equals("{"))
						|| (temp1.equals(")") && temp2.equals("(") || (temp1.equals("]") && temp2.equals("[")))) {
					sb.replace(i - 1, i + 1, "");
					i = 0;
					//System.out.println("Here in sb " + sb);
					continue;
				} else {
					//System.out.println("3");
					count++;
					break;
				}
			}
		}
		
		if (count > 0) 
		{
			System.out.println("FALSE");
		} else 
		{
			System.out.println("TRUE");
		}
		
	}

}

}
