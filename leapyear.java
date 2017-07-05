import java.util.*;
import java.io.*;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the year");
    int a=sc.nextInt();
    if((a%4==0)&&(a%100!=0)||(a%400==0))
    {
      System.out.println("it is a leap year");
    }
    else 
    {
      System.out.println("it is not a leap year");
    }
     }
  }
