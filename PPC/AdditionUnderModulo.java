import java.util.*;
import java.io.*;
import java.lang.*;

class AdditionUnderModulo
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        //taking testcases
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0) {
            String[] str = read.readLine().trim().split(" ");
            
            //taking input a and b
            Long a = Long.parseLong(str[0]);
            Long b = Long.parseLong(str[1]);
            
            //calling method sumUnderModulo()
            System.out.println(new Solution().sumUnderModulo(a,b));
        }
    }
}
//Sum of two big numbers and modulo (10^9+7)
class Solution {
    public static long sumUnderModulo(long a, long b){
    long c=1000000007;
    return (a%c + b%c)%c;
    }   
}
