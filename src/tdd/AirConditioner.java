package tdd;

public class AirConditioner {
    private boolean status;
    private int temp;

    public void putOn(boolean type) {
        status = type;

    }

    public boolean getStatus() {
        return status;
    }

    public void increaseTemp(int value) {
        if (value > 30) {
            temp = 30;
        }
        if (value >= 16 && value <= 30) {
            temp = value;
        }
    }

    public void decreaseTemp(int value) {
        if (value < 16) {
            temp = 16;
        }
        if (value >= 16 && value <= 30) {
            temp = value;
        }
    }

    public int getTemp() {
        return temp;
    }
}