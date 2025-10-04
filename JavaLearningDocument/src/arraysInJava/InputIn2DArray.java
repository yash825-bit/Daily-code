package arraysInJava;

import java.util.Scanner;

public class InputIn2DArray {

    static void main(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows you want int the matrix : ");
        int row= sc.nextInt();

        System.out.print("Enter the number of columns your want in the matrix : ");
        int column = sc.nextInt();

        int[][] arr = new int[row][column];

        System.out.print("Enter the elements of the matrix : ");
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < column ; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("the matrix is : ");

        for(int[] x : arr){
            for(int y : x){
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
