package tdd;

public class Bike {
    private boolean status;
    private boolean gear;
    public boolean acceleration;
    public int speed = 0;

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

    public boolean getAccelerateStatus() {
        return acceleration;
    }

    public int getSpeed() {
       return speed;
    }

    public int getGearNumber() {
        int gearNumber = 0;
        if(speed >=1 && speed <= 20)  gearNumber= 1;
        if(speed >=21 && speed <= 30)  gearNumber= 2;
        if(speed >=31 && speed <= 40)  gearNumber= 3;
        if(speed >=41)  gearNumber= 4;
        return gearNumber;
    }

    public void accelerate() {

        if(speed >=0 && speed <=20){speed = speed+ 1;}
        if(speed >=21 && speed <= 30){speed = speed+ 2;}
        if(speed >=31 && speed <= 40){speed = speed+ 3;}
        if(speed >=41){this.speed = speed+ 4;}

    }

    public void decelerate() {
        if(speed >=0 && speed <=20){speed = speed- 1;}
        if(speed >=21 && speed <= 30){speed = speed- 2;}
        if(speed >=31 && speed <= 40){speed = speed- 3;}
        if(speed >=41){this.speed = speed- 4;}
    }
}