
package sorting;
public class BubbleSort {
    public static void main(String[] args) {
        int a[]=new int[]{6,4,1,2,5};
        for (int i=0;i<a.length-1;i++)
        {
        for (int j=0;j<a.length-1-i;j++)
        {
        if (a[j]>a[j+1])
        {
        int temp=a[j];
        a[j]=a[j+1];
        a[j+1]=temp;
        }
        }
        }
        for (int i=0;i<a.length;i++)
        {
            System.out.print(a[i]);
        }
    }
    
}