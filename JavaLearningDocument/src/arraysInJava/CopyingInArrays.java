package arraysInJava;

public class CopyingInArrays {

    static void main(){
        int[] arr = {1, 3, 4, 5, 8, 9, 4, 2, 2, 13};

        int[] arr2 = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        for(int j :  arr2){
            System.out.print(j + " ");
        }
    }
}
