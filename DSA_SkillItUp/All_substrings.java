import java.util.*;
public class All_substrings {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int n=str.length();
        Substr(str,n);
        
    }
    static void Substr(String str,int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<=n;j++)
            {
                System.out.println(str.substring(i,j));
            }
        }
    }
}
