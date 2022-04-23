package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
    @Test
    public void newBikeCanBeCreatedTest() {
        Bike okada = new Bike();
    }

    @Test
    public void theBikeCanBePutOnTest() {
        Bike bajaj = new Bike();
        bajaj.isOn(true);
        assertTrue(bajaj.checkState());
    }

    @Test
    public void theBikeCanBePutOffTest() {
        Bike bajaj = new Bike();
        bajaj.isOff(true);
        assertTrue(bajaj.checkState());
    }

    @Test
    public void engageGear() {
        Bike suzu = new Bike();
        suzu.isOn(true);
        suzu.engageGear(true);
        assertTrue(suzu.checkGear());
    }

    @Test
    public void accelerateGear1Test() {
        Bike kawa = new Bike();
        kawa.isOn(true);
        kawa.engageGear(true);
        kawa.accelerate(20);
        assertEquals(1, kawa.getGearNumber());
    }

    @Test
    public void accelerateGear2Test() {
        Bike boxer = new Bike();
        boxer.isOn(true);
        boxer.engageGear(true);
        boxer.accelerate(30);
        assertEquals(2, boxer.getGearNumber());
    }

    @Test
    public void accelerateGear3Test() {
        Bike yamaha = new Bike();
        yamaha.isOn(true);
        yamaha.engageGear(true);
        yamaha.accelerate(40);
        assertEquals(3, yamaha.getGearNumber());
    }

    @Test
    public void accelerateGear4Test() {
        Bike tokumbo = new Bike();
        tokumbo.isOn(true);
        tokumbo.engageGear(true);
        tokumbo.accelerate(70);
        assertEquals(4, tokumbo.getGearNumber());
    }

    @Test
    public void decelerateToGear3Test() {
        Bike jinCheng = new Bike();
        jinCheng.isOn(true);
        jinCheng.engageGear(true);
        jinCheng.accelerate(65);
        jinCheng.decelerate(35);
        assertEquals(3, jinCheng.getGearNumber());
    }

    @Test
    public void decelerateToGear2Test() {
        Bike powerBike = new Bike();
        powerBike.isOn(true);
        powerBike.engageGear(true);
        powerBike.accelerate(65);
        powerBike.decelerate(24);
        assertEquals(2, powerBike.getGearNumber());
    }

    @Test
    public void decelerateToGear1Test() {
        Bike superBike = new Bike();
        superBike.isOn(true);
        superBike.engageGear(true);
        superBike.accelerate(65);
        superBike.decelerate(0);
        assertEquals(1, superBike.getGearNumber());
    }

    @Test
    public void disEngageGearTest() {
        Bike speedBike = new Bike();
        speedBike.isOn(true);
        speedBike.engageGear(true);
        speedBike.accelerate(65);
        speedBike.decelerate(0);
        speedBike.disEngageGear(true);
        assertTrue(speedBike.checkGear());
    }

    @Test
    public void putOffTest() {
        Bike goBike = new Bike();
        goBike.isOn(true);
        goBike.engageGear(true);
        goBike.accelerate(65);
        goBike.decelerate(0);
        goBike.disEngageGear(true);
        goBike.isOff(true);
        assertTrue(goBike.checkState());
    }

}