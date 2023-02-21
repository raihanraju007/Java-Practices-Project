package hackerrank;

import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuffer AR = new StringBuffer(A);
        String A2 = AR.reverse().toString();

        if (A.equals(A2)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }
}
