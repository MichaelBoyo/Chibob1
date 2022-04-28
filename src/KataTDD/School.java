package KataTDD;

// prompt the student to enter his/her score
// if score is between 90 and 100, output A
// if score is between 80 and 89, output  B
// if score is between 70 and 79, output C
// if score is between 60 and 69, output D
// if score is below 60, output F


import java.util.Scanner;

public class School {
    public static void main(String... args){
        Scanner scoreInput = new Scanner(System.in);

        System.out.print("Enter your score: ");
        int score = scoreInput.nextInt();
        String grade = null;
            if(score >= 90 && score <= 100) grade = "A";
        if(score >= 80 && score <= 89) grade = "B";
        if(score >= 70 && score <= 79) grade = "C";
        if(score >= 60 && score <= 69) grade = "D";
        if(score < 60) grade = "F";

        System.out.printf("your grade is %s", grade );


    }
}
