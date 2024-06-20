package problems;

public class ReverseGivenRange {



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
    }

    public static void main(String[] args) {
        int[] A = {1,2,3,4,5,6,7,8,9};
        int reverArr[] = reverseArrayGivenRange(A, 2, 5);
        printArray(reverArr);



    }
}
