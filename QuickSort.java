package sorting;

import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.Collections;

public class QuickSort {

    public static int partition(ArrayList<Integer> a1, int lb, int ub) {

        int start, end;
        start = lb;
        end = ub;
        int pivot = a1.get(start);
        while (start < end) {
            while (a1.get(start) <= pivot) {
                start++;
            }
            while (a1.get(end) > pivot) {
                end--;
            }
            if (start < end) {
                Collections.swap(a1, start, end);
            }
        }
        Collections.swap(a1, pivot, end);
        return end;
    }

    public static void QuickSort(ArrayList<Integer> a1, int lb, int ub) {
        if (lb < ub) {
            int loc = partition(a1, lb, ub);
            QuickSort(a1, lb, loc - 1);
            QuickSort(a1, loc + 1, ub);
        }
    }

    public static void main(String[] args) {
        int a[] = new int[]{5, 10, 2, 1, 11, 7, 9, 13, 4};
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        for (int i = 0; i < a.length; i++) {
            a1.add(a[i]);
        }
        System.out.println(a1);
        int lb, ub;
        lb = 0;
        ub = a1.size();
        System.out.println(ub);
        QuickSort(a1, lb, ub);

    }
}