
package shorting;
import java.util.Scanner;
public class SHORTING {
    public static void main(String[] args) {
          int i;
          System.out.println("enter size:");
                Scanner inp=new Scanner(System.in);
                  int size=inp.nextInt();
        int a[]=new int [size];
        System.out.println("enter number:");
          for (i=0;i<a.length;i++)
       {
            a[i]=inp.nextInt();
       }
         for (i=0;i<size-1;i++)
          {
            for ( int j=0;j<size-1;j++)
               {
                    if (a[j]>a[j+1])
                    {
                      int temp=a[j];
                      a[j+1]=a[j];
                      temp=a[j+1];
                     }
               }
          }
          for (int j=0;j<a.length;j++)
          {
          System.out.print(a[j]);
          } 
    } 
}
