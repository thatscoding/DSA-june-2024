package problems;
public class ReverseArray {
    static int[] reverseArray(int[] A){
        int i=0;
        int j=A.length-1;
        while(i<j){
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;
            j--;
        }
        return A;
    }

     static void printArray (int[] A){
        for(int element : A){
            System.out.print(element+" ");
        }
    }

    public static void main(String[] args) {
    int[] A = {10,20,30,40,50,60,70,80};
    A = reverseArray(A);
    printArray(A);

    }   
}
