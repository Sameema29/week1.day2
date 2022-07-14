package week1.day2;

public class ReverseString {

	public static void main(String[] args) {
		
		//to understand string and loop
		
		/*
		 * convert string to char array
		 * find length of array
		 * loop in the reverse length
		 * print each character using print statement
		 */
		
		String name = "Ihaan";
		char[] charArray1 = name.toCharArray();
		int length = charArray1.length;
		
		for (int i = charArray1.length-1; i >= 0; i--) {
			System.out.print(charArray1[i]);
		}

	}

}
