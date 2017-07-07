import java.util.*;
import java.io.*;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n,r,o,rev=0;
    n=sc.nextInt();
    o=n;
    while(n!=0)
    {
      r=n%10;
      rev=rev*10+r;
      n=n/10;
    }
    if(rev==o)
    {
      System.out.println("this is a palindrome");
      }
      else
      {
        
        System.out.println("this is not a palindrome");
        }
        }
        }
        
