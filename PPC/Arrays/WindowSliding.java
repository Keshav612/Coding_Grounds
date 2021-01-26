/*Given an array of integers of size 'n'.
Our aim is to calculate the maximum sum of 'k' 
consecutive elements in the array.*/
//Keshav Mishra
package Arrays;
import java.lang.*;
public class WindowSliding
{
    public static void main(String[] args) 
    {
        WindowSliding obj = new WindowSliding();
        int a[]={100,9,-1,-2,7,3,-1,200};
        int l=a.length;
        int k=4;
        obj.subarray(a, l,k);
    }
    void subarray(int a[],int l,int k)
    {
        int wsum=0;
        for(int i=0;i<k;i++)
        {
            wsum+=a[i];

        }
        int maxsum=wsum;
        for(int end=k;end<l;end++)
        {
            maxsum+=a[end]-a[end-k];
            wsum=Math.max(wsum,maxsum);
        }
        System.out.println( wsum ); 
    }
}
