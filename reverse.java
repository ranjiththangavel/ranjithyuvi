import java.util.*;
import java.io.*;
public class reverse
{
public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the Interger");
 int n,rev=0;
 n=sc.nextInt();
 while(n!=0)
 {
 rev=rev*10;
 rev=rev+n%10;
 n=n/10;
 }
 System.out.println("the reverse of integer is"+rev);
 }
 }
