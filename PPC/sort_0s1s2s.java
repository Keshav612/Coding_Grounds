// { Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;

class sort_0s1s2s {
    
 // } Driver Code Ends


//User function template for Java

public static void sort012(int a[], int n){
   
   int low=0;int t=0;
   int mid=0;
   int hi=a.length-1;
   while(mid<=hi)
   {
       switch(a[mid])
       {
           case 0:
               t=a[low];
               a[low]=a[mid];
               a[mid]=t;
               low++;
               mid++;
               break;
            case 1:
                mid++;
                break;
            case 2:
                t=a[mid];
                a[mid]=a[hi];
                a[hi]=t;
                hi--;
                break;
       }
   }
}

// { Driver Code Starts.

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}

  // } Driver Code Ends