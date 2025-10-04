package arraysInJava;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CreateAMatrix {

    static void main(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean noError = false;

        System.out.println("This program will take numbers from you and put them in a Matrix ➡️");

        System.out.println();

        try{
            System.out.print("Enter the number of rows 🟰 ");
            int rows = Integer.parseInt(br.readLine());

            System.out.println();

            System.out.print("Enter the number of columns 🟰 ");
            int columns = Integer.parseInt(br.readLine());

            System.out.println();

            int[][] matrix = new int[rows][columns];

            for (int i = 0; i < rows; i++) {
                System.out.print("Enter the values of row "+(i+1)+" : ");

                String line = br.readLine().trim();

                String[] values = line.split("\\s+");

                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = Integer.parseInt(values[j]);
                }
            }
            System.out.println();

            System.out.println("your Matrix ➡️");
            for (int[] x : matrix){
                for(int y : x){
                    System.out.print(y+" ");
                }
                System.out.println();
            }

            noError = true;

        } catch (NumberFormatException e) {
            throw new NumberFormatException("Error ❌, please enter numbers only"+e.getMessage());
        } catch (IOException e) {
            System.out.println("Error ❌, something went wrong while taking inputs please check again"+e.getMessage());
        } finally {
            if(noError){
                System.out.println("ThankYou for trying out my small project 🙇");
            }
        }
    }
}
