package methodsInJava;

public class MethodCalling {

    static void main(){
        MethodCalling mc = new MethodCalling();
        int a = 20, b = 14;
        System.out.println(mc.min(a, b));
    }
    int min(int x, int y){
        if(x<y)return x;
        return y;
    }
}
