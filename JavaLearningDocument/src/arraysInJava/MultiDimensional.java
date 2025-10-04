package arraysInJava;

public class MultiDimensional {

    static void main(){

        int[][] arr = new int[3][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print("["+i+","+j+"]"+" ");
            }
            System.out.println();
        }
    }
}
