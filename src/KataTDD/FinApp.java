package KataTDD;

import static java.lang.Math.round;

public class FinApp {
    public int monthlySavings(int MonthlyAmount) {
        double month1 = MonthlyAmount * 1.00417;
        double month2 = (MonthlyAmount + month1) * 1.00417;
        double month3 = (MonthlyAmount + month2) * 1.00417;
        double month4 = (MonthlyAmount + month3) * 1.00417;
        double month5 = (MonthlyAmount + month4) * 1.00417;
        return (int) round(((MonthlyAmount + month5) * 1.00417));
    }
}
