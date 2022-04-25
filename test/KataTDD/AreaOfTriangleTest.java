package KataTDD;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AreaOfTriangleTest {
    @Test
    public void areaOfTriangleTest(){
        AreaOfTriangle isoscelesTriangle = new AreaOfTriangle();
        assertEquals(34.0, isoscelesTriangle.sides(1.5,-3.4,4.6,5,9.5,-3.4));
    }
}
