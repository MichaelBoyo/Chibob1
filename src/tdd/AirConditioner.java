package tdd;

public class AirConditioner {
    private boolean status;
    private int temp;

    public void putOn(boolean isOn) {
        status = isOn;

    }

    public boolean getStatus() {
        return status;
    }

    public void increaseTemp(int pressUp) {
        temp = pressUp + 16;
        if (pressUp > 14){
            temp = 30;
        }
    }
    public void decreaseTemp(int pressDown) {
        temp = temp - pressDown;
        if (pressDown > 14) {
            temp = 16;
        }
    }
    public int getTemp() {
        return temp;
    }
}