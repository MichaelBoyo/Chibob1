package KataTDD;

import org.junit.jupiter.api.Test;
import tdd.TestDriller;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDrillerTest {
    @Test
    public void TestDrillerPrice1To4CopiesTest(){
    TestDriller chibob = new TestDriller();
    assertEquals(6000, chibob.noOfCopies(3));
}
    @Test
    public void TestDrillerPrice5To9CopiesTest() {
        TestDriller chibob = new TestDriller();
        assertEquals(12600, chibob.noOfCopies(7));
    }
    @Test
    public void TestDrillerPrice10To29CopiesTest(){
        TestDriller chibob = new TestDriller();
        assertEquals(33600, chibob.noOfCopies(21));
    }
    @Test
    public void TestDrillerPrice30To49CopiesTest(){
        TestDriller chibob = new TestDriller();
        assertEquals(58500, chibob.noOfCopies(39));
    }
    @Test
    public void TestDrillerPrice50To99CopiesTest(){
        TestDriller chibob = new TestDriller();
        assertEquals(97500, chibob.noOfCopies(75));
    }
    @Test
    public void TestDrillerPrice100To199CopiesTest(){
        TestDriller chibob = new TestDriller();
        assertEquals(150000, chibob.noOfCopies(125));
    }
    @Test
    public void TestDrillerPrice200To499CopiesTest(){
        TestDriller chibob = new TestDriller();
        assertEquals(275000, chibob.noOfCopies(250));
    }
    @Test
    public void TestDrillerPrice5009CopiesTest(){
        TestDriller chibob = new TestDriller();
        assertEquals(500000, chibob.noOfCopies(500));
    }

}

