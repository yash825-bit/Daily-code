package methodsInJava;

public class MethodOverloadingAndVariableArguments {
    public static int add(int...x){
        int sum  = 0;
        for(int a : x){
            sum = sum + a;
        }
        return sum;
    }
    public static double add(double...x){
        double sum = 0;
        for(double a : x){
            sum = sum + a;
        }
        return sum;
    }
    public static float add(float...x){
        float sum = 0;
        for(float a : x){
            sum = sum + a;
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.println(add(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(add(2.3, 4.5, 9.8, 6.7));
    }
}
