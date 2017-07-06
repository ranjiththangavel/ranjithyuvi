import java.util.*;
import java.io.*;
public class Main
{
public static void main(String[] args)
{
int n,count=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(int i=2;i<n;i++)
{
   if(n%i==0)
   {
   count++;
   }
   }
 if(count==0)
 {
 System.out.println("It is a prime number");
 }
 else
 {
 System.out.println("It is not a prime number");
 }
 }
 }
