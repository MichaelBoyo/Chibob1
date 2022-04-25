package tdd;

public class Kata {
    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
    public int subtract(int firstNumber, int secondNumber) {
        int difference =  firstNumber - secondNumber;
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
}