import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.*;
import java.util.Collections;
import java.util.Arrays;



public class Lab2 {

	public static void main(String[] args) {
		Integer a[] = new Integer[10];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i< a.length ; i++) 
		{
			 a[i] = sc.nextInt();
			 
		}
		String b = Arrays.toString(a);
		System.out.println("The array is a " + b );
		
		Integer Number = sc.nextInt();
		
		
		Arrays.sort(a);
		System.out.println("Sorted array" + Arrays.toString(a));
		
		
		for(Integer j = 0; j < a.length; j++ ) 
		{
			for(Integer k = a.length ; k < 0; k--)
			{
				
				if((a[j] + a[k])/2 < Number) {
					System.out.println("-1");
					k = (j+k)/2;
				}
				else if ((a[j] + a[k])/2 > Number) {
					System.out.println("-1");
					j  = (j+k)/2;
				}
				
				
			}
			
		} System.out.println("found");
		
	
	}	
		
}
