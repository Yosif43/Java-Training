import java.util.Arrays;


public class Booking {
    public static int linearSearch(String[] arr, String target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(String[] arr, String target) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = target.compareTo(arr[mid]);

            if (cmp == 0) {
                return mid;
            } else if (cmp < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] words = {"apple", "banana", "cherry", "date", "fig", "grape"};

        String target = "cherry";

        int linearResult = linearSearch(words, target);
        System.out.printf("Linear Search: Found at index %d", linearResult);

        int binaryResult = binarySearch(words, target);
        System.out.printf("\nBinary Search (after sorting): Found at index %d", binaryResult);
    }
}