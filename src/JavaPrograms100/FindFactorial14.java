package JavaPrograms100;

import java.util.Scanner;

public class FindFactorial14 {
    public static void main(String[] args) {
//        14. Find factorial for given no Program in Java
        int n, c, fact = 1;

        System.out.println("Enter an integer to calculate it's factorial");
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        if (n<0)
            System.out.println("Number should be non-negative");
        else
        {
            for (c = 1; c <= n; c++)
                fact = fact * c;
            System.out.println("Factorial of "+n+ " is = "+fact);
        }
    }
}
