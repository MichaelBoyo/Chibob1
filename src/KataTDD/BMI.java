package KataTDD;

import static java.lang.Math.round;

public class BMI {

    public double HeightWeight(double weight, int height) {
        double WeightInKg = weight * 0.45359237;
        double HeightInMeters = height * 0.0254;

        return round(WeightInKg / Math.pow(HeightInMeters, 2));
    }
}
