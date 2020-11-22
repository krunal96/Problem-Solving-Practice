
public class palindromaticSubstring {

	public  static void main(String[] args) 
	{
		String s = "aaa";
		int count  = 0;
        for(int  i = 0; i < s.length() ; i++)
        {
            for(int  j = i+1; j <=  s.length() ; j++)
            {
            	
            	String temp = s.substring(i, j);
            	
                if(temp.equals(new StringBuilder(temp).reverse().toString()))
                {
                    count++;
                }
            }
        
	   }
        
       System.out.println(count);
	
	   
	    
	    
	}
	
}
	
	
	
	
	
	

