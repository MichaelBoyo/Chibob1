package KataTDD;

import org.junit.jupiter.api.Test;
import tdd.Kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {
    @Test
    public void additionTest(){
        Kata calculator = new Kata();
        assertEquals(8, calculator.add(2,6));
    }
    @Test
    public void subtractionTest(){
        Kata calculator = new Kata();
        assertEquals(8, calculator.subtract(28,20));
    }
    @Test
    public void absoluteSubtractionTest(){
        Kata calculator = new Kata();
        int result = calculator.subtract(2,4);
        assertEquals(2, result);
    }
    @Test
    public void quotientTest(){
        Kata calculator = new Kata();
        assertEquals(5, calculator.division(10,2));
    }
    @Test
    public void divisibleByZeroTurnsZeroTest(){
        Kata calculator = new Kata();
        assertEquals(0, calculator.division(10,0));
    }
    @Test
    public void multiplicationTest(){
        Kata calculator = new Kata();
        assertEquals(20, calculator.multiply(10,2));
    }
}