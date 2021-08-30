import java.util.Arrays;

public class CountTriplate {

    int countTriplet(int[] arr, int n) {
        // code here

        int count = 0;
        Arrays.sort(arr);
        int start = 0;
        for (int i = 1; i < n; i++) {
            if (arr[start] + arr[i] == arr[i + 1]) {
                count++;
                start++;
            }
        }

        return count;

    }
}
