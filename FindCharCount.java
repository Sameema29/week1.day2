package week1.day2;

public class FindCharCount {

	public static void main(String[] args) {
		
		//goal: to understand string, loop, if
		
		/*
		 * convert string to char array
		 * find length of array
		 */
		
		String s = "cognizant";
		char ch = 'b';
		int count =0;
		char[] charArray1 = s.toCharArray();
		int length = charArray1.length;
		
        for (int i = 0; i < charArray1.length; i++) {
        	
        	if(ch==charArray1[i])
        	{
        		count++;
        	}
        	
		}
        
        System.out.println("occurence of "+ch+" is "+count);
	}

}
