import java.util.*;
import java.io.*;
 public class Fact1
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int i,fact=1;
    int n=sc.nextInt();
    for(i=1;i<=n;i++)
    {
      fact=fact*i;
      }
      System.out.println("the fact of "+n+" is "+fact);
      }
      } 
    
    
    
