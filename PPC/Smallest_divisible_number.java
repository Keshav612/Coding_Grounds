import java.io.*;
import java.util.*;

public class Smallest_divisible_number {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            Main g=new Main();
            System.out.println(g.getSmallestDivNum(n));
        }
    }

class Main {
    public static long getSmallestDivNum(int n) //find lcm
    {
        long a=1;
        for(long i=1;i<=n;i++)
        {
            a=(a*i)/(hcf(a,i));
        }
        return a;
    }
    static long hcf(long a,long b)  // a*b=hcf*lcm....rule.
    {
        if(a%b!=0)
        {
            return hcf(b,a%b);
        }
        return b;
    }
}
