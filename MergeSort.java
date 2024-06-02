import java.util.Scanner;

public class MergeSort {
    public static void mergesort(int[] ar, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergesort(ar, low, mid);        // Sort first part
            mergesort(ar, mid + 1, high);   // Sort second part
            merge(ar, low, mid, high);      // Merge the sorted parts
        }
    }

    public static void merge(int[] ar, int low, int mid, int high) {
        // Calculate the sizes of the two subarrays directly from the indices
        int i = low, j = mid + 1, k = 0;
        int[] br = new int[high - low + 1];

        // Merge the temporary arrays
        while (i <= mid && j <= high) {
            if (ar[i] <= ar[j]) {
                br[k++] = ar[i++];
            } else {
                br[k++] = ar[j++];
            }
        }

        // Copy remaining elements of the left subarray if any
        while (i <= mid) {
            br[k++] = ar[i++];
        }

        // Copy remaining elements of the right subarray if any
        while (j <= high) {
            br[k++] = ar[j++];
        }

        // Copy the merged array back to the original array
        for (i = low, k = 0; i <= high; i++, k++) {
            ar[i] = br[k];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] ar = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }

        mergesort(ar, 0, n - 1);

        System.out.print("\n\nThe sorted array is: ");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + "\t");
        }
    }
}