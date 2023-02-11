package JavaPrograms100;

import java.util.Scanner;

public class LargestOfThreeNumbers9 {
    public static void main(String[] args) {
//        9.Find Largest no in java Program
        int x,y,z;
        System.out.println("Enter three integer ");
        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();

        if (x > y && x > z){
            System.out.println("First number is largest");
        } else if (y > z && y > z) {
            System.out.println("Second number is largest");
        }else if( z > x && z > y){
            System.out.println("Third number is largest");
        }else{
            System.out.println("Entered numbers are not distinct");
        }
    }
}
