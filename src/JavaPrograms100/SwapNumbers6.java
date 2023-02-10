package JavaPrograms100;

import java.util.Scanner;

public class SwapNumbers6 {
    public static void main(String[] args) {
//        6.How to swap 2 no using 3rd variable Program in java
        int x,y,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x and y");

        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println("Before Swapping \nx = " +x+ "\ny = " + y);

        temp = x;
        x = y;
        y = temp;
        System.out.println("After Swapping \nx = "+x+ "\ny = "+y);
    }
}
