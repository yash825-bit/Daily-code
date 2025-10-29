package methodsInJava;

public class CallingPrimitiveValuesAsParameters {
    public static void increment(int a){
        a++;
        System.out.println(a);
    }
    public static void main(String[] args){
        int x = 10;
        increment(x);
        System.out.println(x);
    }
}
