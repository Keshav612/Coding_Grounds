// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class PrimalityTest {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();//input testcases


		while(T-->0)//while testcase have not been exhausted
		{
		    Primality  obj=new Primality ();
		    int N;
		    N=sc.nextInt();//input n
		    if(obj.isPrime(N))
		    System.out.println("Yes");
		    else
		    
		    System.out.println("No");
		    
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java

class Primality {
    public boolean isPrime(int N) {
     int C=0;
    for(int i=2;i<=Math.sqrt(N);i++)
    {
        if(N%i==0)
        {
            C=1;
            break;
        }
        
    }
    if(C==1)
    {
        return false;
    }
    else
    {
        return true;
    }
    }
}