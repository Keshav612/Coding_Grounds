import java.util.*;
class Modular_Multiplicative_Inverse
{
    
   static int modInverse(int a, int m)
    {
      int r=m;
        for(int i=m;i>=0;i--)
        {
          if((a*i)%r==1)
          {
            return i;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int a= in.nextInt();
        int m= in.nextInt();
        System.out.println(modInverse(a,m));
    }
}
