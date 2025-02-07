package HashAndSort;

//    TODO Merge sort
// Divide & Conquer, stable sorting
// O(n log n) for all cases, requires extra space
//    O = Operation
//    n = number of elements

public class mergeSort {
    public static int[] main(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            main(arr, left, mid);
            main(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
        return arr;
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1, n2 = right - mid;
        int[] L = new int[n1], R = new int[n2];
        System.arraycopy(arr, left, L, 0, n1);
        System.arraycopy(arr, mid + 1, R, 0, n2);
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) arr[k++] = (L[i] <= R[j]) ? L[i++] : R[j++];
        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }
}
