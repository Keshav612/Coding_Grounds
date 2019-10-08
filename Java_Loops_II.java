import java.util.*;
import java.io.*;

public class Java_Loops_II {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int q=in.nextInt();
        for(int i=0;i<q;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int c=a;
            int replace=0;
            if(q>=0 && q<=500 && a>=0 && b<=50 && n>=1 && n<=15)
            {
                
                    for(int j = 0; j < n; j++)
                    {
                     a = a + (int)Math.pow(2,j)*b;
                     System.out.print(a + " ");
                    }
                    System.out.println("");
                }
            }
            
    }}
        


