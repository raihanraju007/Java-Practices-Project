package hackerrank;

import java.util.Arrays;
import java.util.Scanner;
    public class JavaAnagrams {

        static boolean isAnagram(String a, String b) {
            // Complete the function
            char x[] = a.toLowerCase().toCharArray();
            char y[] = b.toLowerCase().toCharArray();
            Arrays.sort(x);
            Arrays.sort(y);
            boolean result = Arrays.equals(x,y);
            return result;
        }


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String a = scan.next();
            String b = scan.next();
            scan.close();
            boolean ret = isAnagram(a, b);
            System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        }
    }

