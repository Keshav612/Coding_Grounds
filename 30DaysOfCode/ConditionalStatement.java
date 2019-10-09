
//https://www.hackerrank.com/challenges/30-conditional-statements/problem
//Keshav Mishra
import java.util.*;
public class ConditionalStatement
{
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(n%2==1)
        {
            System.out.println("Weird");
        }
        if(n%2==0 && ((n>1 && n<6)||(n>20)) )
        {
            System.out.println("Not Weird");
        }
        if(n%2==0 && (n>=6 && n<=20))
        {
            System.out.println("Weird");
        }
       
        scanner.close();
    }
}
