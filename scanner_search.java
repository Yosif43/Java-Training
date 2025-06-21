import java.util.Arrays;
import java.util.Scanner;

public class scanner_search {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = {"apple", "banana", "cherry", "date", "fig", "grape"};

        String target = scanner.nextLine();

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target)) {
                System.out.println(i);
                break;
            }
        }

        Arrays.sort(words);

        int index = Arrays.binarySearch(words, target);

        if (index >= 0) {
            System.out.println(index);
        } else {
            System.out.println("Not found");
        }

    }
 }
