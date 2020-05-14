/*Write a java program that accepts a string and returns a new string without the first and last character of the input string.

Example1)
i/p:Suman
o/p:uma*/

import java.util.*; 
  
class Fifth { 
    static String FirstAndLast(String str) 
    { 
  
        // Split the String based on the space 
        String[] arrOfStr = str.split(" "); 
  
        // String to store the resultant String 
        String res = ""; 
  
         
        for (String a : arrOfStr) { 
            res += a.substring(1, a.length() - 1) + " "; 
        } 
  
        return res; 
    } 
  
    
    public static void main(String args[]) 
    { 
        String str = "Suman"; 
        System.out.println(str); 
        System.out.println(FirstAndLast(str)); 
    } 
} 