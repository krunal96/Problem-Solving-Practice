import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class printdiagonal_sum {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int input = Integer.parseInt(sc.nextLine());
		int[][] a = new int[input][input];

		ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < input; i++) {
			String inString = sc.nextLine();
			String[] ss = inString.split(" ");
			int[] s = new int[ss.length];

			for (int j = 0; j < ss.length; j++) {

				int temp = Integer.parseInt(ss[j]);
				s[j] = temp;
			}
			//

			// processing

			for (int j = 0; j < s.length; j++) {

				a[i][j] = s[j];
			}

		}

		// System.out.println("1st diagonal : ");
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		for (int i = 0, j = 0; i < input && j < input; i++, j++) {

			// System.out.println(a[i][j]);
			al1.add(a[i][j]);

		}

		// System.out.println("Second diagonal ");
		for (int i = 0, j = input - 1; i < input && j >= 0; i++, j--) {

			// System.out.println(a[i][j]);
			al2.add(a[i][j]);

		}
        
		
		al.add(al1);
		al.add(al2);
		// System.out.println("here into array of arraylist " + al);
		ArrayList<Integer> temp2 = new ArrayList<Integer>();

		for (int i = 0; i < al.size(); i++) {
			ArrayList<Integer> temp = new ArrayList<Integer>();
			temp = al.get(i);
			int sum = 0;
			for (int k = 0; k < temp.size(); k++) {
				sum += temp.get(k);
			}

			temp2.add(sum);
		}

		// System.out.println(temp2);

		if (temp2.get(0) > temp2.get(1)) {
			System.out.println("First " + temp2.get(0));
			System.out.println("Second " + temp2.get(1));
			System.out.println(al.get(0));

		}

		else if (temp2.get(0) < temp2.get(1)) {
			System.out.println("First" + temp2.get(1));
			System.out.println("Second " + temp2.get(0));
			System.out.println(al.get(1));
		}

		else {

			System.out.println("equal");
		}

	}

}

/*
 * 3 1 1 1 2 2 2 3 3 3 equal
 */
