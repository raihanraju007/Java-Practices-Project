package JavaPrograms100;

import java.util.Scanner;

public class WhileLoop19 {
    public static void main(String[] args) {
//        While loop Program in java
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input an integer");

        while ((n = sc.nextInt()) != 0){
            System.out.println("You entered " + n);
            System.out.println("Input an integer");
        }
        System.out.println("Out of loop");
    }
}
