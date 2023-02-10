package JavaPrograms100;

import java.util.Scanner;

public class UsingInput4 {
    public static void main(String[] args) {
//        4.How to get Using input using Scanner Program in java
        int a;
        float b;
        String s;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an string");
        s = sc.nextLine();
        System.out.println("You are entered string: " + s);

        System.out.println("Enter an integer");
        a = sc.nextInt();
        System.out.println("You entered integer : " + a);

        System.out.println("Enter an float");
        b = sc.nextFloat();
        System.out.println("You are entered float : " + b);
    }
}
