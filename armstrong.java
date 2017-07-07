import java.util.*;
import java.io.*;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int a,b=0,temp;
    int n=sc.nextInt();
    temp=n;
    while(n>0)
    {
      a=n%10;
      n=n/10;
      b=b+(a*a*a);
    }
    if(temp==b)
    {
      System.out.println(" it is a armstrong number");
    }
    else
    {
      System.out.println(" it is a not armstrong number");
      }
      }
      }
      
  
