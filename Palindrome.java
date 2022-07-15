package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		//Build a logic to find the given string is palindrome or not
	     
		/*
		 * Pseudo Code
		
		 * a) Declare A String value as"madam"
		 
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */
		
		String name = "madam";
		String reverse = "";
		
		for (int i = name.length()-1; i >= 0; i--) {
			reverse = reverse+name.charAt(i);
			
		}
		
		System.out.println(reverse);
		if(name.equalsIgnoreCase(reverse))
		{
			System.out.println("The given string "+name+" is Palindrome");
		}
		
		else
		{
			System.out.println("The given string "+name+" is not a Palindrome");
		}
		
	}

}
