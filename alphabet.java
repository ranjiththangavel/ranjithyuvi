import java.util.*;
import java.io.*;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    char r=sc.next().charAt(0);
    if((r>='a' && r<='z')||(r>='A' && r<='Z'))
    {
      System.out.println("it is an alphabet");
    }
    else
    {
      System.out.println("it is not an alphabet");
      }
  }
  }
