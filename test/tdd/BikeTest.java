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
    public void accelerateGear1Test() {
        Bike kawa = new Bike();                         // given I have a bike
        kawa.isOn(true);                           // and I put it on
        kawa.engageGear(true);                        // and I engage gear
        kawa.accelerate(20);                       // when I accelerate and my speed is between 0 and 20
        assertEquals(1, kawa.getGearNumber());  // assert that the bike enters gear 1
        assertEquals(21, kawa.getIncrement());  // assert that my speed changes by 1 point
    }

    @Test
    public void accelerateGear2Test() {
        Bike boxer = new Bike();                         // given I have a bike
        boxer.isOn(true);                           // and I put it on
        boxer.engageGear(true);                        // and gear is engaged
        boxer.accelerate(20);                      // and I have accelerated to speed 20
        boxer.accelerate(30);                      // when I accelerate above 20 and my speed is between 21 and 30
        assertEquals(2, boxer.getGearNumber());  // assert that the bike engages gear 2
        assertEquals(32, boxer.getIncrement());  // assert that my speed increases by 2
    }

    @Test
    public void accelerateGear3Test() {
        Bike yamaha = new Bike();                          // given I have a bike
        yamaha.isOn(true);                            // and I put it on
        yamaha.engageGear(true);                         // and gear is engaged
        yamaha.accelerate(20);                      // and I have accelerated to speed 20
        yamaha.accelerate(30);                      // and I accelerate to speed 30
        yamaha.accelerate(40);                      // when I accelerate above 30 and my speed is between 31 and 40
        assertEquals(3, yamaha.getGearNumber());  // assert that the bike uses gear 3
        assertEquals(43, yamaha.getIncrement());  // assert that my speed increases by 3
    }

    @Test
    public void accelerateGear4Test() {
        Bike tokumbo = new Bike();
        tokumbo.isOn(true);
        tokumbo.engageGear(true);
        tokumbo.accelerate(20);                      // and I have accelerated to speed 20
        tokumbo.accelerate(30);                      // and I accelerate to speed 30
        tokumbo.accelerate(40);                      // and I accelerate to speed 40
        tokumbo.accelerate(41);                      // when my speed is between 41 and above
        assertEquals(4, tokumbo.getGearNumber());  // assert that the bike uses gear 4
        assertEquals(45, tokumbo.getIncrement());  // assert that my speed increases by 4
    }

    @Test
    public void decelerateToGear4Test() {
        Bike jinCheng = new Bike();
        jinCheng.isOn(true);
        jinCheng.engageGear(true);
        jinCheng.accelerate(41);                 // and I accelerate up to 70
        jinCheng.decelerate(41);        // when decelerating and speed is still above 40
        assertEquals(4, jinCheng.getGearNumber());   // assert that the bike remains on gear 4
        assertEquals(37, jinCheng.getDecrement()); // assert that the speed decreases by 4
    }

    @Test
    public void decelerateToGear3Test() {
        Bike jinCheng = new Bike();
        jinCheng.isOn(true);
        jinCheng.engageGear(true);
        jinCheng.accelerate(41);
        jinCheng.decelerate(41);        // and I decelerate to 41
        jinCheng.decelerate(37);              // when decelerating and speed is between 31 and 40
        assertEquals(3, jinCheng.getGearNumber());   // assert that the bike is on gear 3
        assertEquals(34, jinCheng.getDecrement()); // assert that the speed decreases by 3
    }

    @Test
    public void decelerateToGear2Test() {
        Bike powerBike = new Bike();
        powerBike.isOn(true);
        powerBike.engageGear(true);
        powerBike.accelerate(41);
        powerBike.decelerate(41);            // and I decelerate to 41
        powerBike.decelerate(37);              // and also decelerate between 31 and 40
        powerBike.decelerate(28);                 // when decelerating and speed is between 21 and 30
        assertEquals(2, powerBike.getGearNumber());      // assert that the bike is on gear 2
        assertEquals(26, powerBike.getDecrement()); // assert that the speed decreases by 2
    }

    @Test
    public void decelerateToGear1Test() {
        Bike superBike = new Bike();
        superBike.isOn(true);
        superBike.engageGear(true);
        superBike.accelerate(41);
        superBike.decelerate(41);            // and I decelerate to 41
        superBike.decelerate(37);              // and also decelerate between 31 and 40
        superBike.decelerate(28);                 //  and also decelerate between 21 and 30
        superBike.decelerate(20);                  // when decelerating and speed is between 0 and 20
        assertEquals(1, superBike.getGearNumber());       // assert that the bike is on gear 2
        assertEquals(19, superBike.getDecrement()); // assert that the speed decreases by 1
    }

    @Test
    public void disEngageGearTest() {
        Bike speedBike = new Bike();
        speedBike.isOn(true);
        speedBike.engageGear(true);
        speedBike.accelerate(78);              // and I accelerate above 41
        speedBike.decelerate(0);     //and I decelerate back to 0
        speedBike.engageGear(false);             // when i disengage gear
        assertFalse(speedBike.checkGearStatus()); // assert that the gear disengages
    }

    @Test
    public void putOffTest()

    {
        Bike goBike = new Bike();
        goBike.isOn(true);
        goBike.engageGear(true);
        goBike.accelerate(65);
        goBike.decelerate(0);
        goBike.engageGear(false);            // given the gear is disengaged
        goBike.isOn(false);                 // when I turn off the bike
        assertFalse(goBike.checkStatus());        // assert that it has turned off
    }
}