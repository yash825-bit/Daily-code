package arraysInJava;

public class MultiDimensionalArray3 {

    static void main(){
        int[][] arr;
        arr = new int[][]{{1, 3, 6, 18},
                            {2, 3, 7, 2},
                            {19, 3, 14, 43}};
        for(int[] x : arr){
            for(int y : x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
}
