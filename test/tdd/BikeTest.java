package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
    @Test
    public void theBikeCanBePutOnTest() {
        Bike bajaj = new Bike();             // given I have a bike
        bajaj.isOn(true);               // when I turn on the bike
        assertTrue(bajaj.checkState());      // assert that the bike is on
    }
    @Test
    public void theBikeCanBePutOffTest() {
        Bike bajaj = new Bike();               // given I have a bike
        bajaj.isOn(true);                 // and it is turned on
        bajaj.isOn(false);                // when I put off the bike
        assertFalse(bajaj.checkState());       // assert that the bike is off
    }
    @Test
    public void engageGear() {
        Bike suzu = new Bike();                         // given I have a bike
        suzu.isOn(true);                           // when I put it on
        suzu.engageGear(0);                        // and I engage gear
        assertEquals(0, suzu.checkGear());      // assert that the gear is initially  0
    }
    @Test
    public void accelerateGear1Test() {
        Bike kawa = new Bike();                         // given I have a bike
        kawa.isOn(true);                           // and I put it on
        kawa.engageGear(0);                        // and I engage gear
        kawa.accelerate(9);                       // when I accelerate and my speed is between 0 and 20
        assertEquals(1, kawa.getGearNumber());  // assert that the bike enters gear 1
        assertEquals(10, kawa.getSpeedRate());  // assert that my speed changes by 1 point

    }
    @Test
    public void accelerateGear2Test() {
        Bike boxer = new Bike();                         // given I have a bike
        boxer.isOn(true);                           // and I put it on
        boxer.engageGear(0);                        // and gear is engaged
        boxer.accelerate(30);                      // when I accelerate above 20 and my speed is between 21 and 30
        assertEquals(2, boxer.getGearNumber());  // assert that the bike engages gear 2
        assertEquals(32, boxer.getSpeedRate());  // assert that my speed changes by 2 points
    }
    @Test
    public void accelerateGear3Test() {
        Bike yamaha = new Bike();                          // given I have a bike
        yamaha.isOn(true);                            // and I put it on
        yamaha.engageGear(0);                         // and gear is engaged
        yamaha.accelerate(40);                      // when my speed is between 31 and 40
        assertEquals(3, yamaha.getGearNumber());  // assert that the bike uses gear 3
        assertEquals(43, yamaha.getSpeedRate());  // assert that my speed changes by 3 points
    }
    @Test
    public void accelerateGear4Test() {
        Bike tokumbo = new Bike();
        tokumbo.isOn(true);
        tokumbo.engageGear(0);
        tokumbo.accelerate(70);                      // when my speed is between 41 and above
        assertEquals(4, tokumbo.getGearNumber());  // assert that the bike uses gear 4
        assertEquals(74, tokumbo.getSpeedRate());  // assert that my speed changes by 4 points
    }
    @Test
    public void decelerateToGear4Test() {
        Bike jinCheng = new Bike();
        jinCheng.isOn(true);
        jinCheng.engageGear(0);
        jinCheng.accelerate(70);
        jinCheng.decelerate(44);        // when decelerating and speed is still above 42
        assertEquals(4, jinCheng.getGearNumber());   // assert that the bike remains on gear 4
        assertEquals(40, jinCheng.getDecelerationSpeedRate()); // assert that the speed decreases by 4
    }
    @Test
    public void decelerateToGear3Test() {
        Bike jinCheng = new Bike();
        jinCheng.isOn(true);
        jinCheng.engageGear(0);
        jinCheng.accelerate(65);
        jinCheng.decelerate(35);              // when decelerating and speed is between 31 and 40
        assertEquals(3, jinCheng.getGearNumber());   // assert that the bike is on gear 3
        assertEquals(32, jinCheng.getDecelerationSpeedRate()); // assert that the speed decreases by 3
    }
    @Test
    public void decelerateToGear2Test() {
        Bike powerBike = new Bike();
        powerBike.isOn(true);
        powerBike.engageGear(0);
        powerBike.accelerate(60);
        powerBike.decelerate(24);                 // when decelerating and speed is between 21 and 30
        assertEquals(2, powerBike.getGearNumber());      // assert that the bike is on gear 2
        assertEquals(22, powerBike.getDecelerationSpeedRate()); // assert that the speed decreases by 2
    }
    @Test
    public void decelerateToGear1Test() {
        Bike superBike = new Bike();
        superBike.isOn(true);
        superBike.engageGear(0);
        superBike.accelerate(65);
        superBike.decelerate(15);                  // when decelerating and speed is between 0 and 20
        assertEquals(1, superBike.getGearNumber());       // assert that the bike is on gear 2
        assertEquals(14, superBike.getDecelerationSpeedRate()); // assert that the speed decreases by 1
    }
    @Test
    public void disEngageGearTest() {
        Bike speedBike = new Bike();
        speedBike.isOn(true);
        speedBike.engageGear(0);
        speedBike.accelerate(65);
        speedBike.decelerate(0);     //given the bike has stopped
        speedBike.disEngageGear(0);             // when i disengage gear
        assertEquals(0, speedBike.checkGear()); // assert that the gear disengages
    }
    @Test
    public void putOffTest() {
        Bike goBike = new Bike();
        goBike.isOn(true);
        goBike.engageGear(0);
        goBike.accelerate(65);
        goBike.decelerate(0);
        goBike.disEngageGear(0);            // given the gear is disengaged
        goBike.isOn(false);                 // when I turn off the bike
        assertFalse(goBike.checkState());        // assert that it has turned off
    }
}