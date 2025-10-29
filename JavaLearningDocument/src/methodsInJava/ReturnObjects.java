package methodsInJava;

import java.util.Scanner;

public class ReturnObjects {
    public static String findName(String email){
        int a = email.indexOf('@');
        return email.substring(0, a);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a valid email address : ");
        String email = sc.next();

        System.out.print("separated name from the given email address 🟰 ");
        System.out.println(findName(email));
    }
}
