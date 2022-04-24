package tdd;

public class Bike {
    private boolean state;
    private int gear;
    private int gearNumber;
    private int speed;
    private int decelerationSpeed;
    private int speedRate;
    private int decelerationSpeedRate;

    public void isOn(boolean type) {
        state = type;
    }

    public boolean checkState() {
        return state;
    }

    public void engageGear(int type) {
        gear = type;

    }

    public void disEngageGear(int type) {
        gear = type;
    }

    public int checkGear() {
        return gear;
    }

    public void accelerate(int speed) {
        if (speed >= 0 && speed <= 20) {
            this.speed = speed;
        }
        if (speed > 20 && speed <= 30) {
            this.speed = speed;
        }
        if (speed > 30 && speed <= 40) {
            this.speed = speed;
        }
        if (speed > 40) {
            this.speed = speed;
        }
        // set gear
        if (speed >= 0 && speed <= 20) {
            gearNumber = 1;
        }
        if (speed > 20 && speed <= 30) {
            gearNumber = 2;
        }
        if (speed > 30 && speed <= 40) {
            gearNumber = 3;
        }
        if (speed > 40) {
            gearNumber = 4;
        }
    }

    public int getGearNumber() {
        return gearNumber;
    }

    public void decelerate(int decelerationSpeed) {
        if (decelerationSpeed > 40) {
                this.decelerationSpeed = decelerationSpeed;
        }
        if (decelerationSpeed > 30 && decelerationSpeed <= 40) {
            this.decelerationSpeed = decelerationSpeed;
        }
        if (decelerationSpeed > 20 && decelerationSpeed <= 30) {
            this.decelerationSpeed = decelerationSpeed;
        }
        if (decelerationSpeed >= 0 && decelerationSpeed <= 20) {
            this.decelerationSpeed = decelerationSpeed;
        }

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

    public int getSpeedRate() {
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

    public int getDecelerationSpeedRate() {
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
}