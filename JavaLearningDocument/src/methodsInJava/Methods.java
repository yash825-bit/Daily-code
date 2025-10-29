package methodsInJava;

import java.util.Scanner;

public class Methods {

    void main(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number 🟰 ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number 🟰 ");
        int num2 = sc.nextInt();

        System.out.println("the maximum number is 🟰 "+max(num1,num2));
    }

    int max(int x, int y){
        if(x>y)return x;
        return y;
    }
}
