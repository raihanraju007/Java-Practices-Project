package hackerrank;

import java.util.Scanner;

public class JavaStringsIntroduction {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
//        int sum = A.length() + B.length();

        System.out.println(A.length() + B.length());

//        if (A.length() > B.length())
//            System.out.println("No");
//        else
//            System.out.println("Yes");

        A = A.replace(A.charAt(0), Character.toUpperCase(A.charAt(0)));
        B = B.replace(B.charAt(0), Character.toUpperCase(B.charAt(0)));

//        A = A.substring(0,1).toUpperCase()+A.substring(1);
//        B = B.substring(0,1).toUpperCase()+B.substring(1);

        System.out.println(A.compareTo(B)>0?"Yes":"No");

        System.out.println(A + " " + B);

    }
}
