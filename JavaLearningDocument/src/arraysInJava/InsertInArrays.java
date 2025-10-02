package arraysInJava;

import java.util.Scanner;

public class InsertInArrays {
    static void main(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the elements of the array: ");

        for (int i = 0; i < n-1; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the new element you want to add in the array: ");
        int ele = sc.nextInt();

        System.out.println("Enter the place where you want to place that element(eg. 0, 1, 2, 3...) : ");
        int k = sc.nextInt();

        insert(arr, ele, k);

        System.out.println("updated array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
    public static void insert(int[] arr, int ele, int k){
        for (int i = arr.length-1; i>k; i--) {
            arr[i] = arr[i-1];
        }
        arr[k] = ele;
    }
}
