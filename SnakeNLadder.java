import java.util.*;

public class SnakeNLadder {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int sl = Integer.parseInt(sc.nextLine());
		HashMap<Integer, Integer> hmap = new HashMap<>();
		for (int i = 0; i < sl; i++) {
			String[] s = sc.nextLine().split(" ");
			hmap.put(Integer.parseInt(s[0]), Integer.parseInt(s[1]));
		}

		int m = Integer.parseInt(sc.nextLine());
		String[] ss = sc.nextLine().split(" ");
		ArrayList<Integer> moves = new ArrayList<Integer>();
		for (String temp : ss) {
			moves.add(Integer.parseInt(temp));
		}

		int sumA = 1;
		int sumB = 1;
		int count1 = 0;
		int count2 = 0;
		
			for (int i = 0; i < moves.size(); i++) 
			{

				if (sumA < 100 && sumB < 100) 
				{

					if (i % 2 == 0) {

						if (hmap.containsKey(sumA)) {
							sumA = hmap.get(sumA);
							for (int ii : hmap.keySet()) {
								if (hmap.containsKey(sumA)) {
									sumA = hmap.get(sumA);
									
								}

								else {
									break;
								}

							}
							
							
						} else {
							sumA = sumA + moves.get(i);
							
							for (int ii : hmap.keySet()) {
								if (hmap.containsKey(sumA)) {
									sumA = hmap.get(sumA);
									
								}

								else {
									break;
								}

							}

						}

						

					}

					else 
					{

						if (hmap.containsKey(sumB)) {
							sumB = hmap.get(sumB);
							for (int ii : hmap.keySet()) {
								if (hmap.containsKey(sumB)) {
									sumB = hmap.get(sumB);
									
								}

								else {
									break;
								}

							}
							
						} else {
							sumB = sumB + moves.get(i);
							

							for (int ii : hmap.keySet()) {
								if (hmap.containsKey(sumB)) {
									sumB = hmap.get(sumB);
									
								} else {
									break;
								}

							}

						}

						

					}

				} 
				else if (sumA >= 100) 
				{
					count1++;
					break;
				}
				else if (sumB >= 100) 
				{
					count2++;
					break;
				}

			}

			

		if (sumA > sumB && count1 == 0 && count2 == 0) {
			System.out.println("A " + sumA);
		} else if (sumA < sumB && count1 == 0 && count2 == 0) {
			System.out.println("B " + sumB);
		} else if (count1 > 0) {
			System.out.println("A 100");
		} else if (count2 > 0) {
			System.out.println("B 100");
		}

	}

}
