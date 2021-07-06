package sorting;

public class SelectionSort {

    public static void main(String[] args) {
        int a[] = new int[]{6, 5, 4, 3, 2, 1};

        for (int j = 0; j < a.length; j++) {//a.length-1 delao hobe 
            int min = j;
              for (int k = j + 1; k < a.length; k++) {
                if (a[j] > a[k]) {
                    min = k;
                }
            }
           
              //if (min!=j)   delao hobe na delao hobe 
             {
                int temp = a[j];
                a[j] = a[min];
                a[min] = temp;
             }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}