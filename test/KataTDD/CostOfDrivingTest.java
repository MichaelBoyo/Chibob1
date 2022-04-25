package KataTDD;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CostOfDrivingTest {
    @Test
    public void CostOfDriving1Test(){
        Cost drive = new Cost();
        double drivingDistance = drive.distance(900.5);
        assertEquals(125.0, drivingDistance);
    }
}
