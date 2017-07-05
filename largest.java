import java.util.*;
import java.io.*;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    if(a>=b && a>=c)
    {
      System.out.println("the largest number is "+a);
    }
    if(b>=a && b>=c)
    {
      System.out.println("the largest number is "+b);
    }
    if(c<=a && c>=b)
    {
      System.out.println("the largest number is "+c);
    }
  }
}
 
