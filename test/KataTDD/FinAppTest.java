package KataTDD;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FinAppTest {
    @Test
    public void finAppTest(){
        FinApp aje = new FinApp();
        assertEquals(609, aje.monthlySavings(100));
    }
}
