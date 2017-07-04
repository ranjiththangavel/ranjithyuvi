import java.util.*;
import java.io.*;
public class Main
{
  public static void main(String[] args)throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter the number");
    int n=Integer.parseInt(br.readLine());
    System.out.println("enter the word");
    String a=br.readLine();
    for(int i=0;i<n;i++)
    {
      System.out.println(a);
    }
  }
