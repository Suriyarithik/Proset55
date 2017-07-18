# Proset55
import java.io.*;
import java.util.*;
public class Proset55
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int count=0;
    int c=0;
    int num=sc.nextInt();
    int wt=sc.nextInt();
    int ar[]=new int[no];
    for(int i=0;i<ar.length;i++)
    {
        arr[i]=sc.nextInt();
    }
    Arrays.sort(ar);
    for(int j=ar.length-1;j>=0;j--)
    {
    if(count<wt)
    {
      count=count+ar[j];
      c++;
    }
    }
    System.out.println(c);
    }
}
