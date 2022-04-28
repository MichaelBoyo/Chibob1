package KataTDD;

import java.util.Scanner;

public class Ozumba {
    // prompt the user for a score
    // if the score is less than 55, print that the test failed
    // if the score is above 55, print that the test passed
    public static void main(String... args){
        Scanner score = new Scanner(System.in);
        System.out.print("Enter your test score: ");
        int Score = score.nextInt();

        int passMark = 55;

        if(Score < passMark && Score > 0){
            System.out.println("You failed the test.. Do better next time");
        }
        if(Score >= passMark && Score < 100 ){
            System.out.println("You passed the test.. Bravo!!!");
        }
        if(Score > 100){
            System.out.print("idiot.. enter your correct score: ");
            int newScore = score.nextInt();
            if(newScore < passMark && newScore > 0){
                System.out.print("You failed the test.. Do better next time");
            }
            if(newScore >= passMark && newScore < 100 ){
                System.out.println("You passed the test.. Bravo!!!");
            }

        }
        if(Score < 0){
            System.out.print("mumu.. how can you have negative score? enter your correct score: ");
            int newScore = score.nextInt();
            if(newScore < passMark){
                System.out.print("You failed the test.. Do better next time");
            }
            if(newScore >= passMark && newScore < 100 ){
                System.out.println("You passed the test.. Bravo!!!");
            }
        }

    }
}
