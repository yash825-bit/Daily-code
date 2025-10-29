package methodsInJava;

import java.util.Scanner;

public class MaxElementInAnArray {
    public static int maxEle(int[] arr){
        int maxElement = arr[0];
        for(int x : arr){
            if(x>maxElement){
                maxElement = x;
            }
        }
        return maxElement;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the sample array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the array : ");
        for(int i = 0; i < arr.length; i++){
            arr[i]  = sc.nextInt();
        }
        System.out.println(maxEle(arr));
    }
}
