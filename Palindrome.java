	import java.util.*;
	
	class Palindrome {
		
		public static void main(String args[]) {
			
			String str, reverse = ""; // Objects of String class
			Scanner s = new Scanner(System.in);
			
			System.out.println("Enter a string to check if it's a palindrome");
			str = s.nextLine();
			
			int length = str.length();

			for (int i = length - 1; i >= 0; i--)
				reverse = reverse + str.charAt(i);

			if (str.equals(reverse))
				System.out.println("The string is a palindrome.");
			else
				System.out.println("The string isn't a palindrome.");
			
		}
		
	}