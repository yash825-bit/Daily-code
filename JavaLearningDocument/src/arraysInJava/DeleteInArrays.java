package arraysInJava;

import java.util.Scanner;

public class DeleteInArrays {

    static void main(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element you want to remove : ");
        int k = sc.nextInt();

//        System.out.println(findElement(arr, k));

        deleteElement(arr, findElement(arr, k));

        System.out.print("Updated array : ");
        for (int j : arr) {
            System.out.print(j + " ");
        }

    }
    public static int findElement(int[] arr, int k){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == k)return i;
        }
        return -1;
    }
    public static void deleteElement(int[] arr, int l){
        for(int i = l+1; i < arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = 0;
    }
}
