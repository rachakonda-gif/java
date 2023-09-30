import java.util.*;

public class binary {
    public static void find(int num[], int key) {
        int start = 0;
        int end = num.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (num[mid] == key) {
                System.out.println(mid);
            }
            if (num[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        // System.out.println("key not found");

    }

    public static void main(String args[]) {
        int num[] = { 1, 3, 4, 5, 7, 8, 9, 10, 12 };
        int key = 12;
        find(num, key);
    }
}