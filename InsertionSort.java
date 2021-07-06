package sorting;
public class InsertionSort {
    public static void main(String[] args) {
        int a[]={5,4,10,1,6,2};
        for (int j=1;j<a.length;j++)
        {
        int temp=a[j];
        for (int i=j;i>=0;i--)
        {
            if(temp<a[i])
            {
            i++;
            a[i]=a[i-1];
            a[i-1]=temp;
            }
        }
        }
        
        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}