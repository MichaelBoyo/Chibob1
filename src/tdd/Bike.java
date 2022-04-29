package tdd;

public class Bike {
    private boolean status;
    private boolean gear;
    private int speed;
    private boolean accelerate;
    private int gearNumber;

    private int decelerationSpeed;
    private int speedRate;
    private int decelerationSpeedRate;

    public void isOn(boolean type) {
        status = type;
    }

    public boolean checkStatus() {
        return status;
    }

    public void engageGear(boolean type) {
        gear = type;

    }


    public boolean checkGearStatus() {
        return gear;
    }

    public void accelerate(boolean type) {
        if (accelerate) speed =1;

        if (accelerate && speed >= 0 && speed <= 20)
            gearNumber = 1;
        speed = speed +1;

        if (accelerate && speed > 20 && speed <= 30) {
            gearNumber = 2;
        }
        if (accelerate && speed > 30 && speed <= 40) {
            gearNumber = 3;
        }
        if (accelerate && speed > 40) {
            gearNumber = 4;
        }
        accelerate = type;
    }
    public int getSpeed() {

        return speed;
    }


    public int getGearNumber() {
        return gearNumber;
    }

    public int getIncrement() {
        int speed = 0;
        if (gearNumber == 1) {
            speedRate = speed + 1;
        }
        if (gearNumber == 2) {
            speedRate = speed + 2;
        }
        if (gearNumber == 3) {
            speedRate = speed + 3;
        }
        if (gearNumber == 4) {
            speedRate = speed + 4;
        }
        return speedRate;
    }

    public void decelerate(int decelerationSpeed) {
        this.decelerationSpeed = decelerationSpeed;

        if (decelerationSpeed > 40) {
            gearNumber = 4;
        }
        if (decelerationSpeed > 30 && decelerationSpeed <= 40) {
            gearNumber = 3;
        }
        if (decelerationSpeed > 20 && decelerationSpeed <= 30) {
            gearNumber = 2;
        }
        if (decelerationSpeed >= 0 && decelerationSpeed <= 20) {
            gearNumber = 1;
        }
    }

    public int getDecrement() {
        if (gearNumber == 1) {
            decelerationSpeedRate = decelerationSpeed - 1;
        }
        if (gearNumber == 2) {
            decelerationSpeedRate = decelerationSpeed - 2;
        }
        if (gearNumber == 3) {
            decelerationSpeedRate = decelerationSpeed - 3;
        }
        if (gearNumber == 4) {
            decelerationSpeedRate = decelerationSpeed - 4;
        }
        return decelerationSpeedRate;
    }


    public boolean getAccelerationStatus() {
        return accelerate;
    }
}