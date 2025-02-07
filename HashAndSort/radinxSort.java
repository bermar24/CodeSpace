package HashAndSort;

// Todo Radix Sort
// Sorts numbers digit by digit using counting sort as a subroutine
// Best/Average/Worst: O(nk) where k is digit length

import java.util.Arrays;

public class radinxSort {
    public static int[] main(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        for (int exp = 1; max / exp > 0; exp *= 10) countingSortByDigit(arr, exp);
    return arr;
    }

    private static void countingSortByDigit(int[] arr, int exp) {
        int n = arr.length, output[] = new int[n], count[] = new int[10];
        for (int i : arr) count[(i / exp) % 10]++;
        for (int i = 1; i < 10; i++) count[i] += count[i - 1];
        for (int i = n - 1; i >= 0; i--) output[--count[(arr[i] / exp) % 10]] = arr[i];
        System.arraycopy(output, 0, arr, 0, n);
    }
}
