import java.util.*;
class Count_digits_Log
{
  static int count_digits_Log(long n)
  {
    return (int)Math.floor(Math.log10(n) + 1);
  }
  public static void main(String[] args)
  {
     Scanner in = new Scanner(System.in);
     long n= in.nextLong();
     int c=count_digits_Log(n);
     System.out.println("Digits : "+c);
  }
}