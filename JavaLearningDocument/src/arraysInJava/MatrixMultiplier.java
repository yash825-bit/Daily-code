package arraysInJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatrixMultiplier {

    static void main(){

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("I can help you in multiplication of matrices 😊");
        System.out.println();
        System.out.print("Note ➡️ to multiply matrices the columns of first matrix \n" +
                "must be equal to the rows of second matrix");
        System.out.println();
        System.out.println();
        try{
            System.out.print("Let us start by taking values for first matrix, shall we ❔");
            System.out.println();

            System.out.print("Enter the number of rows : ");
            int row1 = Integer.parseInt(br.readLine());

            System.out.print("Enter the number of columns : ");
            int column1 = Integer.parseInt(br.readLine());

            int[][] arr1 = new int[row1][column1];

            matrixInput(arr1, row1, column1);

            System.out.println();

            System.out.print("Now, lets move on to taking values for second matrix ⬇️");
            System.out.println();

            System.out.print("Enter the number of rows : ");
            int row2 = Integer.parseInt(br.readLine());

            System.out.print("Enter the number of columns : ");
            int column2 = Integer.parseInt(br.readLine());

            int[][] arr2 = new int[row2][column2];

            matrixInput(arr2, row2, column2);
            System.out.println();

            System.out.println("The result matrix ⬇️");
            matrixMultiply(arr1, row1, column1, arr2, row2, column2);

        }catch (NumberFormatException e){
            System.out.println("❌ Error, Please enter number values only"+e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException("❌ Error, Something went wrong while taking value"+e.getMessage());
        }
    }
    public static void matrixInput(int[][] arr, int rows, int columns){

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
            for (int i = 0; i < rows; i++) {

                System.out.print("Enter the value of row "+(i+1)+" 🟰 ");

                String lines = br.readLine().trim();

                String[] values = lines.split("\\s+");

                for (int j = 0; j < columns; j++) {
                    arr[i][j] = Integer.parseInt(values[j]);
                }
            }
        } catch (NumberFormatException e){
            System.out.println("❌ Error, Please enter numbers only"+e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException("❌ Error, something went wrong while taking the input"+e.getMessage());
        }
    }
    public static void matrixMultiply(int[][] arr, int row1, int col1, int[][] arr2, int row2, int col2){
        if(col1 ==  row2) {
            int[][] c = new int[row1][col2];
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col2; j++) {
                    for (int k = 0; k < col1; k++) {
                        c[i][j] += arr[i][k] * arr2[k][j];
                    }
                }
            }
            printMat(c, row1, col2);
        }else{
            System.out.println("Invalid input in the rows and columns hence, the given matrices cannot be multiplied");
        }
    }
    public static void printMat(int[][] arr, int row1 , int col2){
        for(int i = 0; i < row1 ; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
