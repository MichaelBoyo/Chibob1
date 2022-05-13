package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
    @Test
    public void theBikeCanBePutOnTest() {
        Bike bajaj = new Bike();             // given I have a bike
        bajaj.isOn(true);               // when I turn on the bike
        assertTrue(bajaj.checkStatus());      // assert that the bike is on
    }

    @Test
    public void theBikeCanBePutOffTest() {
        Bike bajaj = new Bike();               // given I have a bike
        bajaj.isOn(true);                 // and it is turned on
        bajaj.isOn(false);                // when I put off the bike
        assertFalse(bajaj.checkStatus());       // assert that the bike is off
    }

    @Test
    public void engageGear() {
        Bike suzu = new Bike();                         // given I have a bike
        suzu.isOn(true);                           // when I put it on
        suzu.engageGear(true);                        // and I engage gear
        assertTrue(suzu.checkGearStatus());      // assert that the gear is initially  0
    }


    @Test
    public void accelerateTest() {
        Bike kawa = new Bike();                         // given I have a bike
        kawa.isOn(true);                           // and I put it on
        kawa.engageGear(true);                        // and I engage gear
        kawa.accelerate();
        kawa.accelerate();
        kawa.accelerate();
        kawa.accelerate();
        kawa.accelerate();
        kawa.accelerate();
        kawa.accelerate();
        kawa.accelerate();
        kawa.accelerate();
        kawa.accelerate();
        kawa.accelerate();
        kawa.accelerate();
        kawa.accelerate();
        kawa.accelerate();
        kawa.accelerate();
        kawa.accelerate();
        kawa.accelerate();
        kawa.accelerate();
        kawa.accelerate();
        kawa.accelerate();
        kawa.accelerate(); //speed is 23
        kawa.accelerate();
        kawa.accelerate();
        kawa.accelerate();
        kawa.accelerate();
        kawa.accelerate();
        kawa.accelerate();
        kawa.accelerate();

        assertEquals(47, kawa.getSpeed());
        assertEquals(4,kawa.getGearNumber());
    }
    @Test
    public void decelerateTest() {
        Bike kawa = new Bike();                         // given I have a bike
        kawa.isOn(true);                           // and I put it on
        kawa.engageGear(true);                        // and I engage gear
        kawa.accelerate();
        kawa.accelerate();
        kawa.accelerate();
        kawa.accelerate();
        kawa.accelerate();
        kawa.accelerate();
        kawa.accelerate();
        kawa.accelerate();
        kawa.accelerate();
        kawa.accelerate();
        kawa.accelerate();
        kawa.accelerate();
        kawa.accelerate();
        kawa.accelerate();
        kawa.accelerate();
        kawa.accelerate();
        kawa.accelerate();
        kawa.accelerate();
        kawa.accelerate();
        kawa.accelerate();
        kawa.accelerate(); //speed is 23
        kawa.accelerate();
        kawa.accelerate();
        kawa.accelerate();
        kawa.accelerate();
        kawa.accelerate();
        kawa.accelerate();
        kawa.accelerate();
        // decelerate
        kawa.decelerate();
        kawa.decelerate();
        kawa.decelerate();
        kawa.decelerate();
        kawa.decelerate();
        kawa.decelerate();
        kawa.decelerate();
        kawa.decelerate();
        kawa.decelerate();
        kawa.decelerate();
        kawa.decelerate();
        kawa.decelerate();
        kawa.decelerate();
        kawa.decelerate();
        kawa.decelerate();
        kawa.decelerate();
        kawa.decelerate();
        kawa.decelerate();
        kawa.decelerate();
        kawa.decelerate();
        kawa.decelerate();
        kawa.decelerate();
        kawa.decelerate();
        kawa.decelerate();
        kawa.decelerate();
        kawa.decelerate();
        kawa.decelerate();
        kawa.decelerate();
        kawa.decelerate();
        kawa.decelerate();


        assertEquals(0, kawa.getSpeed());
        assertEquals(0, kawa.getGearNumber());
    }

}