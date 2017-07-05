import java.util.*;
import java.io.*;
public class Main
{
  public static void main(String[] args)
  {
    int a,sum;  
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the integer");
    a=sc.nextInt();
    sum=(a*(a+1))/2;
    System.out.println(sum);
      }
}
