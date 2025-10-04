package arraysInJava;

public class MultiDimensionalArray2 {

    static void main(){
        int[][] arr;
        arr = new int[][]{{1, 2, 3, 4,},
                {3, 2, 1, 6},
                {2, 7, 9, 7}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
