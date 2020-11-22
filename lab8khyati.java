import java.util.ArrayList;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

public class lab8khyati {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count1 = 0;
		int count2 = 0;
		String first = sc.nextLine();
		String second = sc.nextLine();
		String third = sc.nextLine();
		String input = second.concat(first);
		// System.out.println(input);
		ArrayList<String> ip1 = new ArrayList<String>();
		ArrayList<String> ip = new ArrayList<String>();
		ArrayList<String> op = new ArrayList<String>();

		String[] two = second.split("");
		for (int i = 0; i < two.length; i++) {
			ip.add(two[i]);
		}
		String[] one = first.split("");
		for (int i = 0; i < one.length; i++) {
			ip1.add(one[i]);
		}
		String[] last = third.split("");
		for (int i = 0; i < last.length; i++) {
			op.add(last[i]);
		}
		ArrayList<String> copy_op = new ArrayList<String>();
		if (input.length() == third.length()) {
			for (int i = 0; i < ip.size(); i++) {
				// System.out.println(op);
				for (int j = 0; j < op.size(); j++) {
					// System.out.println(op);
					String a = ip.get(i);
					String b = op.get(j);
					if (a.equalsIgnoreCase(b)) {
						if (j > 0) {
							for (int k = 0; k <= j; k++) {
								copy_op.add(op.get(0));
								op.remove(0);
							}
							copy_op.remove(copy_op.size() - 1);
						} else {
							op.remove(j);
						}

						count1++;
						break;
					}

				}
				// System.out.println(count1);

				if (count1 == ip.size()) {
					for (int k = 0; k < op.size(); k++) {
						copy_op.add(op.get(k));
					}
					String compare = "";
					for (int k = 0; k < copy_op.size(); k++) {
						compare = compare + copy_op.get(k);
						// compare.concat(copy_op.get(k));
					}
					if (compare.equalsIgnoreCase(first)) {
						System.out.println("YES");
					} else {
						System.out.println("NO");
					}

				}
			}
		} else {
			System.out.println("NO");
		}

	}
}
