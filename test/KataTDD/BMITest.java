package KataTDD;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BMITest {
    @Test
    public void BMIUnitTest(){
        BMI check = new BMI();
        assertEquals(27.0, check.HeightWeight(95.5,50));
    }
}