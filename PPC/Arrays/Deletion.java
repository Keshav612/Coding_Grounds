//Deleting a specific element
//Keshav Mishra
package Arrays;
import java.util.*;
public class Deletion {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
      System.out.println("Enter number of input");
      int n = in.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=in.nextInt();
      } 
      System.out.println("Enter element to be deleted");
      int x=in.nextInt();  
      int idx,j;
      System.out.println("OK");
      for( j=0;j<n;j++)
      {
          if(a[j]==x)
          {
              j++;
            break;
            
          }
          
      }
      for(int i=0;i<n;i++)
      {
          if(i<j)
          {
              a[i]=a[i];
          }
          else 
          {
            a[i-1]=a[i];
          }

      }
      for(int i=0;i<n-1;i++)
      {
        System.out.print(a[i]+" ");
      }
      
}
    
}
