import java.util.*;

public class ngram_krunal {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int input = Integer.parseInt(sc.nextLine());
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < input; i++) {
			String ss = sc.nextLine();
			ss.replace(" ", "");
			String temp1 = ss.replaceAll("\\s+", "");
			String temp2 = temp1.replaceAll("[^a-z]", "");
			sb.append(temp2);
		}

		// System.out.println(sb);
		String s = sb.toString();

		int ngram = Integer.parseInt(sc.nextLine());
		if (ngram == 1) {
			HashMap<String, Integer> hmap = new HashMap<String, Integer>();
			for (int i = 0; i < s.length(); i++) {
				hmap.put(Character.toString(s.charAt(i)), hmap.getOrDefault(Character.toString(s.charAt(i)), 0) + 1);
			}

			int maxval = Collections.max(hmap.values());
			ArrayList<String> templ = new ArrayList<String>();
			for (Map.Entry<String, Integer> entry : hmap.entrySet()) {
				if (entry.getValue() == maxval) {
					templ.add(entry.getKey());
				}
			}

			Collections.sort(templ);
			System.out.println("Unigram " + templ.get(0));
		}
		
		else if (ngram == 2)
		{
			HashMap<String, Integer> hmap = new HashMap<String, Integer>();

			for (int i = 0, j = 1; i < s.length() - 1 && j < s.length(); i++, j++) {
				String temp2 = s.substring(i, j + 1);
				hmap.put(temp2, hmap.getOrDefault(temp2, 0) + 1);
			}

			int maxval = Collections.max(hmap.values());
			ArrayList<String> templ = new ArrayList<String>();
			for (Map.Entry<String, Integer> entry : hmap.entrySet()) {
				if (entry.getValue() == maxval) {
					templ.add(entry.getKey());
				}
			}
			Collections.sort(templ);
			System.out.println("Bigram " + templ.get(0));
		}
		else if (ngram == 3) {
			HashMap<String, Integer> hmap = new HashMap<String, Integer>();

			for (int i = 0, j = 2; i < s.length() - 1 && j < s.length(); i++, j++) {
				String temp3 = s.substring(i, j + 1);
				hmap.put(temp3, hmap.getOrDefault(temp3, 0) + 1);
			}

			int maxval = Collections.max(hmap.values());
			ArrayList<String> templ = new ArrayList<String>();
			for (Map.Entry<String, Integer> entry : hmap.entrySet()) {
				if (entry.getValue() == maxval) {
					templ.add(entry.getKey());
				}
			}

			Collections.sort(templ);
			System.out.println("Trigram " + templ.get(0));
		}

	}

}
