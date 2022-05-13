package KataTDD;

import java.util.Arrays;

import static java.lang.Math.round;

public class Kata {
    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtract(int firstNumber, int secondNumber) {
        int difference = firstNumber - secondNumber;
        if (secondNumber >= firstNumber) difference = secondNumber - firstNumber;
        return difference;
    }

    public int division(int firstNumber, int secondNumber) {
        if (secondNumber == 0) return 0;
        return firstNumber / secondNumber;
    }

    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int noOfCopies(int noOfCopies) {
        int price = 0;
        if (noOfCopies > 0 && noOfCopies <= 4) price = 2000 * noOfCopies;
        if (noOfCopies >= 5 && noOfCopies <= 9) price = 1800 * noOfCopies;
        if (noOfCopies >= 10 && noOfCopies <= 29) price = 1600 * noOfCopies;
        if (noOfCopies > 29 && noOfCopies <= 49) price = 1500 * noOfCopies;
        if (noOfCopies > 49 && noOfCopies <= 99) price = 1300 * noOfCopies;
        if (noOfCopies > 99 && noOfCopies <= 199) price = 1200 * noOfCopies;
        if (noOfCopies > 199 && noOfCopies <= 499) price = 1100 * noOfCopies;
        if (noOfCopies > 499) price = 1000 * noOfCopies;
        return price;
    }

    public int sides(double PointX1, double PointY1, double PointX2, double PointY2, double PointX3, double PointY3) {
        double area = (PointX1 * (PointY2 - PointY3) + PointX2 * (PointY3 - PointY1) + PointX3 * (PointY1 - PointY2)) / 2;
        return (int) Math.abs(round(area));

    }

    public double HeightWeight(double weight, int height) {
        double WeightInKg = weight * 0.45359237;
        double HeightInMeters = height * 0.0254;

        return round(WeightInKg / Math.pow(HeightInMeters, 2));
    }

    public int monthlySavings(int MonthlyAmount) {
        double month1 = MonthlyAmount * 1.00417;
        double month2 = (MonthlyAmount + month1) * 1.00417;
        double month3 = (MonthlyAmount + month2) * 1.00417;
        double month4 = (MonthlyAmount + month3) * 1.00417;
        double month5 = (MonthlyAmount + month4) * 1.00417;
        return (int) round(((MonthlyAmount + month5) * 1.00417));
    }

    public String setScore(int score) {
        String grade = null;
        if (score >= 90 && score <= 100) grade = "A";
        if (score >= 80 && score <= 89) grade = "B";
        if (score >= 70 && score <= 79) grade = "C";
        if (score >= 60 && score <= 69) grade = "D";
        if (score < 60) grade = "F";
        return grade;
    }

    public String setScoree(int scoree) {
        String result = null;
        if (scoree < 55) result = "fail";
        if (scoree >= 55) result = "pass";
        return result;

    }
    public static int factors(int number){
        int factors =0;
        for(int i =1; i<=number; i++){
            if(number%i == 0){
                factors = factors+1;
            }
        }
        return factors;
    }
}

