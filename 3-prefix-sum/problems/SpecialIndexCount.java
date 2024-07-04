public class SpecialIndexCount {
 /*
  *  Special Index
     those indices or index after removing which ,
     sum of all even index  === sum of all odd index
  */


  //1. Calculate prefix sum even array and prefix sum odd sum array
  //2.  

  static int findSpecialIndex(int[] arr) {
    int ans = 0;
    int n = arr.length;
    if (n == 0) return 0; // Handle empty array case
    
    int[] prefixEven = new int[n];
    int[] prefixOdd = new int[n];

    prefixEven[0] = arr[0];
    prefixOdd[0] = 0;

    for (int i = 1; i < n; i++) {
        if (i % 2 == 0) {
            prefixEven[i] = prefixEven[i - 1] + arr[i];
            prefixOdd[i] = prefixOdd[i - 1];
        } else {
            prefixOdd[i] = prefixOdd[i - 1] + arr[i];
            prefixEven[i] = prefixEven[i - 1];
        }
    }

    for (int i = 0; i < n; i++) {
        int evenSum = 0;
        int oddSum = 0;
        if (i == 0) {
            evenSum = prefixEven[n - 1] - arr[0];
            oddSum = prefixOdd[n - 1];
        } else {
            evenSum = prefixEven[i - 1] + prefixOdd[n - 1] - prefixOdd[i];
            oddSum = prefixOdd[i - 1] + prefixEven[n - 1] - prefixEven[i];
        }
        if (evenSum == oddSum) {
            ans++;
        }
    }
    return ans;
}


 public static void main(String[] args) {
    int[] arr = {4,3,2,7,6,-2};
    int ans =findSpecialIndex(arr);
    System.out.println(ans);

 }   
}
