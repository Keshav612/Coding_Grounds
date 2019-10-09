// https://www.hackerrank.com/challenges/30-binary-numbers/problem
// Keshav Mishra
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BinaryNumbers
{
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {     
        int n = scanner.nextInt();int r=0,s=0;int t=0;
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        while(n>0)
        {
            r=n%2;
            n=n/2;
        if(r==1)
        {
            s++;
            if(s>=t)
            {
            t=s;
            }

        }
        else
        {
            s=0;
        }
        }
        System.out.println(t);
        scanner.close();
        }
    }