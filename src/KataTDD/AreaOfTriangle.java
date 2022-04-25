package KataTDD;

import static java.lang.Math.round;

public class AreaOfTriangle {
    public int sides(double PointX1, double PointY1, double PointX2, double PointY2, double PointX3, double PointY3) {
        double area = (PointX1 * (PointY2 - PointY3) + PointX2 * (PointY3 - PointY1) + PointX3 * (PointY1 - PointY2)) / 2;
        return (int) Math.abs(round(area));

    }
}
