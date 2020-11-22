
import java.util.*;

public class problem33 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		String input1 = sc.nextLine();

		if (input1.contains("0") || input1.contains("1") || input1.contains("2") || input1.contains("3")
				|| input1.contains("4") || input1.contains("5") || input1.contains("6") || input1.contains("7")
				|| input1.contains("8") || input1.contains("9")) {

			HashMap<String, Integer> hmap3 = new HashMap<String, Integer>();
			hmap3.put("I", 1);
			hmap3.put("IV", 4);
			hmap3.put("V", 5);
			hmap3.put("IX", 9);
			hmap3.put("X", 10);
			hmap3.put("XL", 40);
			hmap3.put("L", 50);
			hmap3.put("XC", 90);
			hmap3.put("C", 100);
			hmap3.put("CD", 400);
			hmap3.put("D", 500);
			hmap3.put("CM", 900);
			hmap3.put("M", 1000);
			int input = Integer.parseInt(input1);

			// if(input == 3) {System.out.println("III");
			ArrayList<Integer> al2 = new ArrayList<Integer>(hmap3.values());
			ArrayList<Map.Entry<String, Integer>> entryset = new ArrayList<>(hmap3.entrySet());
			Comparator<Map.Entry<String, Integer>> cmp = Comparator.comparing(Map.Entry :: getValue);
			Collections.sort(entryset, cmp.reversed());
			System.out.println(entryset);
			
			int sum = input; 
			StringBuilder sb = new StringBuilder();
			while(sum > 0) 
			{
				for(Map.Entry<String, Integer>  map : entryset) 
				{
				
					if(map.getValue() > sum) 
					{
						continue;
					}
					else 
					{
						sum = sum - map.getValue();
						sb.append(map.getKey());
						break;
					}
				}
			}
			
	        System.out.println(sb);

//			Collections.sort(al2);
//			Collections.reverse(al2);
//			System.out.println(al2);
//			StringBuilder sb = new StringBuilder();
//
//			for (int i = 0; i < al2.size() && input > 0;) {
//
//				if (al2.get(i) > input) {
//					i++;
//				}
//
//				else {
//
//					input = input - al2.get(i);
//
//					for (Map.Entry<String, Integer> entry : hmap3.entrySet()) {
//
//						if (entry.getValue() == al2.get(i)) {
//							sb.append(entry.getKey());
//							// System.out.println("abc");
//
//						}
//
//					}
//					if (input >= al2.get(i)) {
//						i = 0;
//						continue;
//					} else {
//						i++;
//					}
//
//				}
//
//			}
//			System.out.println(sb);

		}

		else if (input1.matches("[MDCLXVI]+")
				// || input1.contains("D") || input1.contains("C") || input1.contains("L")
				// || input1.contains("X") || input1.contains("V") || input1.contains("I")
				) {

			String[] input = input1.toUpperCase().split("");

			ArrayList<String> al1 = new ArrayList<String>();
			for (String s : input) {
				al1.add(s);
			}
			// System.out.println(al1);

			HashMap<String, Integer> hmap = new HashMap<String, Integer>();
			hmap.put("I", 1);
			hmap.put("V", 5);
			hmap.put("X", 10);
			hmap.put("L", 50);
			hmap.put("C", 100);
			hmap.put("D", 500);
			hmap.put("M", 1000);

			// System.out.println("HashMap" + hmap);

			int sum = 0;
			// System.out.println(al1.size());
			ArrayList<String> al3 = new ArrayList<String>();

			for (int i = 0, j = i + 1; i < al1.size() && j < al1.size();)

			{

				String s1 = al1.get(i);

				String s2 = al1.get(j);

				// System.out.println("hmap1");
				if (hmap.get(s1) > hmap.get(s2)) {
					sum = sum + hmap.get(s1);

					i++;
					j++;

					// System.out.println("First " + sum);
					al3.add(s1);
					continue;

				}

				else if (hmap.get(s1) < hmap.get(s2)) {
					sum = sum + (hmap.get(s2) - hmap.get(s1));
					i = i + 2;
					j = j + 2;
					al3.add(s1);
					al3.add(s2);

					// System.out.println("Second " + sum);
					continue;
				}

				else if (hmap.get(s1) == hmap.get(s2)) {
					sum = sum + hmap.get(s2) + hmap.get(s1);
					i = i + 2;
					j = j + 2;
					al3.add(s1);
					al3.add(s2);
					// System.out.println("third " + sum);
					continue;
				}

			}

			// System.out.println("Inside al " + al3);

			if (al3.size() < al1.size()) {

				String s = al1.get(al1.size() - 1);
				sum = sum + hmap.get(s);
			}
			System.out.println(sum);

		

		}

	}

}
