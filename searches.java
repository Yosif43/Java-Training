import java.util.Arrays;

public class searches {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "cherry", "date", "fig", "grape"};

        String target = "fig";

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target)) {
                System.out.println(i);
                break;
            }
        }

        Arrays.sort(words);
        int left = 0;
        int right = words.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = target.compareTo(words[mid]);

            if (cmp == 0) {
                System.out.println(mid);
                break;
            } else if (cmp < 0) {
                right = mid - 1; // Search left half
            } else {
                left = mid + 1; // Search right half
            }
        }
    }
}
