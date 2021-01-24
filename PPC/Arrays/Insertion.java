//GFG PPC--Insertion 
//Keshav Mishra
package Arrays;
import java.util.*;

public class Insertion 
{
    public static void main(String[] args) 
    {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter number of input");
      int n = in.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=in.nextInt();
      } 
      System.out.println("Enter element to be inserted");
      int input=in.nextInt();  
      System.out.println("OK");
      //int j=n+1;
      int b[]=new int[n+1];
      for(int i=0;i<n;i++)
      {
          b[i]=a[i];
          
      }  
      b[n]=input;
      for(int i=0;i<b.length;i++)
      {
          System.out.println(b[i]+" ");
    }
}  
}