package JavaPrograms100;

import java.math.BigInteger;
import java.util.Scanner;

public class AddingLargeNumbers8 {
    public static void main(String[] args) {
        String number1, number2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first large number");
        number1 = sc.nextLine();

        System.out.println("Enter second large number");
        number2 = sc.nextLine();

        BigInteger first = new BigInteger(number1);
        BigInteger second = new BigInteger(number2);
        BigInteger sum;

        sum = first.add(second);
        System.out.println("Result of addition = " + sum);
    }
}
