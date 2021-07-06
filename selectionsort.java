
package shorting;
import java.util.Scanner;
import java.util.Arrays; 
import java.util.stream.IntStream; 
  
public class selectionsort {
    //
    public static void selectionSort(int a[],int n)
    {
        for (int i=0;i<n;i++)
        {
            int min =i;//akane min hosse index num not numberti
           for (int j=i+1;j<n;j++)
           {
              if (a[j]<a[min])
              {
              min=j;
              }
           }
           if (min!=i)
           {
           int temp=a[min];
           a[min]=a[i];
           a[i]=temp;
           }
        }
        output(a,5);
        
    }
    public static void input(int a[],int x)
    {
        System.out.println("Enter data:");
      for (int i=0;i<x;i++)
      {
         Scanner inp = new Scanner(System.in);
         a[i]=inp.nextInt();
      }
    
    }
    static void output (int a[],int m)
    {
       //System.out.println ("ur array is=");
      for (int i=0;i<m;i++)
      {
      System.out.print(a[i]);
      }
    
    }
    public static void main(String[] args)
    {
        int a[]=new int [7];
        
        Scanner inp=new Scanner(System.in);
        System.out.print("enter size :");
        int n=inp.nextInt();
        
        
        input( a,n);
        
        System.out.print("before selection sort Ur array is :");
        output(a,n);
        
        System.out.print("\n"+"after selection sort Ur array is :");
        selectionSort(a,n);
        
        
        
    }
    
}
