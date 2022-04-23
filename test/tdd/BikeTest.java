package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
    @Test
    public void newBikeCanBeCreatedTest(){
        Bike okada = new Bike();
    }
    @Test
    public void theBikeCanBePutOnTest(){
        Bike bajaj = new Bike();
        bajaj.isOn(true);
        assertTrue(bajaj.checkState());
    }
    @Test
    public void theBikeCanBePutOffTest(){
        Bike bajaj = new Bike();
        bajaj.isOff(true);
        assertTrue(bajaj.checkState());
    }
    @Test
    public void engageGear(){
        Bike bajaj = new Bike();
        bajaj.isOn(true);
        bajaj.engageGear(true);
        assertTrue(bajaj.checkGear());
    }

    @Test
    public void AccelerateGear1Test() {
        Bike nike = new Bike();
        nike.isOn(true);
        nike.engageGear(true);
        nike.accelerate(20);
        assertEquals(1, nike.getGearNumber());
    }
    @Test
    public void AccelerateGear2Test() {
        Bike nike = new Bike();
        nike.isOn(true);
        nike.engageGear(true);
        nike.accelerate(30);
        assertEquals(2, nike.getGearNumber());
    }
    @Test
    public void AccelerateGear3Test() {
        Bike nike = new Bike();
        nike.isOn(true);
        nike.engageGear(true);
        nike.accelerate(40);
        assertEquals(3, nike.getGearNumber());
    }
    @Test
    public void AccelerateGear4Test() {
        Bike nike = new Bike();
        nike.isOn(true);
        nike.engageGear(true);
        nike.accelerate(70);
        assertEquals(4, nike.getGearNumber());
    }
    @Test
    public void DecelerateBackToGear3Test() {
        Bike nike = new Bike();
        nike.isOn(true);
        nike.engageGear(true);
        nike.accelerate(65);
        nike.decelerate(35);
        assertEquals(3, nike.getGearNumber());
    }
    @Test
    public void DecelerateBackToGear2Test() {
        Bike nike = new Bike();
        nike.isOn(true);
        nike.engageGear(true);
        nike.accelerate(65);
        nike.decelerate(24);
        assertEquals(2, nike.getGearNumber());
    }
    @Test
    public void DecelerateBackToGear1Test() {
        Bike nike = new Bike();
        nike.isOn(true);
        nike.engageGear(true);
        nike.accelerate(65);
        nike.decelerate(0);
        assertEquals(1, nike.getGearNumber());
    }
    @Test
    public void disEngageGearTest() {
        Bike nike = new Bike();
        nike.isOn(true);
        nike.engageGear(true);
        nike.accelerate(65);
        nike.decelerate(0);
        nike.disEngageGear(true);
        assertTrue(nike.checkGear());
    }
    @Test
    public void putOffTest() {
        Bike nike = new Bike();
        nike.isOn(true);
        nike.engageGear(true);
        nike.accelerate(65);
        nike.decelerate(0);
        nike.disEngageGear(true);
        nike.isOff(true);
        assertTrue(nike.checkState());
    }

}