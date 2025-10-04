package arraysInJava;

public class IncreasingSizeOfAnArrayManually {
    static void main(){

        int[] arr = {4, 5, 1, 3 , 8, 10};

        System.out.println("Size of array 1: "+arr.length);

        int[] arr2 = new int[arr.length*2];

        System.arraycopy(arr, 0, arr2, 0, arr.length);
        arr = arr2;

        System.out.print("The new size of the same array1 : "+ arr.length);
    }
}
