package problems;

public class RotateArray {


/*
 *  Brute Force Approach
 *  TC : O(n2)
 *  SC : O(1)
 */
    static int[] rotateArray(int data[],int k){
        int lengthOfData =data.length-1;
        if(k<0 || k>=data.length) return data;

        for(int i=0;i<k;i++){
            int temp = data[lengthOfData];
            for(int j=lengthOfData;j>0;j--){
                data[j] = data[j-1];
            }
            data[0] = temp;
        }

        return data;
    }

/*
 *  Optimize Approach  
 *  TC : O(n2)
 *  SC : O(1)
 * 
 *  Step 1 : reverse array from 0 to n
 *  Step 2 : reverse array from 0 to k-1
 *  Step 3 : reverse array from k to n
 */


 static int[] reverseArray (int[] data){
    if(data.length ==0 || data.length==1) return data;


    int i=0;
    int j=data.length-1;
    while(i<j){
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
        i++;
        j--;
    }
    return data;
 }

  static int[] reverseArrayGivenRange (int[] data,int start,int end){
        if(end>=data.length || start<0) return data;
        
        while (start<end) {
            int temp = data[start];
            data[start] = data[end];
            data[end]= temp;
            start++;
            end--;
        }

        return data;
    }


    static void printArray (int[] A){
        for(int element : A){
            System.out.print(element+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int data [] = {1,2,3,4,5,6,7,8,9};
        int data2 [] = {1,2,3,4,5,6,7,8,9};
        int k = 4;
        // brute force approach
        data = rotateArray(data,k);
        printArray(data);

        // optimize approach
        data2 = reverseArray(data2);
        data2 = reverseArrayGivenRange(data2, 0,k-1);
        data2 = reverseArrayGivenRange(data2, k, data2.length-1);
        printArray(data2);


    }
}
