package arraysInJava;

import java.util.Scanner;

public class IncreasingSizeOfAnArrayManually {
    static void main(){

        int[] arr = {4, 5, 1, 3 , 8, 10};

        System.out.println("Size of array 1: "+arr.length);

        int[] arr2 = new int[arr.length*2];

        for(int i = 0; i < arr.length; i++){
            arr2[i] = arr[i];
        }
        arr = arr2;
        arr2 = null;

        System.out.print("The new size of the same array1 : "+ arr.length);
    }
}
