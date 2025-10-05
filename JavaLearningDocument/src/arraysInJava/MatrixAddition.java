package arraysInJava;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MatrixAddition {

    static void main(){

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("I can Help with Adding Two Matrices 😊");
        System.out.println();

        try{
            System.out.println("A matrix can be added or subtracted only if they have same number of rows and columns ❕");
            //first matrix
            System.out.println("Lets proceed by taking values of rows and columns ⬇️");
            System.out.println();

            System.out.println("Enter the number of rows : ");//rows input
            int rows = Integer.parseInt(br.readLine());

            System.out.println("Enter the number of columns : ");//column input
            int columns = Integer.parseInt(br.readLine());

            System.out.println();
            System.out.println("Now we will take the values of first Matrix row by row ✔️");
            System.out.println();

            int[][] matrix1 = new int[rows][columns];
            matrixInput(matrix1, rows, columns);//matrix 1 input with separate method for taking inputs

            System.out.println();
            System.out.println("Now we will take the values of second Matrix row by row ✔️");
            System.out.println();

            int[][] matrix2 = new int[rows][columns];
            matrixInput(matrix2, rows, columns);//matrix 2 input with separate method for taking inputs

            System.out.println();
            System.out.println("Matrix after Addition of matrix 1 and matrix 2 ⬇️");
            AddedMatrix(matrix1, matrix2, rows, columns);

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

                System.out.println("Enter the values of row "+(i+1)+" 🟰 ");
                String line = br.readLine().trim();

                String[] values = line.split("\\s+");

                for (int j = 0; j < columns; j++) {
                    arr[i][j] = Integer.parseInt(values[j]);
                }
            }
        }catch (NumberFormatException e){
            System.out.println("❌ Error, Please enter number values only"+e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException("❌ Error, Something went wrong while taking value"+e.getMessage());
        }
    }
    public static void AddedMatrix(int[][] arr, int[][] arr2, int r, int c){
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                System.out.print(arr[i][j]+arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
