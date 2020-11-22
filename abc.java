import java.util.Arrays;
import java.util.Scanner;

public class abc {
	public static void main(String args[]) {
		Scanner sc  = new Scanner(System.in);
		String inputString = sc.nextLine();
		String[] inputarray = inputString.split(" ");
		int[] nums = new int[inputarray.length];
		for(int i = 0; i < inputarray.length-1; i++) {
			nums[i] = Integer.parseInt(inputarray[i]);
		}
		Arrays.sort(nums);
		int target = Integer.parseInt(sc.nextLine());
		int begin = 0;
		int last = nums.length-1;
		
		StringBuilder builder = new StringBuilder();
		int mid = (int) (begin + last) /2;
		System.out.println(mid);
		while(begin <= last) {
			
			if(nums[mid] < target) {
				begin = mid + 1;
				builder.append("1");
			}else if(nums[mid] > target) {
				last = mid - 1;
				builder.append("-1");
			}else if(nums[mid] == target) {
				builder.append("found");
				break;
			}
			mid = (int) (begin + last) /2;
			
		}
		if(begin > last) {
			builder.append("notfound");
		}
		System.out.println(builder.toString().trim());
	}
}
