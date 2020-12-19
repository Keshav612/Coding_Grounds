import java.util.Scanner;

public class Trapping_Water
{
 
   
    public static int maxWater(int[] arr, int n) 
    {
        int res = 0;
        for(int i = 1; i < n - 1; i++)
        {
            int left = arr[i];
            for(int j = 0; j < i; j++)
            {
                left = Math.max(left, arr[j]);
            }
            int right = arr[i];
            for(int j = i + 1; j < n; j++)
            {
                right = Math.max(right, arr[j]);
            }
            res += Math.min(left, right) - arr[i];
        }
        return res;
    }
        public static void main(String[] args)
{
    Scanner in =new Scanner(System.in);
    int n1=in.nextInt();
    int a[]=new int[n1];
    for(int i=0;i<n1;i++)
    {
        a[i]=in.nextInt();
    }
    int n = a.length;
 
    System.out.print(maxWater(a,n));
}
}