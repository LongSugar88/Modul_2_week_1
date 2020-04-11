package FanClass;

public class FanClass {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on;
    private double radius = 5.0;
    private String color = "blue";

    public FanClass() {

    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOnOff(boolean status) {
        this.on = status;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return this.speed;
    }

    public boolean isOn() {
        return this.on;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    @Override
    public String toString() {
            if (isOn()) {
                return "Speed :" + this.speed + " radius: " + this.radius + " color: " + this.color + " fan is on";
            } else
                return "radius: " + this.radius + " color: " + this.color + " fan is off";
    }
}
//public class Fan1 extends FanClass{
//    @Override
//public String getColor(){
//        return "Long đẹp trai";
//    }
//        }