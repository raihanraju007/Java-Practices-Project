package JavaPrograms100;

import java.util.Scanner;

public class AddNumbers8 {
    public static void main(String[] args) {
//        8.How to add two number Program in java
        int x, y, z;
        System.out.println("Enter two integers to calculate their sum ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        z = x + y;
        System.out.println("Sum of entered integers = " + z);
    }
}
