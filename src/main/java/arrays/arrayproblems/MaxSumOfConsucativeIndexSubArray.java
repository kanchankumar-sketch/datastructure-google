package arrays.arrayproblems;
//Brute force algorithm
public class MaxSumOfConsucativeIndexSubArray {
    public static int maxSumOfSubArray(int arr[], int n, int k) {
        if (n < k) {
            System.out.println("Invalid sub array length!");
            return -1;
        }
        int max = 0;
        for (int i = 0; i <= n - k; i++) {
            int subSum = 0;
            for (int j = i; j < i + k; j++) {
                subSum += arr[j];
            }
            max = max > subSum ? max : subSum;
        }
        return max;
    }

    public static void main(String[] args) {

        int arr[] = new int[]{0,23,-12,10,24,-17,9};
        int n=7;
        int k=3;
        System.out.println(maxSumOfSubArray(arr,n,k));
    }
}
