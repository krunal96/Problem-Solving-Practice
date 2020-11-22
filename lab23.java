import java.util.*;

public class lab23 {
	public static void main(String args[]) {
	Scanner sc  = new Scanner(System.in);
	int input = Integer.parseInt( sc.nextLine());
	ArrayList<String> inputList = new ArrayList<>();
	ArrayList<String> expectedList = new ArrayList<>();
	ArrayList<String> targetList = new ArrayList<>();
	
	for (int j = 0; j < input; j++)
	{
		String inputString = sc.nextLine();
		inputList.add(inputString);
	}
	
	expectedList = (ArrayList<String>) inputList.clone();
	System.out.println(inputList);
	for (int j = 0; j < input; j++)
	{
		String inputString = sc.nextLine();
		String[] array = inputString.split("->");
		
		int index1 = Integer.parseInt(array[0]) - 1;
		int index2 = Integer.parseInt(array[1]) - 1;
		System.out.println((index1)+":"+index2);
		expectedList.set(index2,inputList.get(index1));
	}
	
	for (int j = 0; j < input; j++)
	{
		String inputString = sc.nextLine();
		targetList.add(inputString);
	}
	System.out.println(inputList);
	System.out.println(expectedList);
	System.out.println(targetList);

	for(int i = 0; i < targetList.size(); i++) {
		int temp = i;
		for(int j = 0; j < expectedList.size(); j++) {
			int temp2 = j;
			if(targetList.get(i).equals(expectedList.get(j))) {
				System.out.println(temp+1+"->"+(temp2+1));
			}
		}
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//		int target = Integer.parseInt(sc.nextLine());
//		int begin = 0;
//		int last = nums.length-1;
//		
//		StringBuilder builder = new StringBuilder();
//		int mid = (begin + last) /2;
////		System.out.println(Math.ceil((begin + last) /2.0));
//		while(begin <= last) {
//			
//			if(nums[mid] < target) {
//				begin = mid + 1;
//				builder.append("1 ");
//			}else if(nums[mid] > target) {
//				last = mid - 1;
//				builder.append("-1 ");
//			}else if(nums[mid] == target) {
//				builder.append("found");
//				break;
//			}
//			mid = (begin + last) /2;
//			
//		}
//		if(begin > last) {
//			builder.append("notfound");
//		}
//		System.out.println(builder.toString().trim());
	}
}
