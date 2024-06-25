import java.util.ArrayList;
/**
 * QueryEvenSum
 */
public class QueryEvenSum {



    /*
     *   Brute force approach
     *  TC-> O(q*n)
     *  SC -> O(1)
     *  
     */
    static ArrayList<Integer> getQuerySum(int[] stock,int[][] query){
        ArrayList<Integer> answerArr = new ArrayList<>();
        int n= stock.length;
        int q = query.length;

        for(int i=0;i<q;i++){
            int s= query[i][0];
            int e = query[i][1];
            int sum =0;
            for(int j=s;j<=e;j++){
                if(j%2==0){
                    sum+= stock[j];
                }
            }
            answerArr.add(sum);
        }
        return answerArr;

    }


    /*
     *   Optimize approach
     *  TC-> O(n)
     *  SC -> O(n)
     *  
     */
    // static ArrayList<Integer> getQuerySum(int[] stock,int[][] query){
    //     ArrayList<Integer> answerArr = new ArrayList<>();
    //     int n= stock.length;

    //     // calculate prefix sum
    //     int[] pfsum = new int[n];
    //     pfsum[0]= stock[0];
    //     for(int i=1;i<n;i++){
    //         if(i%2 ==0){
    //             pfsum[i] = stock[i] + pfsum[i-1];
    //         }else{
    //             pfsum[i] = pfsum[i-1];
    //         }
    //     }


    //     for(int i=0;i<query.length;i++){
    //         int s= query[i][0];
    //         int e = query[i][1];
    //         int sum =0;
    //         if(s==0){
    //             sum = pfsum[e];
    //         }else{
    //             sum = pfsum[e] - pfsum[s-1];
    //         }   
    //         answerArr.add(sum);
    //     }



    //     return answerArr;

    // }


    static void printArray(ArrayList<Integer> A) {
        for (int element : A) {
            System.out.print(element + " ");
        }
    }

    public static void main(String[] args) {
        int stock[] = {2,3,1,6,4,5};
        int query[][] = {{1,3},{2,5},{0,4},{3,3}};
        
        printArray(getQuerySum(stock, query));

    }
}