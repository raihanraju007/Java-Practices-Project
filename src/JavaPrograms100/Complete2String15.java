package JavaPrograms100;

import java.util.Scanner;

public class Complete2String15 {
    public static void main(String[] args) {
//        15. How to complete 2 string in Java program
        String s1,s2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first string");
        s1 = sc.nextLine();

        System.out.println("Enter the second string");
        s2 = sc.nextLine();

        if (s1.compareTo(s2) > 0)
            System.out.println("First string is greater than second.");
        else if (s1.compareTo(s2) < 0)
            System.out.println("First string is smaller then second");
        else
            System.out.println("Both string are equal");
    }
}
