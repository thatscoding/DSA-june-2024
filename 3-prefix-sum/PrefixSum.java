public class PrefixSum {

    /*
     * Brute force approach
     *  TC-> O(n2)
     */
    // static int[] calculatePrefixSum(int[] arr) {
    //     int n = arr.length;
    //     int prefixSumArr[] = new int[n];
    //     for (int i = 0; i < n; i++) {
    //         int sum = 0;
    //         for (int j = 0; j <= i; j++) { // Corrected the loop condition and increment
    //             sum += arr[j];
    //         }
    //         prefixSumArr[i] = sum;
    //     }
    //     return prefixSumArr;
    // }

    /*
     * Optimize approach
     * TC=> O(n)
     *
     */
    static int[] calculatePrefixSum(int[] arr) {
        int n = arr.length;
        int prefixSumArr[] = new int[n];
        prefixSumArr[0] = arr[0];
        for (int i = 1; i < n; i++) {           
            prefixSumArr[i] = prefixSumArr[i-1]+arr[i];
        }
        return prefixSumArr;
    }

    static void printArray(int[] A) {
        for (int element : A) {
            System.out.print(element + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int prefixSumArr[] = calculatePrefixSum(arr);
        printArray(prefixSumArr);
      
}
}
