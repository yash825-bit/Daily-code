package methodsInJava;

public class CallingObjectsAsParameters {
    static void update(int[] arr){
        arr[0] = 25;
        for(int x: arr){
            System.out.print(x+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 3 , 4, 6};
        update(arr);
        for(int a : arr){
            System.out.print(a+" ");
        }
    }
}
