
package Arrays;
import java.util.*;
public class InsertAtKth 
{
    public static void main(String[] args) 
    {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter number of input");
      int n2 = in.nextInt();
      int a[]=new int[n2];
      for(int i=0;i<n2;i++)
      {
        a[i]=in.nextInt();
      } 
      System.out.println("Enter element to be inserted");
      int input=in.nextInt(); 
      System.out.println("Enter position to be inserted");
      int input2=in.nextInt();  
      System.out.println("OK");
      int b[]=new int[n2+1];
      
      for(int i=0;i<n2+1;i++)
      {
          if(i<input2-1)
          {
              b[i]=a[i];
          }
          else if(i==(input2-1)){
              b[i]=input;
          }
          else{
          b[i]=a[i-1];
          }
      }
      
      for(int i=0;i<b.length;i++)
      System.out.print(b[i]+" ");

    }
    

}
