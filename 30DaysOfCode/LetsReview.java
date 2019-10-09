//https://www.hackerrank.com/challenges/30-review-loop/problem
//Keshav Mishra
import java.io.*;
import java.util.*;

public class LetsReview {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int n=in.nextInt();
       for(int i=0;i<n;i++)
       {
           String s=in.next();
           for(int j=0;j<s.length();j=j+2)
           {
               System.out.print(s.charAt(j));
           }
           System.out.print(" ");
           for(int k=1;k<s.length();k+=2)
           {
               System.out.print(s.charAt(k));
           }
           System.out.println();
       }
       
        
    }
}

