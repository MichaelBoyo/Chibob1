package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AirConditionerTest{
    @Test
    public void putOnACTest(){
        AirConditioner lg = new AirConditioner();   // i have an ac
        lg.putOn(true);                        // when i turn it on
        assertTrue(lg.getState());                  // it is on
    }
    @Test
    public void putOffACTest(){
        AirConditioner lg = new AirConditioner();
        lg.putOn(true);                      //my ac is on
        lg.putOff(true);                     // when i turn it off
        assertTrue(lg.getState());                // it is off
    }
    @Test
    public void increaseTempTest(){
        AirConditioner lg = new AirConditioner();
        lg.putOn(true);                           //my ac is on
        lg.increaseTemp(true);                    // when i increase temperature
        assertTrue(lg.getTemp());                      // it increases
    }
    @Test
    public void decreaseTempTest(){
        AirConditioner lg = new AirConditioner();
        lg.putOn(true);                          //my ac is on
        lg.increaseTemp(true);                   // when i increase temperature it increases
        lg.decreaseTemp(true);                   // when i reduce temperature
        assertTrue(lg.getTemp());                     // assert that it reduces

    }
    @Test
    public void increaseTempBeyond30Test(){
        AirConditioner lg = new AirConditioner();
        lg.putOn(true);                          //my ac is on
        lg.increaseTemp(true);                   // when i increase temperature it increases
        lg.increaseTempValue(31);                     // when i increase temp more than 30
        assertEquals(30, lg.getTempValue());  // assert that temp remains 30
    }
    @Test
    public void reduceTempBelow16Test(){
        AirConditioner lg = new AirConditioner();
        lg.putOn(true);                         //my ac is on
        lg.increaseTemp(true);                  // when i increase temperature it increases
        lg.reduceTempValue(14);                      // when i reduce temp less than 16
        assertEquals(16, lg.getTempValue()); // assert that temp remains 16
    }
}