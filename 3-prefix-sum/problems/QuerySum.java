import java.util.ArrayList;

public class QuerySum {

// /*
//  * Brute Force approach
//  *  TC -> O(n*q)
//  *  SC -> O(1)
//  */
//     static ArrayList<Integer> calculateQuerySum (int[] stock,int[][] query){
//         int queryLength = query.length;
//         int sum=0;
//         ArrayList<Integer> answerArr = new ArrayList<>();
//         for(int i=0;i<queryLength;i++){
//             int left = query[i][0] -1;
//             int right = query[i][1] -1;
//             sum=0;
//             for(int j=left;j<=right;j++){
//                 sum += stock[j];
//             }
//             answerArr.add(sum);
//         }

//         return answerArr;
//     }




    /*
 * Optimize Approach (using prefix sum)
 *  TC -> O(n)
 *  SC -> O(n)
 */

static ArrayList<Integer> calculateQuerySum (int[] stock,int[][] query){
    int queryLength = query.length;
    int sum=0;

    int prefixSumArr[] = new int[stock.length];
    prefixSumArr[0]= stock[0];
    for(int i=1;i<stock.length;i++){
        prefixSumArr[i] = prefixSumArr[i-1]+ stock[i];
    }

    ArrayList<Integer> answerArr = new ArrayList<>();
    for(int i=0;i<queryLength;i++){
        int left = query[i][0] -1;
        int right = query[i][1] -1;
        sum=0;
        if(left==0){
            sum = prefixSumArr[right];
        }else{
            sum = prefixSumArr[right]- prefixSumArr[left-1];
        }
        answerArr.add(sum);

    }

    return answerArr;
}

    static void printArray(ArrayList<Integer> A) {
        for (int element : A) {
            System.out.print(element + " ");
        }
    }

    public static void main(String[] args) {
        int stock[] = {-5,10,20,40,50,-10,80,-90,-20,-10};
        int[][] range = {{1,1},{1,2},{2,5},{8,10},{3,8}};

        ArrayList<Integer> answerArr = calculateQuerySum(stock, range);
        printArray(answerArr);
    }
}
