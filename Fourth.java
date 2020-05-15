
 import java.util.*;
 import java.lang.*;
 
 class Fourth {
	 
	 public static void main(String args[]) {
		 
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter any string: ");
		 String str = s.nextLine();
		 String str2 = "";
		 int l = str.length();
		 int n = l/2;
		 
		 if(l%2 == 0) {
			 str2 = "";
			 for(int i=0; i<n; i++) {
				 
				 str2 = str2 + str.charAt(i);
				 
			 }
			System.out.print(str2); 
		 }	
		 
		 else
			 
		 System.out.print("NULL");
		 
		 
	 }
	 
 }