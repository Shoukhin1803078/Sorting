package sorting;

public class InsertionsortPractice {

    public static void main(String[] args) {
        int a[] = new int[]{5, 4, 3, 2, 1};
        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            for (int j = i; j >= 0; j--) {
                if (temp < a[j]) {
                    j++;
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }
        
        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
