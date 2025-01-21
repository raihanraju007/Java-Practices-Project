package JavaPrograms100.raju2025;

import java.util.Scanner;

public class SwapNumberUse3Variable {
    public static void main(String[] args) {
        int x,y, temp;
        System.out.println("Enter x and y");
        Scanner input = new Scanner(System.in);

        x = input.nextInt();
        y = input.nextInt();

        System.out.println("Before swapping \n x = "+x+ "\n y = "+y);

        temp = x + y;
        x = temp - x;
        y = temp - y;
        System.out.println("After swapping \n x = "+x+ "\n y = "+y);
    }
}
