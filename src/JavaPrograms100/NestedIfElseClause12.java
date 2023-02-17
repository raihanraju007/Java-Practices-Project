package JavaPrograms100;

import java.util.Scanner;

public class NestedIfElseClause12 {
    public static void main(String[] args) {
        int markObtained, passingMarks;
        char grade;

        passingMarks = 40;
        Scanner input = new Scanner(System.in);
        System.out.println("Input marks scored by you");

        markObtained = input.nextInt();

        if (markObtained >= passingMarks){
            if (markObtained >= 90){
                grade = 'A';
            } else if(markObtained >= 75){
                grade = 'B';
            } else if (markObtained > 60) {
               grade = 'C';
            }
            else
                grade = 'D';
            System.out.println("You are pass in the exam your grade is " + grade);
        }
        else {
            grade = 'F';
            System.out.println("You failed and you grade is " + grade);
        }
    }
}
