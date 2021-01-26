package Arrays;
//Array rotation with juggling algorithm.
//Keshav Mishra.
public class Array_Rotation {
    int GCD(int a,int b)
    {
        if(b==0)
        {
            return a;
        }
        else
        {
            return GCD(b,a%b);
        }

    }
    void rotate(int a[],int d,int n)
    {
        int i,j,k,tmp;
        d=d%n;
        int gcd=GCD(d,n);
        for(i=0;i<gcd;i++)
        {

            tmp=a[i];
            j=i;
            while(true)
            {
                k=j+d;
                if(k>=n)
                {
                    k=k-n;
                }
                if(k==i)
                {
                    break;
                }
                a[j]=a[k];
                j=k;
            }
            a[j]=tmp;
        }
    }
    void show(int a[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,10,11,12};
        int d=3;
        int n=a.length;
        Array_Rotation obj = new Array_Rotation();
        obj.rotate(a,d,n);
        obj.show(a,n);
    }
}
