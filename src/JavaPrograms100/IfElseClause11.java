package JavaPrograms100;

import java.util.Scanner;

public class IfElseClause11 {
    public static void main(String[] args) {
        int marksObtained, passingMarks;
        passingMarks = 40;
        Scanner input = new Scanner(System.in);
        System.out.println("Input marks scored by you");
        marksObtained = input.nextInt();
        if (marksObtained >= passingMarks){
            System.out.println("You are pass the exam");
        }
        else {
            System.out.println("Unfortunately you failed to pass exam");
        }
    }
}
