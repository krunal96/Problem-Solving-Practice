import java.util.Scanner;

public class Lab1 {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		 Long num1 = sc.nextLong();
		 //System.out.println(+ num1);
		 //System.out.println("This is " + num1);
		 //sc.close();
		 
		 int j = 0;
		 int sum = 0;
		 
		 for(long i = num1 ; i > 0; i= i/10) {
			     if (j%2==0) 
			     {
			    sum += i%10 ;
			    		}
			    else {
			    sum+=	((i%10)*2)%10 + ((i%10)*2)/10;
			    	
			 } 
			 	//System.out.println(i%10+" "+sum);
				j++;
			 
		 }
		
		 if(sum%10 == 0)
		 		{
				System.out.println("VALID");  
				}
		 
		 	else {
				j = 10 - (int)(sum- (num1%10))%10;
				System.out.println("INVALID "+Integer.toString(j));
			}
		 
		 sc.close();
	}
	
	
}
