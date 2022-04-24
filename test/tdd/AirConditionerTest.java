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
        hiSense.increaseTemp(16);                    // when I increase temperature
        assertEquals(16, hiSense.getTemp());                      // it increases
    }

    @Test
    public void decreaseTempTest() {
        AirConditioner samsung = new AirConditioner();
        samsung.putOn(true);                          //my ac is on
        samsung.increaseTemp(30);                   // when I increase temperature it increases
        samsung.decreaseTemp(29);                   // when I reduce temperature
        assertEquals(29, samsung.getTemp());                     // assert that it reduces

    }

    @Test
    public void increaseTempBeyond30Test() {
        AirConditioner midea = new AirConditioner();
        midea.putOn(true);                          //my ac is on
        midea.increaseTemp(31);                   // when I increase the temperature more than 30
        assertEquals(30, midea.getTemp());  // assert that temp remains 30
    }

    @Test
    public void reduceTempBelow16Test() {
        AirConditioner haierThermocool = new AirConditioner();
        haierThermocool.putOn(true);                         //my ac is on
        haierThermocool.increaseTemp(16);                  // when I increase temperature it increases
        haierThermocool.decreaseTemp(13);                      // when I reduce temp less than 16
        assertEquals(16, haierThermocool.getTemp()); // assert that temp remains 16
    }
}