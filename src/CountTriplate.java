import java.util.Arrays;

public class CountTriplate {

    public static void main(String[] args){
        int[] arr= {12 ,8, 2, 11, 5, 14, 10};
        int n= 7;
        System.out.println(countTriplet(arr, n));
    }

    static int countTriplet(int[] arr, int n) {
        // code here

        int count = 0;
        Arrays.sort(arr);
        int start = 0;
        for (int i = 1; i < n-1; i++) {
            if (arr[start] + arr[i] == arr[i + 1]) {
                count++;
                start++;
            }
        }

        return count;

    }
}
