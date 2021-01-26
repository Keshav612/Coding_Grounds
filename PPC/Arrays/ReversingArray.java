package Arrays;
/* Generic
public class ReversingArray 
{
    void reverse(int a[],int l)
    {
        int b[]=new int[l];
        for(int i=0;i<l;i++)
        {
            b[i]=a[l-i-1];
        }
        for(int i=0;i<l;i++)
        {
            System.out.print(b[i]+" ");
        }
    }
    public static void main(String[] args) 
    {
        int a[]={1,2,3,4,5,6};
        int l=a.length;
        ReversingArray obj=new ReversingArray();
        obj.reverse(a, l);
    }
} */


// Efficient Method

public class ReversingArray 
{
    void reverse(int a[],int start,int end,int l)
    {
        int temp;
        if(start<=end)
        {
            temp=a[start];
            a[start]=a[end];
            a[end]=temp;
        }
        else{return;}
        reverse(a,start+1,end-1,l);
    }
    void show(int a[],int l)
    {
        for(int i=0;i<l;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) 
    {
        int a[]={1,2,3,4,5,6};
        int l=a.length;
        ReversingArray obj=new ReversingArray();
        int start=0;
        int end=l-1;
        obj.reverse(a,start,end,l);
        obj.show(a,l);
    }
} 
