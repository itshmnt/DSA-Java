You are given a string s. You need to reverse the string.

Example 1:

Input:
s = Geeks
Output: skeeG
Example 2:

Input:
s = for
Output: rof


-----------------------------------------------------------------------------------------------------

// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- >0)
        {
            String str = read.readLine();
            System.out.println(new Reverse().reverseWord(str));
        }
    }
}// } Driver Code Ends


//User function Template for Java


class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        String s;
        int start = 0;
        int end = str.length()-1;
        char ch[] = str.toCharArray();
        char temp = ch[0];
        while (start<=end){
            temp = ch[start]; 
            ch[start] = ch[end]; 
            ch[end] = temp;
            start++;
            end--;
        }
        s = String.valueOf(ch);
        return s;
    }
}
