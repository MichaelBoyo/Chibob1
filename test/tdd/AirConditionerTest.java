package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {
    @Test
    public void putOnACTest() {
        AirConditioner lg = new AirConditioner();   // i have an ac
        lg.putOn(true);                        // when I turn it on
        assertTrue(lg.getStatus());                  // it is on
    }

    @Test
    public void putOffACTest() {
        AirConditioner sony = new AirConditioner();
        sony.putOn(true);                      //my ac is on
        sony.putOn(false);                     // when I turn it off
        assertFalse(sony.getStatus());                // it is off
    }

    @Test
    public void increaseTempTest() {
        AirConditioner hiSense = new AirConditioner();
        hiSense.putOn(true);                           //my ac is on
        hiSense.increaseTemp(5);
        assertEquals(21, hiSense.getTemp());
    }

    @Test
    public void decreaseTempTest() {
        AirConditioner samsung = new AirConditioner();
        samsung.putOn(true);                          //my ac is on
        samsung.increaseTemp(1);                   // when I increase temperature it increases
        samsung.decreaseTemp(1);                   // when I reduce temperature
        assertEquals(16, samsung.getTemp());                     // assert that it reduces

    }
}