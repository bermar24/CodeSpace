package HashAndSort;

import java.util.Arrays;

//TODO Counting Sort
// Suitable for small integer ranges

public class countingSort {
    public static int[] main(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        int[] count = new int[max + 1];
        for (int num : arr) count[num]++;
        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (count[i]-- > 0) arr[index++] = i;
        }
        return arr;
    }
}
