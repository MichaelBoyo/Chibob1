package KataTDD;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {
    @Test
    public void additionTest() {
        Kata calculator = new Kata();
        assertEquals(8, calculator.add(2, 6));
    }
    @Test
    public void subtractionTest() {
        Kata calculator = new Kata();
        assertEquals(8, calculator.subtract(28, 20));
    }
    @Test
    public void absoluteSubtractionTest() {
        Kata calculator = new Kata();
        int result = calculator.subtract(2, 4);
        assertEquals(2, result);
    }
    @Test
    public void quotientTest() {
        Kata calculator = new Kata();
        assertEquals(5, calculator.division(10, 2));
    }
    @Test
    public void divisibleByZeroTurnsZeroTest() {
        Kata calculator = new Kata();
        assertEquals(0, calculator.division(10, 0));
    }
    @Test
    public void multiplicationTest() {
        Kata calculator = new Kata();
        assertEquals(20, calculator.multiply(10, 2));
    }
    @Test
    public void TestDrillerPrice1To4CopiesTest() {
        Kata chibob = new Kata();
        assertEquals(6000, chibob.noOfCopies(3));
    }
    @Test
    public void TestDrillerPrice5To9CopiesTest() {
        Kata chibob = new Kata();
        assertEquals(12600, chibob.noOfCopies(7));
    }
    @Test
    public void TestDrillerPrice10To29CopiesTest() {
        Kata chibob = new Kata();
        assertEquals(33600, chibob.noOfCopies(21));
    }
    @Test
    public void TestDrillerPrice30To49CopiesTest() {
        Kata chibob = new Kata();
        assertEquals(58500, chibob.noOfCopies(39));
    }
    @Test
    public void TestDrillerPrice50To99CopiesTest() {
        Kata chibob = new Kata();
        assertEquals(97500, chibob.noOfCopies(75));
    }
    @Test
    public void TestDrillerPrice100To199CopiesTest() {
        Kata chibob = new Kata();
        assertEquals(150000, chibob.noOfCopies(125));
    }
    @Test
    public void TestDrillerPrice200To499CopiesTest() {
        Kata chibob = new Kata();
        assertEquals(275000, chibob.noOfCopies(250));
    }
    @Test
    public void TestDrillerPrice5009CopiesTest() {
        Kata chibob = new Kata();
        assertEquals(500000, chibob.noOfCopies(500));
    }
    @Test
    public void areaOfTriangleTest(){
        Kata isoscelesTriangle = new Kata();
        assertEquals(34.0, isoscelesTriangle.sides(1.5,-3.4,4.6,5,9.5,-3.4));
    }
    @Test
    public void BMIUnitTest(){
        Kata check = new Kata();
        assertEquals(27.0, check.HeightWeight(95.5,50));
    }
    @Test
    public void finAppTest(){
        Kata aje = new Kata();
        assertEquals(609, aje.monthlySavings(100));
    }
    @Test
    public void getGradeTest() {
        Kata semicolon = new Kata();
        assertEquals("C", semicolon.setScore(70));
    }
    @Test
    public void ozumbaTest(){
        Kata ozumba = new Kata();
        assertEquals("pass", ozumba.setScoree(55));
    }
    @Test
    public void factorTest(){
        int factors = Kata.factors(5);
        assertEquals(2,factors);
        factors = Kata.factors(10);
        assertEquals(4,factors);
    }
}
