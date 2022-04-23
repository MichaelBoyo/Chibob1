package tdd;

public class Bike {
    private boolean state;
    private boolean gear;
    private int gearNumber;


    public void isOn(boolean type) {
        state = type;
    }
    public boolean checkState(){
        return state;
    }
    public void isOff(boolean type) {
        state = type;
    }
    public void engageGear(boolean type) {
        gear = type;

    }
    public void disEngageGear(boolean type) {
        gear = type;
    }
    public boolean checkGear() {
        return gear;
    }
    public void accelerate(int speed) {
        if(speed >= 0 && speed <= 20){
            gearNumber = 1;}
        if(speed > 20 && speed <= 30){
            gearNumber = 2;}
        if(speed > 30 && speed <= 40){
            gearNumber = 3;}
        if(speed > 40 && speed <= 300){
            gearNumber = 4;}
    }
    public int getGearNumber() {
        return gearNumber;
    }
    public void decelerate(int speed) {
        if(speed > 30 && speed <= 40){
            gearNumber = 3;}
        if(speed > 20 && speed <= 30){
            gearNumber = 2;}
        if(speed >= 0 && speed <= 20){
            gearNumber = 1;}
    }



}
