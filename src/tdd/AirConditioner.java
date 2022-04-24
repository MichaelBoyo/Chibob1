package tdd;

public class AirConditioner {
    private boolean state;
    private boolean temp;

    private int tempValue;

    public void putOn(boolean type) {
        state = type;

    }

    public boolean getState() {
        return state;
    }

    public void putOff(boolean type) {
        state = type;
    }

    public void increaseTemp(boolean type) {
        temp = type;
    }

    public boolean getTemp() {
        return temp;
    }

    public void decreaseTemp(boolean type) {
        temp = type;
    }

    public void increaseTempValue(int value) {
        if (value > 30) {
            tempValue = 30;
        }
    }

    public int getTempValue() {
        return tempValue;
    }

    public void reduceTempValue(int value) {
        if (value < 16) {
            tempValue = 16;
        }
    }
}
