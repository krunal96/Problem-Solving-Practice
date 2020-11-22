import java.util.*;

public class pctpctpct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();//
		String str2 = sc.nextLine();
		ArrayList<String> alm = new ArrayList<String>();
		alm.add(str1);
		alm.add(str2);
		// System.out.println(alm);

		for (String str : alm) {

			ArrayList<String> al = new ArrayList<String>();
			ArrayList<String> al2 = new ArrayList<String>();
			HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
			for(Character c : str.toCharArray()) {
				
				hmap.put(c, hmap.getOrDefault(c, 0)+1);
			}
			
			
			for (int i = 0; i < str.length(); i++) {
				for (int j = i + 1; j <= str.length(); j++) {
					
					if(str.substring(i, j).length() >= hmap.size()) {
					al.add(str.substring(i, j));}
				}
			}
			System.out.println(al);

			HashMap<String, Integer> hm = new HashMap<String, Integer>();
			for (int i = 0; i < al.size(); i++) {
				if (hm.containsKey(al.get(i))) {
					hm.put(al.get(i), hm.get(al.get(i)) + 1);
				} else {
					hm.put(al.get(i), 1);
				}

			}
			System.out.println(hm);

			ArrayList<Integer> all = new ArrayList<Integer>(hm.values());
			int max = Collections.max(all);
			System.out.println("max size : " + max);

			ArrayList<String> al3 = new ArrayList<String>();
			for (Map.Entry<String, Integer> ent : hm.entrySet()) {
				if (max == ent.getValue()) {
					al3.add(ent.getKey());
				}
			}
			System.out.println("New ArrayList " + al3);

			HashMap<String, Integer> hm1 = new HashMap<String, Integer>();
			for (int i = 0; i < al3.size(); i++) 
			{
				hm1.put(al3.get(i), al3.get(i).length());
			}
			System.out.println("new hashmap with string size " + hm1);
			ArrayList<Integer> alval = new ArrayList<Integer>(hm1.values());
			int max1 = Collections.max(alval);
			System.out.println(max1);

			for (Map.Entry<String, Integer> entt : hm1.entrySet()) {
				if (max1 == entt.getValue()) {

					int res = entt.getKey().length() * max;
					System.out.println("res" + res);
					if (res == entt.getKey().length()) {
						System.out.println("No" + " " + "0");
					} else {
						if (str.length() == res) {
							System.out.println("Yes" + " " + max);
						}

						else {
							System.out.println("No" + " " + "0");
						}

					}

				}
			}

		}
	}
}

/*
1 :::::  
6
A B C D E F
6
A B C
B C D
C E D
D
E 
F


2::::::
6
A B C D E F
6
A B C
B C B E D
C E D
A E D
E 
A 
*/
