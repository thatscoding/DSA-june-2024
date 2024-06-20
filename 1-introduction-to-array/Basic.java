import java.util.ArrayList;

public class Basic {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Welcome to Java!");

        // array
    //     int[] arr = new int[5];
    //     int[] arr2 = {11, 22, 33, 44, 55};
    //     arr = new int[]{1, 2, 3, 4, 5};


    //  for(int i=0;i<arr.length;i++){
    //     System.out.print(arr[i]+" ");
    //  }

    //  System.out.println();
    //  for(int element : arr2){
    //     System.out.print(element+" ");
    //  }

     // ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list.get(1));
        // list.remove(1);
        // list.clear();
        System.out.println(list);

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        
        }


        for(int ele : list){
            System.out.print(ele+" ");
        
        }
    }
}
