package arraysInJava;

public class RaggedArrays {

    static void main(){

        int[][] arr  = new int[3][];
        arr[0] = new int[]{1, 3};
        arr[1] = new int[]{3, 5, 7};
        arr[2] = new int[]{1, 5, 2, 9, 10};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
